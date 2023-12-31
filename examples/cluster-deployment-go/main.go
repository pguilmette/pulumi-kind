package main

import (
	kind "github.com/pguilmette/pulumi-kind/sdk/kind"
	appsv1 "github.com/pulumi/pulumi-kubernetes/sdk/v3/go/kubernetes/apps/v1"
	corev1 "github.com/pulumi/pulumi-kubernetes/sdk/v3/go/kubernetes/core/v1"
	metav1 "github.com/pulumi/pulumi-kubernetes/sdk/v3/go/kubernetes/meta/v1"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

func main() {
	pulumi.Run(func(ctx *pulumi.Context) error {

		cluster, _ := kind.NewCluster(ctx, "pulumi-cluster", &kind.ClusterArgs{
			KindConfig: kind.ClusterKindConfigArgs{
				ApiVersion: pulumi.String("kind.x-k8s.io/v1alpha4"),
				Kind:       pulumi.String("Cluster"),
				Nodes: kind.ClusterKindConfigNodeArray{
					kind.ClusterKindConfigNodeArgs{
						Role: pulumi.String("worker"),
					},
					kind.ClusterKindConfigNodeArgs{
						Role: pulumi.String("control-plane"),
					},
				},
			},
		})

		appLabels := pulumi.StringMap{
			"app": pulumi.String("nginx"),
		}
		_, err := appsv1.NewDeployment(ctx, "app-dep", &appsv1.DeploymentArgs{
			Spec: appsv1.DeploymentSpecArgs{
				Selector: &metav1.LabelSelectorArgs{
					MatchLabels: appLabels,
				},
				Replicas: pulumi.Int(1),
				Template: &corev1.PodTemplateSpecArgs{
					Metadata: &metav1.ObjectMetaArgs{
						Labels: appLabels,
					},
					Spec: &corev1.PodSpecArgs{
						Containers: corev1.ContainerArray{
							corev1.ContainerArgs{
								Name:  pulumi.String("nginx"),
								Image: pulumi.String("nginx"),
							}},
					},
				},
			},
		},
			pulumi.DependsOn([]pulumi.Resource{cluster}),
		)

		if err != nil {
			return err
		}

		ctx.Export("name", cluster.Name)

		return nil
	})
}
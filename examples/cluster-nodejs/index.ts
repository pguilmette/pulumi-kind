// @ts-ignore because it's provided by yarn link @pguilmette/pulumi-kind
import * as kind from "@pguilmette/pulumi-kind";

let cluster = new kind.Cluster("pulumi-cluster-alone-nodejs", {
    kindConfig: {
        kind: "Cluster",
        apiVersion: "kind.x-k8s.io/v1alpha4",
        nodes: [
            {
                role: "control-plane"
            },{
                role: "worker"
            }
        ]
    },
    waitForReady: true
});
// noinspection JSUnusedGlobalSymbols
export let clusterName = cluster.name;
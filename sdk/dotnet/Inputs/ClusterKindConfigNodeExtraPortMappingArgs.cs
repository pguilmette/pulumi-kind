// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Kind.Inputs
{

    public sealed class ClusterKindConfigNodeExtraPortMappingArgs : global::Pulumi.ResourceArgs
    {
        [Input("containerPort")]
        public Input<int>? ContainerPort { get; set; }

        [Input("hostPort")]
        public Input<int>? HostPort { get; set; }

        [Input("listenAddress")]
        public Input<string>? ListenAddress { get; set; }

        [Input("protocol")]
        public Input<string>? Protocol { get; set; }

        public ClusterKindConfigNodeExtraPortMappingArgs()
        {
        }
        public static new ClusterKindConfigNodeExtraPortMappingArgs Empty => new ClusterKindConfigNodeExtraPortMappingArgs();
    }
}

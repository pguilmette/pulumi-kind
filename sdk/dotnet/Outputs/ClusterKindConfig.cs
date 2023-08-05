// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Kind.Outputs
{

    [OutputType]
    public sealed class ClusterKindConfig
    {
        public readonly string ApiVersion;
        public readonly ImmutableArray<string> ContainerdConfigPatches;
        public readonly string Kind;
        public readonly Outputs.ClusterKindConfigNetworking? Networking;
        public readonly ImmutableArray<Outputs.ClusterKindConfigNode> Nodes;

        [OutputConstructor]
        private ClusterKindConfig(
            string apiVersion,

            ImmutableArray<string> containerdConfigPatches,

            string kind,

            Outputs.ClusterKindConfigNetworking? networking,

            ImmutableArray<Outputs.ClusterKindConfigNode> nodes)
        {
            ApiVersion = apiVersion;
            ContainerdConfigPatches = containerdConfigPatches;
            Kind = kind;
            Networking = networking;
            Nodes = nodes;
        }
    }
}
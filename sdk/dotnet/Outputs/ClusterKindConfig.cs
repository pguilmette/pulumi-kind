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
        public readonly ImmutableDictionary<string, string>? FeatureGates;
        public readonly string Kind;
        public readonly Outputs.ClusterKindConfigNetworking? Networking;
        public readonly ImmutableArray<Outputs.ClusterKindConfigNode> Nodes;
        public readonly ImmutableDictionary<string, string>? RuntimeConfig;

        [OutputConstructor]
        private ClusterKindConfig(
            string apiVersion,

            ImmutableArray<string> containerdConfigPatches,

            ImmutableDictionary<string, string>? featureGates,

            string kind,

            Outputs.ClusterKindConfigNetworking? networking,

            ImmutableArray<Outputs.ClusterKindConfigNode> nodes,

            ImmutableDictionary<string, string>? runtimeConfig)
        {
            ApiVersion = apiVersion;
            ContainerdConfigPatches = containerdConfigPatches;
            FeatureGates = featureGates;
            Kind = kind;
            Networking = networking;
            Nodes = nodes;
            RuntimeConfig = runtimeConfig;
        }
    }
}

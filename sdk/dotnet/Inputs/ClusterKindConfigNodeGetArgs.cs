// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Kind.Inputs
{

    public sealed class ClusterKindConfigNodeGetArgs : Pulumi.ResourceArgs
    {
        [Input("extraMounts")]
        private InputList<Inputs.ClusterKindConfigNodeExtraMountGetArgs>? _extraMounts;
        public InputList<Inputs.ClusterKindConfigNodeExtraMountGetArgs> ExtraMounts
        {
            get => _extraMounts ?? (_extraMounts = new InputList<Inputs.ClusterKindConfigNodeExtraMountGetArgs>());
            set => _extraMounts = value;
        }

        [Input("extraPortMappings")]
        private InputList<Inputs.ClusterKindConfigNodeExtraPortMappingGetArgs>? _extraPortMappings;
        public InputList<Inputs.ClusterKindConfigNodeExtraPortMappingGetArgs> ExtraPortMappings
        {
            get => _extraPortMappings ?? (_extraPortMappings = new InputList<Inputs.ClusterKindConfigNodeExtraPortMappingGetArgs>());
            set => _extraPortMappings = value;
        }

        [Input("image")]
        public Input<string>? Image { get; set; }

        [Input("kubeadmConfigPatches")]
        private InputList<string>? _kubeadmConfigPatches;
        public InputList<string> KubeadmConfigPatches
        {
            get => _kubeadmConfigPatches ?? (_kubeadmConfigPatches = new InputList<string>());
            set => _kubeadmConfigPatches = value;
        }

        [Input("role")]
        public Input<string>? Role { get; set; }

        public ClusterKindConfigNodeGetArgs()
        {
        }
    }
}
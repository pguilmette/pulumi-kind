// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Kind.Inputs
{

    public sealed class ClusterKindConfigNodeArgs : Pulumi.ResourceArgs
    {
        [Input("extraMounts")]
        private InputList<Inputs.ClusterKindConfigNodeExtraMountArgs>? _extraMounts;
        public InputList<Inputs.ClusterKindConfigNodeExtraMountArgs> ExtraMounts
        {
            get => _extraMounts ?? (_extraMounts = new InputList<Inputs.ClusterKindConfigNodeExtraMountArgs>());
            set => _extraMounts = value;
        }

        [Input("extraPortMappings")]
        private InputList<Inputs.ClusterKindConfigNodeExtraPortMappingArgs>? _extraPortMappings;
        public InputList<Inputs.ClusterKindConfigNodeExtraPortMappingArgs> ExtraPortMappings
        {
            get => _extraPortMappings ?? (_extraPortMappings = new InputList<Inputs.ClusterKindConfigNodeExtraPortMappingArgs>());
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

        public ClusterKindConfigNodeArgs()
        {
        }
    }
}
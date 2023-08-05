// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Kind.Inputs
{

    public sealed class ClusterKindConfigNodeExtraMountArgs : global::Pulumi.ResourceArgs
    {
        [Input("containerPath")]
        public Input<string>? ContainerPath { get; set; }

        [Input("hostPath")]
        public Input<string>? HostPath { get; set; }

        [Input("propagation")]
        public Input<string>? Propagation { get; set; }

        [Input("readOnly")]
        public Input<bool>? ReadOnly { get; set; }

        [Input("selinuxRelabel")]
        public Input<bool>? SelinuxRelabel { get; set; }

        public ClusterKindConfigNodeExtraMountArgs()
        {
        }
        public static new ClusterKindConfigNodeExtraMountArgs Empty => new ClusterKindConfigNodeExtraMountArgs();
    }
}

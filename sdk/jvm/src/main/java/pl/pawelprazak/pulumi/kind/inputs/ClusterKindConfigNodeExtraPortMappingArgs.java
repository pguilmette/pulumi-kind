// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package pl.pawelprazak.pulumi.kind.inputs;

import javax.annotation.Nullable;
import java.util.Objects;
import java.util.Optional;
import java.util.Map;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import io.pulumi.core.*;
import io.pulumi.core.internal.annotations.*;
import pl.pawelprazak.pulumi.kind.Utilities;


public final class ClusterKindConfigNodeExtraPortMappingArgs extends io.pulumi.resources.ResourceArgs {

    public static final ClusterKindConfigNodeExtraPortMappingArgs Empty = ClusterKindConfigNodeExtraPortMappingArgs.builder().build();

    @InputImport(name="containerPort")
    private final @Nullable Input<Integer> containerPort;

    public Input<Integer> getContainerPort() {
        return Input.ofNullable(this.containerPort);
    }

    @InputImport(name="hostPort")
    private final @Nullable Input<Integer> hostPort;

    public Input<Integer> getHostPort() {
        return Input.ofNullable(this.hostPort);
    }

    @InputImport(name="listenAddress")
    private final @Nullable Input<String> listenAddress;

    public Input<String> getListenAddress() {
        return Input.ofNullable(this.listenAddress);
    }

    @InputImport(name="protocol")
    private final @Nullable Input<String> protocol;

    public Input<String> getProtocol() {
        return Input.ofNullable(this.protocol);
    }

    public ClusterKindConfigNodeExtraPortMappingArgs(
        @Nullable Input<Integer> containerPort,
        @Nullable Input<Integer> hostPort,
        @Nullable Input<String> listenAddress,
        @Nullable Input<String> protocol) {
        this.containerPort = containerPort;
        this.hostPort = hostPort;
        this.listenAddress = listenAddress;
        this.protocol = protocol;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClusterKindConfigNodeExtraPortMappingArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Integer> containerPort;
        private @Nullable Input<Integer> hostPort;
        private @Nullable Input<String> listenAddress;
        private @Nullable Input<String> protocol;

        public Builder() {
    	      // Empty
        }

        public Builder(ClusterKindConfigNodeExtraPortMappingArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.containerPort = defaults.containerPort;
    	      this.hostPort = defaults.hostPort;
    	      this.listenAddress = defaults.listenAddress;
    	      this.protocol = defaults.protocol;
        }

        public Builder setContainerPort(@Nullable Input<Integer> containerPort) {
            this.containerPort = containerPort;
            return this;
        }

        public Builder setContainerPort(@Nullable Integer containerPort) {
            this.containerPort = Input.ofNullable(containerPort);
            return this;
        }

        public Builder setHostPort(@Nullable Input<Integer> hostPort) {
            this.hostPort = hostPort;
            return this;
        }

        public Builder setHostPort(@Nullable Integer hostPort) {
            this.hostPort = Input.ofNullable(hostPort);
            return this;
        }

        public Builder setListenAddress(@Nullable Input<String> listenAddress) {
            this.listenAddress = listenAddress;
            return this;
        }

        public Builder setListenAddress(@Nullable String listenAddress) {
            this.listenAddress = Input.ofNullable(listenAddress);
            return this;
        }

        public Builder setProtocol(@Nullable Input<String> protocol) {
            this.protocol = protocol;
            return this;
        }

        public Builder setProtocol(@Nullable String protocol) {
            this.protocol = Input.ofNullable(protocol);
            return this;
        }

        public ClusterKindConfigNodeExtraPortMappingArgs build() {
            return new ClusterKindConfigNodeExtraPortMappingArgs(containerPort, hostPort, listenAddress, protocol);
        }
    }
}

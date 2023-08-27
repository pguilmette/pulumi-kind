// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package pl.pguilmette.pulumi.kind.outputs;

import javax.annotation.Nullable;
import java.util.Objects;
import java.util.Optional;
import java.util.Map;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import io.pulumi.core.*;
import io.pulumi.core.internal.annotations.*;
import pl.pguilmette.pulumi.kind.Utilities;

@OutputCustomType
public final class ClusterKindConfigNodeExtraPortMapping {
    private final @Nullable Integer containerPort;
    private final @Nullable Integer hostPort;
    private final @Nullable String listenAddress;
    private final @Nullable String protocol;

    @OutputCustomType.Constructor({"containerPort","hostPort","listenAddress","protocol"})
    private ClusterKindConfigNodeExtraPortMapping(
        @Nullable Integer containerPort,
        @Nullable Integer hostPort,
        @Nullable String listenAddress,
        @Nullable String protocol) {
        this.containerPort = containerPort;
        this.hostPort = hostPort;
        this.listenAddress = listenAddress;
        this.protocol = protocol;
    }

    public Optional<Integer> getContainerPort() {
        return Optional.ofNullable(this.containerPort);
    }
    public Optional<Integer> getHostPort() {
        return Optional.ofNullable(this.hostPort);
    }
    public Optional<String> getListenAddress() {
        return Optional.ofNullable(this.listenAddress);
    }
    public Optional<String> getProtocol() {
        return Optional.ofNullable(this.protocol);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClusterKindConfigNodeExtraPortMapping defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Integer containerPort;
        private @Nullable Integer hostPort;
        private @Nullable String listenAddress;
        private @Nullable String protocol;

        public Builder() {
    	      // Empty
        }

        public Builder(ClusterKindConfigNodeExtraPortMapping defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.containerPort = defaults.containerPort;
    	      this.hostPort = defaults.hostPort;
    	      this.listenAddress = defaults.listenAddress;
    	      this.protocol = defaults.protocol;
        }

        public Builder setContainerPort(@Nullable Integer containerPort) {
            this.containerPort = containerPort;
            return this;
        }

        public Builder setHostPort(@Nullable Integer hostPort) {
            this.hostPort = hostPort;
            return this;
        }

        public Builder setListenAddress(@Nullable String listenAddress) {
            this.listenAddress = listenAddress;
            return this;
        }

        public Builder setProtocol(@Nullable String protocol) {
            this.protocol = protocol;
            return this;
        }

        public ClusterKindConfigNodeExtraPortMapping build() {
            return new ClusterKindConfigNodeExtraPortMapping(containerPort, hostPort, listenAddress, protocol);
        }
    }
}

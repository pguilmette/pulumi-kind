// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package pl.pawelprazak.pulumi.kind.outputs;

import javax.annotation.Nullable;
import java.util.Objects;
import java.util.Optional;
import java.util.Map;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import io.pulumi.core.*;
import io.pulumi.core.internal.annotations.*;
import pl.pawelprazak.pulumi.kind.Utilities;

@OutputCustomType
public final class ClusterKindConfigNetworking {
    private final @Nullable String apiServerAddress;
    private final @Nullable Integer apiServerPort;
    private final @Nullable Boolean disableDefaultCni;
    private final @Nullable String ipFamily;
    private final @Nullable String kubeProxyMode;
    private final @Nullable String podSubnet;
    private final @Nullable String serviceSubnet;

    @OutputCustomType.Constructor({"apiServerAddress","apiServerPort","disableDefaultCni","ipFamily","kubeProxyMode","podSubnet","serviceSubnet"})
    private ClusterKindConfigNetworking(
        @Nullable String apiServerAddress,
        @Nullable Integer apiServerPort,
        @Nullable Boolean disableDefaultCni,
        @Nullable String ipFamily,
        @Nullable String kubeProxyMode,
        @Nullable String podSubnet,
        @Nullable String serviceSubnet) {
        this.apiServerAddress = apiServerAddress;
        this.apiServerPort = apiServerPort;
        this.disableDefaultCni = disableDefaultCni;
        this.ipFamily = ipFamily;
        this.kubeProxyMode = kubeProxyMode;
        this.podSubnet = podSubnet;
        this.serviceSubnet = serviceSubnet;
    }

    public Optional<String> getApiServerAddress() {
        return Optional.ofNullable(this.apiServerAddress);
    }
    public Optional<Integer> getApiServerPort() {
        return Optional.ofNullable(this.apiServerPort);
    }
    public Optional<Boolean> getDisableDefaultCni() {
        return Optional.ofNullable(this.disableDefaultCni);
    }
    public Optional<String> getIpFamily() {
        return Optional.ofNullable(this.ipFamily);
    }
    public Optional<String> getKubeProxyMode() {
        return Optional.ofNullable(this.kubeProxyMode);
    }
    public Optional<String> getPodSubnet() {
        return Optional.ofNullable(this.podSubnet);
    }
    public Optional<String> getServiceSubnet() {
        return Optional.ofNullable(this.serviceSubnet);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClusterKindConfigNetworking defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String apiServerAddress;
        private @Nullable Integer apiServerPort;
        private @Nullable Boolean disableDefaultCni;
        private @Nullable String ipFamily;
        private @Nullable String kubeProxyMode;
        private @Nullable String podSubnet;
        private @Nullable String serviceSubnet;

        public Builder() {
    	      // Empty
        }

        public Builder(ClusterKindConfigNetworking defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.apiServerAddress = defaults.apiServerAddress;
    	      this.apiServerPort = defaults.apiServerPort;
    	      this.disableDefaultCni = defaults.disableDefaultCni;
    	      this.ipFamily = defaults.ipFamily;
    	      this.kubeProxyMode = defaults.kubeProxyMode;
    	      this.podSubnet = defaults.podSubnet;
    	      this.serviceSubnet = defaults.serviceSubnet;
        }

        public Builder setApiServerAddress(@Nullable String apiServerAddress) {
            this.apiServerAddress = apiServerAddress;
            return this;
        }

        public Builder setApiServerPort(@Nullable Integer apiServerPort) {
            this.apiServerPort = apiServerPort;
            return this;
        }

        public Builder setDisableDefaultCni(@Nullable Boolean disableDefaultCni) {
            this.disableDefaultCni = disableDefaultCni;
            return this;
        }

        public Builder setIpFamily(@Nullable String ipFamily) {
            this.ipFamily = ipFamily;
            return this;
        }

        public Builder setKubeProxyMode(@Nullable String kubeProxyMode) {
            this.kubeProxyMode = kubeProxyMode;
            return this;
        }

        public Builder setPodSubnet(@Nullable String podSubnet) {
            this.podSubnet = podSubnet;
            return this;
        }

        public Builder setServiceSubnet(@Nullable String serviceSubnet) {
            this.serviceSubnet = serviceSubnet;
            return this;
        }

        public ClusterKindConfigNetworking build() {
            return new ClusterKindConfigNetworking(apiServerAddress, apiServerPort, disableDefaultCni, ipFamily, kubeProxyMode, podSubnet, serviceSubnet);
        }
    }
}

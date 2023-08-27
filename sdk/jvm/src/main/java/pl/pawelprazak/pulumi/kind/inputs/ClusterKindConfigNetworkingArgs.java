// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package pl.pguilmette.pulumi.kind.inputs;

import javax.annotation.Nullable;
import java.util.Objects;
import java.util.Optional;
import java.util.Map;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import io.pulumi.core.*;
import io.pulumi.core.internal.annotations.*;
import pl.pguilmette.pulumi.kind.Utilities;


public final class ClusterKindConfigNetworkingArgs extends io.pulumi.resources.ResourceArgs {

    public static final ClusterKindConfigNetworkingArgs Empty = new ClusterKindConfigNetworkingArgs();

    @InputImport(name="apiServerAddress")
    private final @Nullable Input<String> apiServerAddress;

    public Input<String> getApiServerAddress() {
        return this.apiServerAddress == null ? Input.empty() : this.apiServerAddress;
    }

    @InputImport(name="apiServerPort")
    private final @Nullable Input<Integer> apiServerPort;

    public Input<Integer> getApiServerPort() {
        return this.apiServerPort == null ? Input.empty() : this.apiServerPort;
    }

    @InputImport(name="disableDefaultCni")
    private final @Nullable Input<Boolean> disableDefaultCni;

    public Input<Boolean> getDisableDefaultCni() {
        return this.disableDefaultCni == null ? Input.empty() : this.disableDefaultCni;
    }

    @InputImport(name="ipFamily")
    private final @Nullable Input<String> ipFamily;

    public Input<String> getIpFamily() {
        return this.ipFamily == null ? Input.empty() : this.ipFamily;
    }

    @InputImport(name="kubeProxyMode")
    private final @Nullable Input<String> kubeProxyMode;

    public Input<String> getKubeProxyMode() {
        return this.kubeProxyMode == null ? Input.empty() : this.kubeProxyMode;
    }

    @InputImport(name="podSubnet")
    private final @Nullable Input<String> podSubnet;

    public Input<String> getPodSubnet() {
        return this.podSubnet == null ? Input.empty() : this.podSubnet;
    }

    @InputImport(name="serviceSubnet")
    private final @Nullable Input<String> serviceSubnet;

    public Input<String> getServiceSubnet() {
        return this.serviceSubnet == null ? Input.empty() : this.serviceSubnet;
    }

    public ClusterKindConfigNetworkingArgs(
        @Nullable Input<String> apiServerAddress,
        @Nullable Input<Integer> apiServerPort,
        @Nullable Input<Boolean> disableDefaultCni,
        @Nullable Input<String> ipFamily,
        @Nullable Input<String> kubeProxyMode,
        @Nullable Input<String> podSubnet,
        @Nullable Input<String> serviceSubnet) {
        this.apiServerAddress = apiServerAddress;
        this.apiServerPort = apiServerPort;
        this.disableDefaultCni = disableDefaultCni;
        this.ipFamily = ipFamily;
        this.kubeProxyMode = kubeProxyMode;
        this.podSubnet = podSubnet;
        this.serviceSubnet = serviceSubnet;
    }

    private ClusterKindConfigNetworkingArgs() {
        this.apiServerAddress = Input.empty();
        this.apiServerPort = Input.empty();
        this.disableDefaultCni = Input.empty();
        this.ipFamily = Input.empty();
        this.kubeProxyMode = Input.empty();
        this.podSubnet = Input.empty();
        this.serviceSubnet = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClusterKindConfigNetworkingArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> apiServerAddress;
        private @Nullable Input<Integer> apiServerPort;
        private @Nullable Input<Boolean> disableDefaultCni;
        private @Nullable Input<String> ipFamily;
        private @Nullable Input<String> kubeProxyMode;
        private @Nullable Input<String> podSubnet;
        private @Nullable Input<String> serviceSubnet;

        public Builder() {
    	      // Empty
        }

        public Builder(ClusterKindConfigNetworkingArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.apiServerAddress = defaults.apiServerAddress;
    	      this.apiServerPort = defaults.apiServerPort;
    	      this.disableDefaultCni = defaults.disableDefaultCni;
    	      this.ipFamily = defaults.ipFamily;
    	      this.kubeProxyMode = defaults.kubeProxyMode;
    	      this.podSubnet = defaults.podSubnet;
    	      this.serviceSubnet = defaults.serviceSubnet;
        }

        public Builder setApiServerAddress(@Nullable Input<String> apiServerAddress) {
            this.apiServerAddress = apiServerAddress;
            return this;
        }

        public Builder setApiServerAddress(@Nullable String apiServerAddress) {
            this.apiServerAddress = Input.ofNullable(apiServerAddress);
            return this;
        }

        public Builder setApiServerPort(@Nullable Input<Integer> apiServerPort) {
            this.apiServerPort = apiServerPort;
            return this;
        }

        public Builder setApiServerPort(@Nullable Integer apiServerPort) {
            this.apiServerPort = Input.ofNullable(apiServerPort);
            return this;
        }

        public Builder setDisableDefaultCni(@Nullable Input<Boolean> disableDefaultCni) {
            this.disableDefaultCni = disableDefaultCni;
            return this;
        }

        public Builder setDisableDefaultCni(@Nullable Boolean disableDefaultCni) {
            this.disableDefaultCni = Input.ofNullable(disableDefaultCni);
            return this;
        }

        public Builder setIpFamily(@Nullable Input<String> ipFamily) {
            this.ipFamily = ipFamily;
            return this;
        }

        public Builder setIpFamily(@Nullable String ipFamily) {
            this.ipFamily = Input.ofNullable(ipFamily);
            return this;
        }

        public Builder setKubeProxyMode(@Nullable Input<String> kubeProxyMode) {
            this.kubeProxyMode = kubeProxyMode;
            return this;
        }

        public Builder setKubeProxyMode(@Nullable String kubeProxyMode) {
            this.kubeProxyMode = Input.ofNullable(kubeProxyMode);
            return this;
        }

        public Builder setPodSubnet(@Nullable Input<String> podSubnet) {
            this.podSubnet = podSubnet;
            return this;
        }

        public Builder setPodSubnet(@Nullable String podSubnet) {
            this.podSubnet = Input.ofNullable(podSubnet);
            return this;
        }

        public Builder setServiceSubnet(@Nullable Input<String> serviceSubnet) {
            this.serviceSubnet = serviceSubnet;
            return this;
        }

        public Builder setServiceSubnet(@Nullable String serviceSubnet) {
            this.serviceSubnet = Input.ofNullable(serviceSubnet);
            return this;
        }

        public ClusterKindConfigNetworkingArgs build() {
            return new ClusterKindConfigNetworkingArgs(apiServerAddress, apiServerPort, disableDefaultCni, ipFamily, kubeProxyMode, podSubnet, serviceSubnet);
        }
    }
}

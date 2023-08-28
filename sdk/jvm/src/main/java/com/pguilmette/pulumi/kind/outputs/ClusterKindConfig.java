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
public final class ClusterKindConfig {
    private final String apiVersion;
    private final @Nullable List<String> containerdConfigPatches;
    private final String kind;
    private final @Nullable pl.pguilmette.pulumi.kind.outputs.ClusterKindConfigNetworking networking;
    private final @Nullable List<pl.pguilmette.pulumi.kind.outputs.ClusterKindConfigNode> nodes;

    @OutputCustomType.Constructor({"apiVersion","containerdConfigPatches","kind","networking","nodes"})
    private ClusterKindConfig(
        String apiVersion,
        @Nullable List<String> containerdConfigPatches,
        String kind,
        @Nullable pl.pguilmette.pulumi.kind.outputs.ClusterKindConfigNetworking networking,
        @Nullable List<pl.pguilmette.pulumi.kind.outputs.ClusterKindConfigNode> nodes) {
        this.apiVersion = Objects.requireNonNull(apiVersion);
        this.containerdConfigPatches = containerdConfigPatches;
        this.kind = Objects.requireNonNull(kind);
        this.networking = networking;
        this.nodes = nodes;
    }

    public String getApiVersion() {
        return this.apiVersion;
    }
    public List<String> getContainerdConfigPatches() {
        return this.containerdConfigPatches == null ? List.of() : this.containerdConfigPatches;
    }
    public String getKind() {
        return this.kind;
    }
    public Optional<pl.pguilmette.pulumi.kind.outputs.ClusterKindConfigNetworking> getNetworking() {
        return Optional.ofNullable(this.networking);
    }
    public List<pl.pguilmette.pulumi.kind.outputs.ClusterKindConfigNode> getNodes() {
        return this.nodes == null ? List.of() : this.nodes;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClusterKindConfig defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String apiVersion;
        private @Nullable List<String> containerdConfigPatches;
        private String kind;
        private @Nullable pl.pguilmette.pulumi.kind.outputs.ClusterKindConfigNetworking networking;
        private @Nullable List<pl.pguilmette.pulumi.kind.outputs.ClusterKindConfigNode> nodes;

        public Builder() {
    	      // Empty
        }

        public Builder(ClusterKindConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.apiVersion = defaults.apiVersion;
    	      this.containerdConfigPatches = defaults.containerdConfigPatches;
    	      this.kind = defaults.kind;
    	      this.networking = defaults.networking;
    	      this.nodes = defaults.nodes;
        }

        public Builder setApiVersion(String apiVersion) {
            this.apiVersion = Objects.requireNonNull(apiVersion);
            return this;
        }

        public Builder setContainerdConfigPatches(@Nullable List<String> containerdConfigPatches) {
            this.containerdConfigPatches = containerdConfigPatches;
            return this;
        }

        public Builder setKind(String kind) {
            this.kind = Objects.requireNonNull(kind);
            return this;
        }

        public Builder setNetworking(@Nullable pl.pguilmette.pulumi.kind.outputs.ClusterKindConfigNetworking networking) {
            this.networking = networking;
            return this;
        }

        public Builder setNodes(@Nullable List<pl.pguilmette.pulumi.kind.outputs.ClusterKindConfigNode> nodes) {
            this.nodes = nodes;
            return this;
        }

        public ClusterKindConfig build() {
            return new ClusterKindConfig(apiVersion, containerdConfigPatches, kind, networking, nodes);
        }
    }
}
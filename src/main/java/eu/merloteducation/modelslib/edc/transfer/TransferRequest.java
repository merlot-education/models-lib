package eu.merloteducation.modelslib.edc.transfer;

import com.fasterxml.jackson.annotation.JsonProperty;
import eu.merloteducation.modelslib.edc.EdcConstants;
import eu.merloteducation.modelslib.edc.asset.DataAddress;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Map;

@Getter
@Setter
@ToString
@Builder
public class TransferRequest {
    private static final Map<String, String> CONTEXT = EdcConstants.EDC_CONTEXT;

    private static final String TYPE = "TransferRequestDto";

    private static final boolean MANAGED_RESOURCES = true;

    private static final String PROTOCOL = "dataspace-protocol-http";

    private String connectorId;
    private String connectorAddress;
    private String contractId;
    private String assetId;
    private DataAddress dataDestination;

    @JsonProperty("@type")
    public String getType() {
        return TYPE;
    }

    @JsonProperty("protocol")
    public String getProtocol() {
        return PROTOCOL;
    }

    @JsonProperty("@context")
    public Map<String, String> getContext() {
        return CONTEXT;
    }

    @JsonProperty("managedResources")
    public boolean isManagedResources() {
        return MANAGED_RESOURCES;
    }
}

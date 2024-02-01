package eu.merloteducation.modelslib.edc.negotiation;

import com.fasterxml.jackson.annotation.JsonProperty;
import eu.merloteducation.modelslib.edc.EdcConstants;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Map;

@Getter
@Setter
@ToString
@Builder
public class NegotiationInitiateRequest {
    private static final Map<String, String> CONTEXT = EdcConstants.EDC_CONTEXT;

    private static final String TYPE = "NegotiationInitiateRequestDto";

    private static final String PROTOCOL = "dataspace-protocol-http";

    private String connectorId;
    private String consumerId;
    private String providerId;
    private String connectorAddress;
    private ContractOffer offer;

    @JsonProperty("@context")
    public Map<String, String> getContext() {
        return CONTEXT;
    }

    @JsonProperty("@type")
    public String getType() {
        return TYPE;
    }

    @JsonProperty("protocol")
    public String getProtocol() {
        return PROTOCOL;
    }
}

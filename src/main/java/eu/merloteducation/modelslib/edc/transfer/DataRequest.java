package eu.merloteducation.modelslib.edc.transfer;

import com.fasterxml.jackson.annotation.JsonProperty;
import eu.merloteducation.modelslib.edc.EdcConstants;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class DataRequest {
    @JsonProperty("@type")
    private String type;

    @JsonProperty("@id")
    private String id;

    @JsonProperty(EdcConstants.EDC_PREFIX + "assetId")
    private String assetId;

    @JsonProperty(EdcConstants.EDC_PREFIX + "contractId")
    private String contractId;

    @JsonProperty(EdcConstants.EDC_PREFIX + "connectorId")
    private String connectorId;
}

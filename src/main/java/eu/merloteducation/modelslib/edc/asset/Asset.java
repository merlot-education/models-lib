package eu.merloteducation.modelslib.edc.asset;

import com.fasterxml.jackson.annotation.JsonProperty;
import eu.merloteducation.contractorchestrator.models.edc.EdcConstants;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Asset {
    private static final String TYPE = EdcConstants.EDC_PREFIX + "Asset";

    @JsonProperty("@id")
    private String id;

    @JsonProperty(EdcConstants.EDC_PREFIX + "properties")
    private AssetProperties properties;

    @JsonProperty("@type")
    private String getType() {
        return TYPE;
    }

}

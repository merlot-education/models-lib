package eu.merloteducation.modelslib.edc.asset;

import com.fasterxml.jackson.annotation.JsonProperty;
import eu.merloteducation.contractorchestrator.models.edc.EdcConstants;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class AssetProperties {
    @JsonProperty(EdcConstants.EDC_PREFIX + "name")
    private String name;

    @JsonProperty(EdcConstants.EDC_PREFIX + "description")
    private String description;

    @JsonProperty(EdcConstants.EDC_PREFIX + "version")
    private String version;

    @JsonProperty(EdcConstants.EDC_PREFIX + "contenttype")
    private String contenttype;
}

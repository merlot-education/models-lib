package eu.merloteducation.modelslib.edc.asset;

import com.fasterxml.jackson.annotation.JsonProperty;
import eu.merloteducation.modelslib.edc.EdcConstants;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class HttpDataAddressProperties {
    @JsonProperty(EdcConstants.EDC_PREFIX + "name")
    private String name;

    @JsonProperty(EdcConstants.EDC_PREFIX + "baseUrl")
    private String baseUrl;

    @JsonProperty(EdcConstants.EDC_PREFIX + "type")
    private String type;
}

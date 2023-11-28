package eu.merloteducation.modelslib.edc.common;

import com.fasterxml.jackson.annotation.JsonProperty;
import eu.merloteducation.modelslib.edc.EdcConstants;
import lombok.Getter;
import lombok.Setter;

import java.util.Map;

@Getter
@Setter
public class IdResponse {
    @JsonProperty("@type")
    private String type;

    @JsonProperty("@id")
    private String id;

    @JsonProperty(EdcConstants.EDC_PREFIX + "createdAt")
    private long createdAt;

    @JsonProperty("@context")
    private Map<String, String> context;
}

package eu.merloteducation.modelslib.edc.policy;

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
public class PolicyCreateRequest {
    private static final Map<String, String> CONTEXT = EdcConstants.EDC_CONTEXT;

    @JsonProperty("@id")
    private String id;
    private Policy policy;

    @JsonProperty("@context")
    public Map<String, String> getContext() {
        return CONTEXT;
    }
}

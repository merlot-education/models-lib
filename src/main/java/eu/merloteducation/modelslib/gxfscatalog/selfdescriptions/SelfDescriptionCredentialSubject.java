package eu.merloteducation.modelslib.gxfscatalog.selfdescriptions;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.Map;

@Getter
@Setter
public class SelfDescriptionCredentialSubject {
    // base fields
    @JsonProperty("@id")
    private String id;

    @JsonProperty("@type")
    private String type;

    @JsonProperty("@context")
    private Map<String, String> context;
}

package eu.merloteducation.modelslib.gxfscatalog;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class RegistrationNumber {
    @JsonProperty("@type")
    private String type;

    @JsonProperty("gax-trust-framework:local")
    private StringTypeValue local;
}

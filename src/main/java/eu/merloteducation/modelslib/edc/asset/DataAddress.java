package eu.merloteducation.modelslib.edc.asset;

import com.fasterxml.jackson.annotation.JsonProperty;
import eu.merloteducation.modelslib.edc.EdcConstants;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public abstract class DataAddress {
    private static final String TYPE = "DataAddress";

    @JsonProperty("@type")
    public String getType() {
        return TYPE;
    }
}

package eu.merloteducation.modelslib.edc.asset;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

@Getter
@Setter
@ToString
@SuperBuilder
@NoArgsConstructor
public abstract class DataAddress {
    private static final String TYPE = "DataAddress";

    @JsonProperty("@type")
    public String getType() {
        return TYPE;
    }
}

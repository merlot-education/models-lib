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
public class HttpDataAddress extends DataAddress {

    private static final String TYPE = "HttpData";
    private HttpDataAddressProperties properties;

    @JsonProperty("type")
    public String getDataType() {
        return TYPE;
    }
}

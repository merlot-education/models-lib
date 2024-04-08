package eu.merloteducation.modelslib.daps;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class OmejdnConnectorCertificateRequest {
    @JsonProperty("client_name")
    private String clientName;
}

package eu.merloteducation.modelslib.daps;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class OmejdnConnectorCertificateDto {
    @JsonProperty("client_name")
    private String clientName;

    @JsonProperty("client_id")
    private String clientId;

    @JsonProperty("keystore")
    private String keystore;

    @JsonProperty("password")
    private String password;

    @JsonProperty("scope")
    private String scope;
}

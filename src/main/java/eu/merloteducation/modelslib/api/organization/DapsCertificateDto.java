package eu.merloteducation.modelslib.api.organization;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class DapsCertificateDto {
    private String clientName;
    private String clientId;
    private String keystore;
    private String password;
}

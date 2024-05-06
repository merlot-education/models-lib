package eu.merloteducation.modelslib.api.organization;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class OrganisationSignerConfigDto {
    private String privateKey;
    private String verificationMethod;
    private String merlotVerificationMethod;
}

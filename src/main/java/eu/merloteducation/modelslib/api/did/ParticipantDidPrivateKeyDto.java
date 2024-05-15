package eu.merloteducation.modelslib.api.did;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ParticipantDidPrivateKeyDto {
    private String did;
    private String merlotVerificationMethod;
    private String verificationMethod;
    private String privateKey;
}

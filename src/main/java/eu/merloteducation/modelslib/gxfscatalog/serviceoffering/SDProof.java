package eu.merloteducation.modelslib.gxfscatalog.serviceoffering;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class SDProof {
    private String type;
    private String created;
    private String proofPurpose;
    private String verificationMethod;
    private String jws;
}

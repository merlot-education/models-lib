package eu.merloteducation.modelslib.gxfscatalog.organization;

import com.fasterxml.jackson.annotation.JsonProperty;
import eu.merloteducation.modelslib.gxfscatalog.datatypes.SDProof;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class MerlotOrganizationVerifiableCredential {

    private MerlotOrganizationCredentialSubject credentialSubject;

    private String issuanceDate;

    @JsonProperty("@type")
    private List<String> type;
    @JsonProperty("@id")
    private String id;
    private SDProof proof;
    @JsonProperty("@context")
    private List<String> context;
    private String issuer;
}

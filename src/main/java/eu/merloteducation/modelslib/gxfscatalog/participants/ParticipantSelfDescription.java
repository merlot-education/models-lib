package eu.merloteducation.modelslib.gxfscatalog.participants;

import com.fasterxml.jackson.annotation.JsonProperty;
import eu.merloteducation.modelslib.gxfscatalog.datatypes.SDProof;
import eu.merloteducation.modelslib.gxfscatalog.selfdescriptions.SelfDescriptionVerifiableCredential;
import eu.merloteducation.modelslib.gxfscatalog.selfdescriptions.participants.MerlotOrganizationCredentialSubject;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class ParticipantSelfDescription {

    @JsonProperty("@id")
    private String id;

    private SDProof proof;

    private List<String> type;

    @JsonProperty("@context")
    private List<String> context;


    private SelfDescriptionVerifiableCredential<MerlotOrganizationCredentialSubject> verifiableCredential;



}

package eu.merloteducation.modelslib.gxfscatalog.participant;

import com.fasterxml.jackson.annotation.JsonProperty;
import eu.merloteducation.modelslib.gxfscatalog.SDProof;
import eu.merloteducation.modelslib.gxfscatalog.selfdescriptions.SelfDescriptionVerifiableCredential;
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


    private SelfDescriptionVerifiableCredential verifiableCredential;



}
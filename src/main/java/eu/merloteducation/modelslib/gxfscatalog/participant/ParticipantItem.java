package eu.merloteducation.modelslib.gxfscatalog.participant;

import eu.merloteducation.modelslib.gxfscatalog.PublicKey;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ParticipantItem {
    private String id;
    private String name;
    private PublicKey publicKey;
    private ParticipantSelfDescription selfDescription;
}
package eu.merloteducation.modelslib.gxfscatalog.participants;

import eu.merloteducation.modelslib.gxfscatalog.selfdescriptions.SelfDescription;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ParticipantItem {
    private String id;
    private String name;
    private PublicKey publicKey;
    private SelfDescription selfDescription;
}

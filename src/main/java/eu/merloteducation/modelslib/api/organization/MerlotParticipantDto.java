package eu.merloteducation.modelslib.api.organization;

import eu.merloteducation.gxfscataloglibrary.models.selfdescriptions.SelfDescription;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class MerlotParticipantDto {
    private String id;
    private MerlotParticipantMetaDto metadata;
    private SelfDescription selfDescription;
}

package eu.merloteducation.modelslib.api.organization;

import eu.merloteducation.modelslib.gxfscatalog.selfdescriptions.SelfDescription;
import eu.merloteducation.modelslib.gxfscatalog.selfdescriptions.participants.MerlotOrganizationCredentialSubject;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class MerlotParticipantDto {
    private String id;
    private MerlotParticipantMetaDto metadata;
    private SelfDescription<MerlotOrganizationCredentialSubject> selfDescription;
}

package eu.merloteducation.modelslib.api.organization;

import eu.merloteducation.organisationsorchestrator.models.gxfscatalog.ParticipantSelfDescription;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class MerlotParticipantDto {
    private String id;
    private MerlotParticipantMetaDto metadata;
    private ParticipantSelfDescription selfDescription;
}

package eu.merloteducation.modelslib.api.organization;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class MerlotParticipantMetaDto {
    private String orgaId; // TODO the dto probably should not contain this...
    private String mailAddress;
    private MembershipClass membershipClass;
}

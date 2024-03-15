package eu.merloteducation.modelslib.api.organization;

import lombok.Getter;
import lombok.Setter;

import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
public class MerlotParticipantMetaDto {
    private String orgaId;
    private String mailAddress;
    private MembershipClass membershipClass;
    private boolean active;
    private Set<OrganizationConnectorDto> connectors = new HashSet<>();
    private OrganisationSignerConfigDto organisationSignerConfigDto;
}

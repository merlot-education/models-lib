/*
 *  Copyright 2024 Dataport. All rights reserved. Developed as part of the MERLOT project.
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */

package eu.merloteducation.modelslib.api.organization;

import lombok.Getter;
import lombok.Setter;

import java.util.HashSet;
import java.util.List;
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
    private String signedBy;
    private List<DapsCertificateDto> dapsCertificates;
    private Set<ParticipantAgentSettingsDto> ocmAgentSettings;
}

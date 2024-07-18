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

package eu.merloteducation.modelslib.api.contract;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

@Getter
@Setter
@ToString
public class ContractDetailsDto {

    private String id;

    private String creationDate;

    private String providerId;

    private String providerLegalName;

    private ContractVcard providerLegalAddress;

    private boolean providerActive;

    private String consumerId;

    private String consumerLegalName;

    private ContractVcard consumerLegalAddress;

    private boolean consumerActive;

    private String state;

    private List<ContractTncDto> termsAndConditions;

    private String consumerSignerUserName;

    private String consumerSignatureDate;

    private String providerSignerUserName;

    private String providerSignatureDate;
}

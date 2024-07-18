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

import java.util.List;
import java.util.Map;

@Getter
@Setter
public class ContractPdfDto {
    private String contractId;
    private String contractCreationDate;
    private String contractRuntime;
    private String contractDataTransferCount; //data delivery
    private String contractUserCount; //saas
    private List<Map<String, String>> contractTnc; //Merlot + Provider TnC (link + hash)
    private List<String> contractAttachmentFilenames;

    private String serviceId;
    private String serviceName;
    private String serviceType;
    private String serviceDescription;
    private String serviceExampleCosts;
    private String serviceDataAccessType;//data delivery
    private String serviceDataTransferType; //data delivery
    private String serviceHardwareRequirements;//saas

    private String providerLegalName;
    private ContractPdfAddressDto providerLegalAddress;
    private String providerSignerUser;
    private String providerSignatureTimestamp;

    private String consumerLegalName;
    private ContractPdfAddressDto consumerLegalAddress;
    private String consumerSignerUser;
    private String consumerSignatureTimestamp;
}

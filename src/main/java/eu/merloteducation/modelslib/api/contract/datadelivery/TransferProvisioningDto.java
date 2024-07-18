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

package eu.merloteducation.modelslib.api.contract.datadelivery;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import eu.merloteducation.modelslib.api.contract.datadelivery.ionoss3extension.IonosS3ConsumerTransferProvisioningDto;
import eu.merloteducation.modelslib.api.contract.datadelivery.ionoss3extension.IonosS3ProviderTransferProvisioningDto;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, property = "dataAddressType", visible = true)
@JsonSubTypes({
        @JsonSubTypes.Type(value = IonosS3ProviderTransferProvisioningDto.class, name = "IonosS3Source"),
        @JsonSubTypes.Type(value = IonosS3ConsumerTransferProvisioningDto.class, name = "IonosS3Dest")
})
public abstract class TransferProvisioningDto {
    private String dataAddressType;
    private String selectedConnectorId;
}

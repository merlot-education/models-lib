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

package eu.merloteducation.modelslib.api.contract.datadelivery.ionoss3extension;

import com.fasterxml.jackson.annotation.JsonView;
import eu.merloteducation.modelslib.api.contract.datadelivery.TransferProvisioningDto;
import eu.merloteducation.modelslib.api.contract.views.ContractViews;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class IonosS3ConsumerTransferProvisioningDto extends TransferProvisioningDto {
    @JsonView(ContractViews.ConsumerView.class)
    private String dataAddressTargetBucketName;

    @JsonView(ContractViews.ConsumerView.class)
    private String dataAddressTargetPath;
}

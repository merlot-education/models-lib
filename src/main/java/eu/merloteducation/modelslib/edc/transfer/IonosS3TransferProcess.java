/*
 *  Copyright 2023-2024 Dataport AöR
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

package eu.merloteducation.modelslib.edc.transfer;

import eu.merloteducation.modelslib.edc.asset.ionoss3extension.IonosS3DataAddress;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class IonosS3TransferProcess extends TransferProcess {
    private IonosS3DataAddress dataDestination;
}

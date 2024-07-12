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

package eu.merloteducation.modelslib.edc;

import eu.merloteducation.modelslib.edc.transfer.IonosS3TransferProcess;
import lombok.Getter;

@Getter
public class EdcTransferStatus {

    private final String id;

    private final String state;

    public EdcTransferStatus(IonosS3TransferProcess transferProcess) {
        this.id = transferProcess.getId();
        this.state = transferProcess.getState();
    }
}

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

package eu.merloteducation.modelslib.edc.negotiation;

import com.fasterxml.jackson.annotation.JsonProperty;
import eu.merloteducation.modelslib.edc.EdcConstants;
import lombok.Getter;
import lombok.Setter;

import java.util.List;
import java.util.Map;

@Getter
@Setter
public class ContractNegotiation {
    @JsonProperty("@type")
    private String type;

    @JsonProperty("@id")
    private String id;

    @JsonProperty("type")
    private String edcType;
    private String protocol;
    private String state;
    private String counterPartyAddress;
    private List<String> callbackAddresses;
    private String contractAgreementId;

    @JsonProperty("@context")
    private Map<String, String> context;
}

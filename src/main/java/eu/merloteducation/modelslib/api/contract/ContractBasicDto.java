package eu.merloteducation.modelslib.api.contract;

import eu.merloteducation.modelslib.api.serviceoffering.ServiceOfferingDto;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class ContractBasicDto {
    private String id;

    private String creationDate;

    private ServiceOfferingDto offering;

    private String providerId;

    private String providerLegalName;

    private boolean isProviderActive;

    private String consumerId;

    private String consumerLegalName;

    private boolean isConsumerActive;

    private String state;
}

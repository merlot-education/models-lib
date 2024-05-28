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

package eu.merloteducation.modelslib.api.contract.saas;

import eu.merloteducation.modelslib.api.contract.ContractDto;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class SaasContractDto extends ContractDto {
    private SaasContractDetailsDto details;
    private SaasContractNegotiationDto negotiation;
    private SaasContractProvisioningDto provisioning;
}

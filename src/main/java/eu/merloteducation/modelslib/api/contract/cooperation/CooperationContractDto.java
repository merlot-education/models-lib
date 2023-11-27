package eu.merloteducation.modelslib.api.contract.cooperation;

import eu.merloteducation.modelslib.api.contract.ContractDto;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CooperationContractDto extends ContractDto {
    private CooperationContractDetailsDto details;
    private CooperationContractNegotiationDto negotiation;
    private CooperationContractProvisioningDto provisioning;
}

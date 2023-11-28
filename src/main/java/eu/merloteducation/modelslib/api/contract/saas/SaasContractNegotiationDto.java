package eu.merloteducation.modelslib.api.contract.saas;

import eu.merloteducation.modelslib.api.contract.ContractNegotiationDto;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class SaasContractNegotiationDto extends ContractNegotiationDto {
    private String userCountSelection;
}

package eu.merloteducation.modelslib.api.contract.datadelivery;

import eu.merloteducation.modelslib.api.contract.ContractNegotiationDto;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class DataDeliveryContractNegotiationDto extends ContractNegotiationDto {
    private String exchangeCountSelection;
}

package eu.merloteducation.modelslib.api.contract.datadelivery;

import eu.merloteducation.modelslib.api.contract.ContractDto;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class DataDeliveryContractDto extends ContractDto {
    private DataDeliveryContractDetailsDto details;
    private DataDeliveryContractNegotiationDto negotiation;
    private DataDeliveryContractProvisioningDto provisioning;
}

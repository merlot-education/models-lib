package eu.merloteducation.modelslib.api.contract.datadelivery;

import com.fasterxml.jackson.annotation.JsonView;
import eu.merloteducation.modelslib.api.contract.ContractProvisioningDto;
import eu.merloteducation.modelslib.api.contract.views.ContractViews;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class DataDeliveryContractProvisioningDto extends ContractProvisioningDto {

    @JsonView(ContractViews.ConsumerView.class)
    private TransferProvisioningDto consumerTransferProvisioning;

    @JsonView(ContractViews.ProviderView.class)
    private TransferProvisioningDto providerTransferProvisioning;

}

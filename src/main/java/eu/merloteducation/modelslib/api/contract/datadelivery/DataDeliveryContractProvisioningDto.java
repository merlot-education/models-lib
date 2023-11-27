package eu.merloteducation.modelslib.api.contract.datadelivery;

import com.fasterxml.jackson.annotation.JsonView;
import eu.merloteducation.modelslib.api.contract.ContractProvisioningDto;
import eu.merloteducation.modelslib.api.contract.views.ContractViews;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class DataDeliveryContractProvisioningDto extends ContractProvisioningDto {
    @JsonView(ContractViews.ProviderView.class)
    private String dataAddressType;

    @JsonView(ContractViews.ProviderView.class)
    private String dataAddressSourceBucketName;

    @JsonView(ContractViews.ProviderView.class)
    private String dataAddressSourceFileName;

    @JsonView(ContractViews.ProviderView.class)
    private String selectedProviderConnectorId;

    @JsonView(ContractViews.ConsumerView.class)
    private String dataAddressTargetBucketName;

    @JsonView(ContractViews.ConsumerView.class)
    private String dataAddressTargetFileName;

    @JsonView(ContractViews.ConsumerView.class)
    private String selectedConsumerConnectorId;
}

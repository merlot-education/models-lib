package eu.merloteducation.modelslib.api.contract.datadelivery;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonView;
import eu.merloteducation.modelslib.api.contract.ContractProvisioningDto;
import eu.merloteducation.modelslib.api.contract.datadelivery.ionoss3extension.IonosS3DataDeliveryContractProvisioningDto;
import eu.merloteducation.modelslib.api.contract.views.ContractViews;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, property = "dataAddressType", visible = true)
@JsonSubTypes({
        @JsonSubTypes.Type(value = IonosS3DataDeliveryContractProvisioningDto.class, name = "IonosS3")
})
public abstract class DataDeliveryContractProvisioningDto extends ContractProvisioningDto {

    @JsonView(ContractViews.ProviderView.class)
    private String dataAddressType;

    @JsonView(ContractViews.ProviderView.class)
    private String selectedProviderConnectorId;

    @JsonView(ContractViews.ConsumerView.class)
    private String selectedConsumerConnectorId;
}

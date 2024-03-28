package eu.merloteducation.modelslib.api.contract.datadelivery;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonView;
import eu.merloteducation.modelslib.api.contract.datadelivery.ionoss3extension.IonosS3ConsumerTransferProvisioningDto;
import eu.merloteducation.modelslib.api.contract.datadelivery.ionoss3extension.IonosS3ProviderTransferProvisioningDto;
import eu.merloteducation.modelslib.api.contract.views.ContractViews;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, property = "dataAddressType", visible = true)
@JsonSubTypes({
        @JsonSubTypes.Type(value = IonosS3ProviderTransferProvisioningDto.class, name = "IonosS3Source"),
        @JsonSubTypes.Type(value = IonosS3ConsumerTransferProvisioningDto.class, name = "IonosS3Dest")
})
public abstract class TransferProvisioningDto {
    @JsonView(ContractViews.ProviderView.class)
    private String dataAddressType;

    @JsonView(ContractViews.ProviderView.class)
    private String selectedConnectorId;
}

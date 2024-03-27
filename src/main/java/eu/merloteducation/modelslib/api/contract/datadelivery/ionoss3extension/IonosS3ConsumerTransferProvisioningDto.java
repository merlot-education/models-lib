package eu.merloteducation.modelslib.api.contract.datadelivery.ionoss3extension;

import com.fasterxml.jackson.annotation.JsonView;
import eu.merloteducation.modelslib.api.contract.datadelivery.ConsumerTransferProvisioningDto;
import eu.merloteducation.modelslib.api.contract.views.ContractViews;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class IonosS3ConsumerTransferProvisioningDto extends ConsumerTransferProvisioningDto {
    @JsonView(ContractViews.ConsumerView.class)
    private String dataAddressTargetBucketName;

    @JsonView(ContractViews.ConsumerView.class)
    private String dataAddressTargetPath;
}

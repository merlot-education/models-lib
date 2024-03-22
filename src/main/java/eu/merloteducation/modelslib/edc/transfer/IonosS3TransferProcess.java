package eu.merloteducation.modelslib.edc.transfer;

import eu.merloteducation.modelslib.edc.asset.ionoss3extension.IonosS3DataAddress;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class IonosS3TransferProcess extends TransferProcess {
    private IonosS3DataAddress dataDestination;
}

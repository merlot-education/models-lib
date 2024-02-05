package eu.merloteducation.modelslib.edc.transfer;

import com.fasterxml.jackson.annotation.JsonProperty;
import eu.merloteducation.modelslib.edc.EdcConstants;
import eu.merloteducation.modelslib.edc.asset.IonosS3DataAddress;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class IonosS3TransferProcess extends TransferProcess {
    private IonosS3DataAddress dataDestination;
}

package eu.merloteducation.modelslib.edc.transfer;

import com.fasterxml.jackson.annotation.JsonProperty;
import eu.merloteducation.modelslib.edc.EdcConstants;
import eu.merloteducation.modelslib.edc.asset.HttpDataAddress;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class HttpTransferProcess extends TransferProcess{
    @JsonProperty(EdcConstants.EDC_PREFIX + "dataDestination")
    private HttpDataAddress dataDestination;
}

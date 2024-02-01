package eu.merloteducation.modelslib.edc.transfer;

import com.fasterxml.jackson.annotation.JsonProperty;
import eu.merloteducation.modelslib.edc.EdcConstants;
import lombok.Getter;
import lombok.Setter;

import java.util.List;
import java.util.Map;

@Getter
@Setter
public abstract class TransferProcess {

    @JsonProperty("@context")
    private Map<String, String> context;

    @JsonProperty("@id")
    private String id;

    @JsonProperty("@type")
    private String type;

    private String state;
    private String stateTimestamp;

    @JsonProperty("type")
    private String edcType;
    private List<String> callbackAddresses;
    private DataRequest dataRequest;
}

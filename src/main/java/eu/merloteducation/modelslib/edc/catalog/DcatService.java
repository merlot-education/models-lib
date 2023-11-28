package eu.merloteducation.modelslib.edc.catalog;

import com.fasterxml.jackson.annotation.JsonProperty;
import eu.merloteducation.modelslib.edc.EdcConstants;

public class DcatService {
    @JsonProperty("@id")
    private String id;

    @JsonProperty("@type")
    private String type;

    @JsonProperty(EdcConstants.DCT_PREFIX + "terms")
    private String terms;

    @JsonProperty(EdcConstants.DCT_PREFIX + "endpointUrl")
    private String endpointUrl;
}

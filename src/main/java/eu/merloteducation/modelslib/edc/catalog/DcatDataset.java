package eu.merloteducation.modelslib.edc.catalog;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import eu.merloteducation.modelslib.edc.EdcConstants;
import eu.merloteducation.modelslib.edc.policy.Policy;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class DcatDataset {
    @JsonProperty("@id")
    private String id;

    @JsonProperty("@type")
    private String type;

    @JsonFormat(with = JsonFormat.Feature.ACCEPT_SINGLE_VALUE_AS_ARRAY)
    @JsonProperty(EdcConstants.ODRL_PREFIX + "hasPolicy")
    private List<Policy> hasPolicy;

    @JsonFormat(with = JsonFormat.Feature.ACCEPT_SINGLE_VALUE_AS_ARRAY)
    @JsonProperty(EdcConstants.DCAT_PREFIX + "distribution")
    private List<DcatDistribution> distribution;

    @JsonProperty(EdcConstants.EDC_PREFIX + "version")
    private String version;

    @JsonProperty(EdcConstants.EDC_PREFIX + "name")
    private String name;

    @JsonProperty(EdcConstants.EDC_PREFIX + "description")
    private String description;

    @JsonProperty(EdcConstants.EDC_PREFIX + "id")
    private String assetId;

    @JsonProperty(EdcConstants.EDC_PREFIX + "contenttype")
    private String contenttype;
}

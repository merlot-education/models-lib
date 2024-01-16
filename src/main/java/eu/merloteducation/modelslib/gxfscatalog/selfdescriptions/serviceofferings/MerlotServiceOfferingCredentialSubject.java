package eu.merloteducation.modelslib.gxfscatalog.selfdescriptions.serviceofferings;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import eu.merloteducation.modelslib.gxfscatalog.datatypes.Runtime;
import eu.merloteducation.modelslib.gxfscatalog.datatypes.StringTypeValue;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@JsonInclude(JsonInclude.Include.NON_NULL)
public class MerlotServiceOfferingCredentialSubject extends GaxTrustServiceOfferingCredentialSubject {
    // inherited from merlot:MerlotServiceOffering
    @NotNull
    @JsonProperty("merlot:creationDate")
    private StringTypeValue creationDate;

    @JsonProperty("merlot:exampleCosts")
    private StringTypeValue exampleCosts;

    @JsonFormat(with = JsonFormat.Feature.ACCEPT_SINGLE_VALUE_AS_ARRAY)
    @JsonProperty("merlot:runtimeOption")
    private List<Runtime> runtimeOptions;

    @NotNull
    @JsonProperty("merlot:merlotTermsAndConditionsAccepted")
    private boolean merlotTermsAndConditionsAccepted;
}

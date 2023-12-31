package eu.merloteducation.modelslib.gxfscatalog.selfdescriptions.serviceofferings;

import com.fasterxml.jackson.annotation.*;
import eu.merloteducation.modelslib.gxfscatalog.datatypes.*;
import eu.merloteducation.modelslib.gxfscatalog.datatypes.Runtime;
import eu.merloteducation.modelslib.gxfscatalog.selfdescriptions.SelfDescriptionCredentialSubject;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;
import java.util.List;

@Getter
@Setter
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, visible = true)
@JsonSubTypes({
        @JsonSubTypes.Type(value = DataDeliveryCredentialSubject.class, name = "merlot:MerlotServiceOfferingDataDelivery"),
        @JsonSubTypes.Type(value = SaaSCredentialSubject.class, name = "merlot:MerlotServiceOfferingSaaS"),
        @JsonSubTypes.Type(value = CooperationCredentialSubject.class, name = "merlot:MerlotServiceOfferingCooperation")
})
@JsonInclude(JsonInclude.Include.NON_NULL)
public abstract class ServiceOfferingCredentialSubject extends SelfDescriptionCredentialSubject {

    // inherited from gax-core:ServiceOffering

    @NotNull
    @JsonProperty("gax-core:offeredBy")
    private NodeKindIRITypeId offeredBy;

    @JsonFormat(with = JsonFormat.Feature.ACCEPT_SINGLE_VALUE_AS_ARRAY)
    @JsonProperty("gax-core:aggregationOf")
    private List<NodeKindIRITypeId> coreAggregationOf;

    @JsonFormat(with = JsonFormat.Feature.ACCEPT_SINGLE_VALUE_AS_ARRAY)
    @JsonProperty("gax-core:dependsOn")
    private List<NodeKindIRITypeId> coreDependsOn;

    // inherited from gax-trust-framework:ServiceOffering

    @NotNull
    @JsonProperty("gax-trust-framework:name")
    private StringTypeValue name;

    @NotNull
    @JsonFormat(with = JsonFormat.Feature.ACCEPT_SINGLE_VALUE_AS_ARRAY)
    @JsonProperty("gax-trust-framework:termsAndConditions")
    private List<TermsAndConditions> termsAndConditions;

    @NotNull
    @JsonFormat(with = JsonFormat.Feature.ACCEPT_SINGLE_VALUE_AS_ARRAY)
    @JsonProperty("gax-trust-framework:policy")
    private List<StringTypeValue> policy;

    @JsonFormat(with = JsonFormat.Feature.ACCEPT_SINGLE_VALUE_AS_ARRAY)
    @JsonProperty("gax-trust-framework:dataProtectionRegime")
    private List<StringTypeValue> dataProtectionRegime;

    @NotNull
    @JsonFormat(with = JsonFormat.Feature.ACCEPT_SINGLE_VALUE_AS_ARRAY)
    @JsonProperty("gax-trust-framework:dataAccountExport")
    private List<DataAccountExport> dataAccountExport;

    @JsonProperty("dct:description")
    private StringTypeValue description;

    @JsonFormat(with = JsonFormat.Feature.ACCEPT_SINGLE_VALUE_AS_ARRAY)
    @JsonProperty("dcat:keyword")
    private List<StringTypeValue> keyword;

    @JsonProperty("gax-trust-framework:provisionType")
    private StringTypeValue provisionType;

    @JsonFormat(with = JsonFormat.Feature.ACCEPT_SINGLE_VALUE_AS_ARRAY)
    @JsonProperty("gax-trust-framework:endpoint")
    private List<Endpoint> endpoint;

    @NotNull
    @JsonProperty("gax-trust-framework:providedBy")
    private NodeKindIRITypeId providedBy;

    @JsonFormat(with = JsonFormat.Feature.ACCEPT_SINGLE_VALUE_AS_ARRAY)
    @JsonProperty("gax-trust-framework:aggregationOf")
    private List<NodeKindIRITypeId> trustAggregationOf;

    @JsonFormat(with = JsonFormat.Feature.ACCEPT_SINGLE_VALUE_AS_ARRAY)
    @JsonProperty("gax-trust-framework:dependsOn")
    private List<StringTypeValue> trustDependsOn;

    @JsonFormat(with = JsonFormat.Feature.ACCEPT_SINGLE_VALUE_AS_ARRAY)
    @JsonProperty("gax-trust-framework:ServiceOfferingLocations")
    private List<StringTypeValue> serviceOfferingLocations;

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

package eu.merloteducation.modelslib.gxfscatalog.selfdescriptions.serviceofferings;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import eu.merloteducation.modelslib.gxfscatalog.datatypes.DataExchangeCount;
import eu.merloteducation.modelslib.gxfscatalog.datatypes.StringTypeValue;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@JsonInclude(JsonInclude.Include.NON_NULL)
public class DataDeliveryCredentialSubject extends ServiceOfferingCredentialSubject {
    // inherited from merlot:MerlotServiceOfferingDataDelivery

    @NotNull
    @JsonProperty("merlot:dataAccessType")
    private StringTypeValue dataAccessType;

    @NotNull
    @JsonProperty("merlot:dataTransferType")
    private StringTypeValue dataTransferType;

    @JsonFormat(with = JsonFormat.Feature.ACCEPT_SINGLE_VALUE_AS_ARRAY)
    @JsonProperty("merlot:exchangeCountOption")
    private List<DataExchangeCount> exchangeCountOptions;
}

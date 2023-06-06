package eu.merloteducation.modelslib.gxfscatalog;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class DataExchangeCount {

    @JsonProperty("merlot:exchangeCountUpTo")
    private NumberTypeValue exchangeCountUpTo;

    @JsonProperty("merlot:exchangeCountUnlimited")
    private boolean exchangeCountUnlimited;

}

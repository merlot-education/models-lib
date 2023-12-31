package eu.merloteducation.modelslib.gxfscatalog.datatypes;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class VCard {

    @JsonProperty("@type")
    private String type;

    @JsonProperty("vcard:country-name")
    private StringTypeValue countryName;

    @JsonProperty("vcard:street-address")
    private StringTypeValue streetAddress;

    @JsonProperty("vcard:locality")
    private StringTypeValue locality;

    @JsonProperty("vcard:postal-code")
    private StringTypeValue postalCode;
}

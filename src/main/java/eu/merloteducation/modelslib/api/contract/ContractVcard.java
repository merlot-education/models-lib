package eu.merloteducation.modelslib.api.contract;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ContractVcard {

    private String countryCode;

    private String countrySubdivisionCode;

    private String streetAddress;

    private String locality;

    private String postalCode;
}

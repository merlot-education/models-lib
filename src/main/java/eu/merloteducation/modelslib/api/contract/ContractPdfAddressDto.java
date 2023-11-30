package eu.merloteducation.modelslib.api.contract;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ContractPdfAddressDto {
    private String countryName;
    private String streetAddress;
    private String locality;
    private String postalCode;
}

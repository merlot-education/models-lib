package eu.merloteducation.modelslib.api.serviceoffering;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ServiceOfferingBasicDto {
    private String id;
    private String type;
    private String state;
    private String name;
    private String creationDate;
    private String providerLegalName;
}

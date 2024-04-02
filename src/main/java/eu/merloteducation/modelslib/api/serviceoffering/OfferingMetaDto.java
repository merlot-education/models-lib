package eu.merloteducation.modelslib.api.serviceoffering;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class OfferingMetaDto {
    private String state;
    private String hash;
    private String creationDate;
    private String modifiedDate;
    private String signedBy;
}

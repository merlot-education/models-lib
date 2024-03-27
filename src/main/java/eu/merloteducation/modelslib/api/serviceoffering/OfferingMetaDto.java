package eu.merloteducation.modelslib.api.serviceoffering;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class OfferingMetaDto {
    String state;
    String hash;
    String creationDate;
    String modifiedDate;
    String signedBy;
}

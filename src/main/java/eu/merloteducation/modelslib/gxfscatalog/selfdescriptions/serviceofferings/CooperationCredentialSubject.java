package eu.merloteducation.modelslib.gxfscatalog.selfdescriptions.serviceofferings;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@JsonInclude(JsonInclude.Include.NON_NULL)
public class CooperationCredentialSubject extends MerlotServiceOfferingCredentialSubject {
    // does not have any special fields on its own, inherits everything from general offering
}

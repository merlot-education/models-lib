package eu.merloteducation.modelslib.gxfscatalog.selfdescriptionsmeta;

import eu.merloteducation.modelslib.gxfscatalog.selfdescriptions.serviceoffering.ServiceOfferingCredentialSubject;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class SelfDescriptionItem<T extends ServiceOfferingCredentialSubject> {
    private SelfDescriptionMeta<T> meta;
}

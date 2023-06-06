package eu.merloteducation.modelslib.gxfscatalog.selfdescriptionsmeta;

import eu.merloteducation.modelslib.gxfscatalog.selfdescriptions.serviceoffering.ServiceOfferingCredentialSubject;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class SelfDescriptionsResponse<T extends ServiceOfferingCredentialSubject> {
    private int totalCount;
    private List<SelfDescriptionItem<T>> items;
}

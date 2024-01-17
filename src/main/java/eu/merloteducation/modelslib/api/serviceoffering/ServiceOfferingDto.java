package eu.merloteducation.modelslib.api.serviceoffering;

import eu.merloteducation.gxfscataloglibrary.models.selfdescriptions.SelfDescription;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ServiceOfferingDto {
    private OfferingMetaDto metadata;
    private ProviderDetailsDto providerDetails;
    private SelfDescription selfDescription;
}

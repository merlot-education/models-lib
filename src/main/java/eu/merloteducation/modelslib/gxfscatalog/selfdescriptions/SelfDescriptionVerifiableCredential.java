package eu.merloteducation.modelslib.gxfscatalog.selfdescriptions;

import eu.merloteducation.modelslib.gxfscatalog.selfdescriptions.serviceoffering.ServiceOfferingCredentialSubject;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class SelfDescriptionVerifiableCredential<T extends ServiceOfferingCredentialSubject> {
    private T credentialSubject;
}

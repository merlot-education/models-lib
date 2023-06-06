package eu.merloteducation.modelslib.gxfscatalog.selfdescriptionsmeta;

import eu.merloteducation.modelslib.gxfscatalog.selfdescriptions.SelfDescription;
import eu.merloteducation.modelslib.gxfscatalog.selfdescriptions.serviceoffering.ServiceOfferingCredentialSubject;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class SelfDescriptionMeta<T extends ServiceOfferingCredentialSubject> {
    private String expirationTime;
    private SelfDescription<T> content;
    private List<String> validators;
    private String subjectId;
    private String sdHash;
    private String id;
    private String status;
    private String issuer;
    private List<String> validatorDids;
    private String uploadDatetime;
    private String statusDatetime;
}

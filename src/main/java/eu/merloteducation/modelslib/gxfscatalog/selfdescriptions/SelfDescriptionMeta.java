package eu.merloteducation.modelslib.gxfscatalog.selfdescriptions;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class SelfDescriptionMeta<T extends SelfDescriptionCredentialSubject> {
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

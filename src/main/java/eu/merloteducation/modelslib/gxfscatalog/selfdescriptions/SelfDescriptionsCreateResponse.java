package eu.merloteducation.modelslib.gxfscatalog.selfdescriptions;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class SelfDescriptionsCreateResponse {

    private String sdHash;

    private String id;

    private String status;

    private String issuer;

    private List<String> validatorDids;

    private String uploadDatetime;

    private String statusDatetime;

}

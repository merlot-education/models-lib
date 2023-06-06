package eu.merloteducation.modelslib.gxfscatalog.selfdescriptions;

import com.fasterxml.jackson.annotation.JsonProperty;
import eu.merloteducation.modelslib.gxfscatalog.selfdescriptions.serviceoffering.ServiceOfferingCredentialSubject;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

import java.util.List;
import java.util.Map;

@Getter
@Setter
public class SelfDescription<T extends ServiceOfferingCredentialSubject> {

    @NotNull
    @JsonProperty("@id")
    private String id;
    private List<String> type;

    @NotNull
    @JsonProperty("@context")
    private List<String> context;

    private Map<String, String> proof;

    private SelfDescriptionVerifiableCredential<T> verifiableCredential;

}

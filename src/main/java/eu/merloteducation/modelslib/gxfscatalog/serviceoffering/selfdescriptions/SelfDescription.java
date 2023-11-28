package eu.merloteducation.modelslib.gxfscatalog.serviceoffering.selfdescriptions;

import com.fasterxml.jackson.annotation.JsonProperty;
import eu.merloteducation.modelslib.gxfscatalog.serviceoffering.SDProof;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class SelfDescription {

    @NotNull
    @JsonProperty("@id")
    private String id;
    private List<String> type;

    @NotNull
    @JsonProperty("@context")
    private List<String> context;

    private SDProof proof;

    private SelfDescriptionVerifiableCredential verifiableCredential;

}

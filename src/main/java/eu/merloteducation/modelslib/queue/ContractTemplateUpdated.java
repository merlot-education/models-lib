package eu.merloteducation.modelslib.queue;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;

@Getter
public class ContractTemplateUpdated {
    @NotNull
    private final String contractId;

    @NotNull
    private final String serviceOfferingId;

    public ContractTemplateUpdated(@JsonProperty("contractId") String contractId,
                                   @JsonProperty("serviceOfferingId") String serviceOfferingId) {
        this.contractId = contractId;
        this.serviceOfferingId = serviceOfferingId;
    }
}

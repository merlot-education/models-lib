package eu.merloteducation.modelslib.queue;

import jakarta.validation.constraints.NotNull;
import lombok.Getter;

@Getter
public class ContractTemplateUpdated {
    @NotNull
    private final String contractId;

    @NotNull
    private final String serviceOfferingId;

    public ContractTemplateUpdated(String contractId, String offeringId) {
        this.contractId = contractId;
        this.serviceOfferingId = offeringId;
    }
}

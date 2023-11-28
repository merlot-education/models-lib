package eu.merloteducation.modelslib.edc;

import eu.merloteducation.modelslib.edc.negotiation.ContractNegotiation;
import lombok.Getter;

@Getter
public class EdcNegotiationStatus {

    private final String id;

    private final String state;

    private final String contractAgreementId;

    public EdcNegotiationStatus(ContractNegotiation negotiation) {
        this.id = negotiation.getId();
        this.state = negotiation.getState();
        this.contractAgreementId = negotiation.getContractAgreementId();
    }
}

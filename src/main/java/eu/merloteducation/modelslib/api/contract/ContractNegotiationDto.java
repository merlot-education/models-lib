package eu.merloteducation.modelslib.api.contract;

import com.fasterxml.jackson.annotation.JsonView;
import eu.merloteducation.modelslib.api.contract.views.ContractViews;
import lombok.Getter;
import lombok.Setter;

import java.util.Set;

@Getter
@Setter
public class ContractNegotiationDto {
    private String runtimeSelection;
    private String additionalAgreements;
    private Set<String> attachments;

    @JsonView(ContractViews.ConsumerView.class)
    private boolean consumerTncAccepted;

    @JsonView(ContractViews.ConsumerView.class)
    private boolean consumerAttachmentsAccepted;

    @JsonView(ContractViews.ProviderView.class)
    private boolean providerTncAccepted;

}

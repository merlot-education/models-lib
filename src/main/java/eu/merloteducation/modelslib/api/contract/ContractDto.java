package eu.merloteducation.modelslib.api.contract;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import eu.merloteducation.modelslib.api.contract.cooperation.CooperationContractDto;
import eu.merloteducation.modelslib.api.contract.datadelivery.DataDeliveryContractDto;
import eu.merloteducation.modelslib.api.contract.saas.SaasContractDto;
import eu.merloteducation.modelslib.api.serviceoffering.ServiceOfferingDto;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, property = "type", visible = true)
@JsonSubTypes({
        @JsonSubTypes.Type(value = DataDeliveryContractDto.class, name = "DataDeliveryContractTemplate"),
        @JsonSubTypes.Type(value = SaasContractDto.class, name = "SaasContractTemplate"),
        @JsonSubTypes.Type(value = CooperationContractDto.class, name = "CooperationContractTemplate")
})
public class ContractDto {
    private String type;
    private ContractDetailsDto details;
    private ContractNegotiationDto negotiation;
    private ContractProvisioningDto provisioning;
    private ServiceOfferingDto offering;
}

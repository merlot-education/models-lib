package eu.merloteducation.modelslib.api.contract;

import com.fasterxml.jackson.databind.JsonNode;
import eu.merloteducation.modelslib.gxfscatalog.datatypes.VCard;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

@Getter
@Setter
@ToString
public class ContractDetailsDto {

    private String id;

    private String creationDate;

    private String providerId;

    private String providerLegalName;

    private VCard providerLegalAddress;

    private String consumerId;

    private String consumerLegalName;

    private VCard consumerLegalAddress;

    private String state;

    private List<ContractTncDto> termsAndConditions;

    private String consumerSignerUserName;

    private String consumerSignature;

    private String consumerSignatureDate;

    private String providerSignerUserName;

    private String providerSignature;

    private String providerSignatureDate;
}

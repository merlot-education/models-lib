package eu.merloteducation.modelslib.edc.contractdefinition;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import eu.merloteducation.modelslib.edc.EdcConstants;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Criterion {

    @JsonProperty("@type")
    private String type = EdcConstants.EDC_PREFIX + "CriterionDto";

    @JsonProperty(EdcConstants.EDC_PREFIX + "operandLeft")
    private Object operandLeft;

    @JsonProperty(EdcConstants.EDC_PREFIX + "operator")
    private String operator;

    @JsonFormat(with = JsonFormat.Feature.ACCEPT_SINGLE_VALUE_AS_ARRAY)
    @JsonProperty(EdcConstants.EDC_PREFIX + "operandRight")
    private Object operandRight;

    @Builder
    public Criterion(Object operandLeft,
                     String operator,
                     Object operandRight) {
        this.operandLeft = operandLeft;
        this.operator = operator;
        this.operandRight = operandRight;
    }
}

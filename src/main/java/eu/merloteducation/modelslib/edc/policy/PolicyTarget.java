package eu.merloteducation.modelslib.edc.policy;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Builder
public class PolicyTarget {
    @JsonProperty("@id")
    private String id;
}

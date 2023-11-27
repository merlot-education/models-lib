package eu.merloteducation.modelslib.api.contract;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class ContractTncDto {
    private String content;
    private String hash;
}

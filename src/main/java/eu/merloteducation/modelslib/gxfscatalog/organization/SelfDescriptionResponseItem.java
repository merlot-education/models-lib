package eu.merloteducation.modelslib.gxfscatalog.organization;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@JsonIgnoreProperties({"content"})
public class SelfDescriptionResponseItem {
    private SelfDescriptionMeta meta;
}

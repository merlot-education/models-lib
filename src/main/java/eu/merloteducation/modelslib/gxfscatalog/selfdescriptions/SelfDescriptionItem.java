package eu.merloteducation.modelslib.gxfscatalog.selfdescriptions;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@JsonIgnoreProperties(value = {"content"})
public class SelfDescriptionItem<T extends SelfDescriptionCredentialSubject> {
    private SelfDescriptionMeta<T> meta;
}

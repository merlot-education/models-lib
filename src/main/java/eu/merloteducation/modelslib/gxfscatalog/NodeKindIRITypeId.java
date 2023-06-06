package eu.merloteducation.modelslib.gxfscatalog;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class NodeKindIRITypeId {
    @NotNull
    @JsonProperty("@type")
    private String type;

    @NotNull
    @JsonProperty("@id")
    private String id;

    public NodeKindIRITypeId(@NotNull String id) {
        this.id = id;
    }
}

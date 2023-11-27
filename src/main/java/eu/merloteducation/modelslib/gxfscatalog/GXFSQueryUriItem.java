package eu.merloteducation.modelslib.gxfscatalog;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class GXFSQueryUriItem {
    @JsonProperty("p.uri")
    private String uri;
}

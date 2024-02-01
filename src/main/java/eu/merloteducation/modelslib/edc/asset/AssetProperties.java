package eu.merloteducation.modelslib.edc.asset;

import com.fasterxml.jackson.annotation.JsonProperty;
import eu.merloteducation.modelslib.edc.EdcConstants;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class AssetProperties {
    private String name;

    private String description;

    private String version;

    private String contenttype;
}

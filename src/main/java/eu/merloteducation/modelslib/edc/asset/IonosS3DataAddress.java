package eu.merloteducation.modelslib.edc.asset;

import com.fasterxml.jackson.annotation.JsonProperty;
import eu.merloteducation.modelslib.edc.EdcConstants;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Builder
public class IonosS3DataAddress extends DataAddress{

    private static final String TYPE = "IonosS3";

    private String name;
    private String bucketName;
    private String container;
    private String blobName;
    private String keyName;
    private String storage;

    @JsonProperty("type")
    public String getDataType() {
        return TYPE;
    }
}

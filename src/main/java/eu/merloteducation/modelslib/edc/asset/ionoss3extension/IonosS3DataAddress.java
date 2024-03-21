package eu.merloteducation.modelslib.edc.asset.ionoss3extension;

import com.fasterxml.jackson.annotation.JsonProperty;
import eu.merloteducation.modelslib.edc.asset.DataAddress;
import lombok.*;
import lombok.experimental.SuperBuilder;

@Getter
@Setter
@SuperBuilder
@NoArgsConstructor
public class IonosS3DataAddress extends DataAddress {

    private static final String TYPE = "IonosS3";

    private String name; // TODO check if needed
    private String bucketName;
    private String container; // TODO check if needed
    private String keyName;
    private String storage;

    @JsonProperty("type")
    public String getDataType() {
        return TYPE;
    }
}

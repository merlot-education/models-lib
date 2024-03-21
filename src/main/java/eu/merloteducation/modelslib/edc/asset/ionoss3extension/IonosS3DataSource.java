package eu.merloteducation.modelslib.edc.asset.ionoss3extension;

import lombok.*;
import lombok.experimental.SuperBuilder;

@Getter
@Setter
@ToString
@SuperBuilder
@NoArgsConstructor
public class IonosS3DataSource extends IonosS3DataAddress {
    private String blobName;
    private String filterIncludes;
    private String filterExcludes;
}

package eu.merloteducation.modelslib.edc.asset.ionoss3extension;

import lombok.*;
import lombok.experimental.SuperBuilder;

@Getter
@Setter
@ToString
@SuperBuilder
@NoArgsConstructor
public class IonosS3DataDestination extends IonosS3DataAddress {
    private String path;
}

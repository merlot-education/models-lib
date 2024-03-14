package eu.merloteducation.modelslib.api.organization;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class IonosS3BucketDto {
    private String name;
    private String storageEndpoint;
}

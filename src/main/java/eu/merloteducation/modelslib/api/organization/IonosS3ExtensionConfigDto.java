package eu.merloteducation.modelslib.api.organization;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class IonosS3ExtensionConfigDto {
    private List<IonosS3BucketDto> buckets;
}

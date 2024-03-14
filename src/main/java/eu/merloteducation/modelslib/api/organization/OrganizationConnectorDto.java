package eu.merloteducation.modelslib.api.organization;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Data
@NoArgsConstructor
public class OrganizationConnectorDto {
    private String connectorId;

    private String connectorEndpoint;

    private String connectorAccessToken;

    private IonosS3ExtensionConfigDto ionosS3ExtensionConfig;
}

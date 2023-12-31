package eu.merloteducation.modelslib.api.organization;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class PostOrganisationConnectorModel {
    private String connectorId;
    private String connectorEndpoint;
    private String connectorAccessToken;
    private List<String> bucketNames;
}

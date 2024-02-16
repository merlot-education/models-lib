package eu.merloteducation.modelslib.api.organization;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class OrganizationConnectorTransferDto {
    private String orgaId;

    private String connectorId;

    private String connectorEndpoint;

    private String connectorAccessToken;

    private List<String> bucketNames;

    public String getApiBaseUrl() {
        return this.connectorEndpoint + "/api";
    }
    public String getManagementBaseUrl() {
        return this.connectorEndpoint + "/management";
    }

    public String getProtocolBaseUrl() {
        return this.connectorEndpoint + "/protocol";
    }

    public String getPublicBaseUrl() {
        return this.connectorEndpoint + "/public";
    }

    public String getControlBaseUrl() {
        return this.connectorEndpoint + "/control";
    }
}

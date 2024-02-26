package eu.merloteducation.modelslib.api.organization;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class OrganizationConnectorTransferDto extends OrganizationConnectorDto {
    private String orgaId;

    public String getApiBaseUrl() {
        return this.getConnectorEndpoint() + "/api";
    }
    public String getManagementBaseUrl() {
        return this.getConnectorEndpoint() + "/management";
    }

    public String getProtocolBaseUrl() {
        return this.getConnectorEndpoint() + "/protocol";
    }

    public String getPublicBaseUrl() {
        return this.getConnectorEndpoint() + "/public";
    }

    public String getControlBaseUrl() {
        return this.getConnectorEndpoint() + "/control";
    }
}

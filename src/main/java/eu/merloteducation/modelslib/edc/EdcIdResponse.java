package eu.merloteducation.modelslib.edc;

import eu.merloteducation.modelslib.edc.common.IdResponse;
import lombok.Getter;

@Getter
public class EdcIdResponse {

    private final String id;

    public EdcIdResponse(IdResponse response) {
        this.id = response.getId();
    }
}

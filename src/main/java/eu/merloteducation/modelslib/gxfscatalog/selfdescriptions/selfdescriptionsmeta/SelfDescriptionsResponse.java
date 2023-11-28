package eu.merloteducation.modelslib.gxfscatalog.selfdescriptions.selfdescriptionsmeta;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class SelfDescriptionsResponse {
    private int totalCount;
    private List<SelfDescriptionItem> items;
}

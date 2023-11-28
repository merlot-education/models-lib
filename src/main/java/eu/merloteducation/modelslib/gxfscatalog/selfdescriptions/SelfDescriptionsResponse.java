package eu.merloteducation.modelslib.gxfscatalog.selfdescriptions;

import eu.merloteducation.modelslib.gxfscatalog.serviceoffering.selfdescriptionsmeta.SelfDescriptionItem;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class SelfDescriptionsResponse<T> {
    private int totalCount;
    private List<T> items;
}

package eu.merloteducation.modelslib.gxfscatalog.selfdescriptions;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class GXFSCatalogListResponse<T> {
    private int totalCount;
    private List<T> items;
}

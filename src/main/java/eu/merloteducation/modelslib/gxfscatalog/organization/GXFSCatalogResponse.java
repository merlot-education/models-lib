package eu.merloteducation.modelslib.gxfscatalog.organization;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class GXFSCatalogResponse<T> {
    private int totalCount;
    private List<T> items;
}

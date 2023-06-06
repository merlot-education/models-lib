package eu.merloteducation.modelslib.gxfscatalog;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class AllowedUserCount {
    @JsonProperty("merlot:userCountUpTo")
    private NumberTypeValue userCountUpTo;

    @JsonProperty("merlot:userCountUnlimited")
    private boolean userCountUnlimited;

}

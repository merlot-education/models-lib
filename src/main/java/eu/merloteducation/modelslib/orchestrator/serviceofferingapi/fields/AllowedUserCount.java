package eu.merloteducation.modelslib.orchestrator.serviceofferingapi.fields;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class AllowedUserCount {
    private int userCountUpTo;
    private boolean userCountUnlimited;
}

package eu.merloteducation.modelslib.orchestrator.serviceofferingapi.fields;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class DataExchangeCount {
    private int exchangeCountUpTo;
    private boolean exchangeCountUnlimited;
}

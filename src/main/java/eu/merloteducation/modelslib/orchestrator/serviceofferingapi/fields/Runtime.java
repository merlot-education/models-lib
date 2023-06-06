package eu.merloteducation.modelslib.orchestrator.serviceofferingapi.fields;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Runtime {
    private int runtimeCount;
    private String runtimeMeasurement; // TODO enum instead?
    private boolean runtimeUnlimited;
}

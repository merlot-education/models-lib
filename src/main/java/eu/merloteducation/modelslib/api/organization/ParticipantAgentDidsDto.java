package eu.merloteducation.modelslib.api.organization;

import lombok.Getter;
import lombok.Setter;

import java.util.Set;

@Getter
@Setter
public class ParticipantAgentDidsDto {
    private Set<String> agentDids;
}

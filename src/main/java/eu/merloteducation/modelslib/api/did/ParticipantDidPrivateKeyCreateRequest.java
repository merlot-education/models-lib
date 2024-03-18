package eu.merloteducation.modelslib.api.did;

import jakarta.validation.constraints.NotNull;
import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ParticipantDidPrivateKeyCreateRequest {
    @NotNull
    private String subject;
}
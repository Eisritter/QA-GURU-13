package favQs.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class CreateSessionResponse {

    private String login;
    private String email;
    private String UserToken;
}

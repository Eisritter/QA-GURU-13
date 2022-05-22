package favQs.model;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class User {

    private String login;
    private String password;

    public User(String login, String password) {
        this.login = login;
        this.password = password;
    }
}



package favQs.model;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Session {

    private User user;

    public Session(User user) {
        this.user = user;
    }

    public User getUser() {
        return user;
    }
}

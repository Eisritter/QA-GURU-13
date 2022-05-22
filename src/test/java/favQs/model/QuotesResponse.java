package favQs.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class QuotesResponse {
    private boolean favorite;
    private boolean dialogue;
    private int id;

    public boolean getDialogue() {
        return this.dialogue;
    }

    public boolean getFavorite() {
        return this.favorite;
    }

    public int getId() {
        return this.id;
    }
}

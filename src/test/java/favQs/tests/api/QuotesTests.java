package favQs.tests.api;

import favQs.model.CreateSessionResponse;
import favQs.model.QuotesResponse;
import favQs.model.Session;
import favQs.model.User;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static favQs.spec.SpecRequest.requestSpec;
import static favQs.spec.SpecResponse.responseSpec;
import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.*;
import static org.assertj.core.api.Assertions.assertThat;

public class QuotesTests extends TestBaseApi {

    @Test
    @Tag("API")
    @DisplayName("Получение списка цитат 2й страницы")
    void listQuotesTest() {
        given()
                .spec(requestSpec)
                .when()
                .get("/quotes/?page=2")
                .then()
                .log().all()
                .statusCode(200)
                .body("page", is(2));
    }

    @Test
    @Tag("API")
    @DisplayName("Создание сессии")
    void createSessionTest() {
        User user = new User("eisritterdiplom", "12345");
        Session session = new Session(user);

        CreateSessionResponse SessionResponse =
                given()
                        .header("Authorization", "Token token=\"e4c51aa55fcf78afb4b9ed03273deb61\"")
                        .contentType("application/json")
                        .body(session)
                        .when()
                        .post("/session")
                        .then()
                        .log().all()
                        .spec(responseSpec)
                        .extract().as(CreateSessionResponse.class);
        assertThat(SessionResponse.getLogin()).isEqualTo("eisritterdiplom");
        assertThat(SessionResponse.getEmail()).isEqualTo("eisritterdiplom@gmail.com");
    }

    @Test
    @Tag("API")
    @DisplayName("Положительно оценить цитату")
    void upVoteQuoteTest() {
        QuotesResponse quotesResponse =
                given()
                        .spec(requestSpec)
                        .when()
                        .put("/quotes/4/upvote")
                        .then()
                        .log().all()
                        .spec(responseSpec)
                        .body("user_details.upvote", is(true))
                        .extract().as(QuotesResponse.class);

        assertThat(quotesResponse.getId()).isEqualTo(4);

    }

    @Test
    @Tag("API")
    @DisplayName("Добавить цитату в избранное")
    void favQuoteTest() {
        given()
                .spec(requestSpec)
                .when()
                .log().all()
                .put("/quotes/4/fav")
                .then()
                .log().all()
                .spec(responseSpec)
                .body("user_details.favorite", is(true));
    }
}

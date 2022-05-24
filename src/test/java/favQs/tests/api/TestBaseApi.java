package favQs.tests.api;

import io.restassured.RestAssured;
import org.junit.jupiter.api.BeforeAll;

import static favQs.helpers.AllureRestAssuredFilter.withCustomTemplates;

public class TestBaseApi {
    @BeforeAll
    static void beforeAll() {
        RestAssured.filters(withCustomTemplates());
        RestAssured.baseURI = "https://favqs.com/api/";
    }
}

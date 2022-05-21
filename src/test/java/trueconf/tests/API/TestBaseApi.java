package trueconf.tests.API;

import io.restassured.RestAssured;
import org.junit.jupiter.api.BeforeAll;

public class TestBaseApi {
    @BeforeAll
    static void beforeAll() {
        RestAssured.baseURI = "https://demowebshop.tricentis.com/";
    }
}

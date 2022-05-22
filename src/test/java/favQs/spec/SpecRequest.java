package favQs.spec;

import io.restassured.specification.RequestSpecification;

import static io.restassured.RestAssured.with;

public class SpecRequest {

    public static RequestSpecification requestSpec = with()
            .header("Authorization", "Token token=\"e4c51aa55fcf78afb4b9ed03273deb61\"")
            .header("User-Token", "WFt2/qzCRAKxUBYkM856hCFw71lHBCF+sF1hVoZVK8VvRmtIsDiHMtEQUmlxGacKnRg6Y1asOvZyP8ruNpvMXQ==")
            .contentType("application/json");
}

package trueconf.pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public class LoginPage {

    SelenideElement
            signInButton = $(".btn-primary"),
            alertInfo = $(".alert-info");

    public void signInButtonClick() {
        signInButton.click();
    }

    public void alertInfoCheck() {
        alertInfo.shouldHave((Condition.text("You entered an invalid login or password.")));
    }
}

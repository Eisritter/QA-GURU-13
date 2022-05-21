package favQs.pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class MainPage {

    SelenideElement
            searchInput = $("#search"),
            appButton = $(byText("App")),
            loginButton = $("#login-button"),
            legalButton = $(byText("Legal"));

    public void openPage() {
        open("https://favqs.com");
    }

    public void appButtonClick() {
        appButton.click();
    }

    public void legalButtonClick() {
        legalButton.click();
    }

    public void loginButtonClick() {
        loginButton.click();
    }

    public void SearchQuotesInput() {
        searchInput.setValue("Never, never, never, never give up").pressEnter();
    }
}

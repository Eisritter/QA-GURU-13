package favQs.pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.enabled;
import static com.codeborne.selenide.Selenide.$;

public class AppPage {

    SelenideElement
            appLink = $("#mac-app-store");

    public void appLinkCheck() {
        appLink.shouldBe(enabled);
    }
}

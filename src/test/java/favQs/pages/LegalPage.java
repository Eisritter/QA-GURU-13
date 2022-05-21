package favQs.pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;

public class LegalPage {

    SelenideElement
            privacyPolicyButton = $(byText("Privacy Policy")),
            contactEmail = $(byText("support@favqs.com"));

    public void privacyPolicyButtonClick() {
        privacyPolicyButton.click();
    }

    public void contactEmailCheck() {
        contactEmail.shouldBe(visible);
    }
}

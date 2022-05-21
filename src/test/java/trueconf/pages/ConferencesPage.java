package trueconf.pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public class ConferencesPage {

    SelenideElement
            joinConferenceButton = $(".default-button--orange");

    public void joinConferenceButtonClickable() {
        joinConferenceButton.click();
    }
}

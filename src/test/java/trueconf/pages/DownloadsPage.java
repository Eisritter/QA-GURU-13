package trueconf.pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;

public class DownloadsPage {

    SelenideElement
            freeDownloadButton = $(".default-button__text");

    public void checkFreeDownloadButton() {
        freeDownloadButton.shouldBe(visible);
    }
}

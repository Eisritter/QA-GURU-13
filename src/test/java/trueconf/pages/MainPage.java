package trueconf.pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class MainPage {

    SelenideElement
            downloadButton = $(byText("Скачать")),
            blogButton = $(byText("Наш блог")),
            joinConferenceButton = $(byText("Войти в конференцию")),
            priceButton = $(byText("Цены"));

    public void openPage() {
        open("https://trueconf.ru");
    }

    public void blogButtonClick() {
        blogButton.click();
    }

    public void downloadButtonClick() {
        downloadButton.click();
    }

    public void joinConferenceButtonClick() {
        joinConferenceButton.click();
    }

    public void priceButtonClick() {
        priceButton.click();
    }
}

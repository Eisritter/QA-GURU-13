package trueconf.pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;

public class PricesPage {

    SelenideElement
            chooseTariffButton = $(byText("Выбрать тариф")),
            headerPage = $("h1");

    public void chooseTariffButtonClick() {
        chooseTariffButton.click();
    }

    public void headerPageCheck() {
        headerPage.shouldHave(text("Тарифы TrueConf Online"));
    }
}

package trueconf.pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;

public class BlogPage {

    SelenideElement
            webinarsLink = $(".link_category");

    public void webinarsLinkCheck() {
        webinarsLink.shouldHave(text("Вебинары"));
    }
}

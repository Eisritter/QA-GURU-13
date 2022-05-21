package favQs.pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;

public class SearchPage {

    SelenideElement
            quoteAuthor = $(".quote-author", 1);

    public void quoteAuthorCheck() {
        quoteAuthor.shouldHave(text("Winston Churchill"));
    }
}

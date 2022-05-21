package favQs.tests.UI;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import favQs.pages.*;

import static com.codeborne.selenide.Selenide.*;
import static io.qameta.allure.Allure.step;
import static org.assertj.core.api.Assertions.assertThat;


public class FavQsUiTests extends TestBaseUi {
    AppPage appPage = new AppPage();
    LoginPage loginPage = new LoginPage();
    SearchPage searchPage = new SearchPage();
    MainPage mainPage = new MainPage();
    LegalPage legalPage = new LegalPage();


    @Test
    @DisplayName("Поиск цитаты Уинстона Черчилля")
    void searchQuotesTest() {
        step("Открыть https://favqs.com/", () -> {
            mainPage.openPage();
        });

        step("Ввести цитату 'Never, never, never, never give up'", () -> {
            mainPage.SearchQuotesInput();
        });

        step("Проверяем, что автор данной цитаты Уинстон Черчилль", () -> {
            searchPage.quoteAuthorCheck();
        });
    }

    @Test
    @DisplayName("На странице App ссылка приложения для iphone активна")
    void iphoneAppLinkTest() {
        step("Открыть https://favqs.com/", () -> {
            mainPage.openPage();
        });

        step("Клик на кнопку 'App'", () -> {
            mainPage.appButtonClick();
        });

        step("Проверяем, что ссылка приложения для iphone активна", () -> {
            appPage.appLinkCheck();
        });
    }

    @Test
    @DisplayName("На странице Privacy policy есть контактная почта")
    void contactEmailTest() {
        step("Открыть https://favqs.com/", () -> {
            mainPage.openPage();
        });

        step("Нажать на кнопку 'Legal'", () -> {
            mainPage.legalButtonClick();
        });

        step("Нажать на кнопку 'Privacy Policy'", () -> {
            legalPage.privacyPolicyButtonClick();
        });

        step("Проверяем, что на странице есть контактная почта", () -> {
            legalPage.contactEmailCheck();
        });
    }

    @Test
    @DisplayName("При авторизации с некорректными данными появляется подсказка")
    void alertLoginPageTests() {
        step("Открыть https://favqs.com/", () -> {
            mainPage.openPage();
        });

        step("Клик по 'Login'", () -> {
            mainPage.loginButtonClick();
        });

        step("Клик по 'Sign In'", () -> {
            loginPage.signInButtonClick();
        });

        step("Проверяем, что появилась подсказка с текстом 'You entered an invalid login or password'", () -> {
            loginPage.alertInfoCheck();
        });
    }


    @Test
    @DisplayName("У заголовка вкладки актуальный текст")
    void TitlePageTests() {
        step("Открыть 'https://favqs.com/'", () ->
                mainPage.openPage());

        step("Проверяем, что заголовок вкладки должен быть 'FavQs'", () -> {
            String expectedTitle = "FavQs";
            String actualTitle = title();

            assertThat(actualTitle).isEqualTo(expectedTitle);
        });
    }
}
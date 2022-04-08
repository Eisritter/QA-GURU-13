package cloud.autotests.tests;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;
import static io.qameta.allure.Allure.step;
import static org.assertj.core.api.Assertions.assertThat;


public class TrueconfTests extends TestBase {
    @Test
    @DisplayName("На странице скачивания для Windows есть кнопка 'Скачать бесплатно'")
    void TryFreeForBrowsers() {
        step("Открыть https://trueconf.ru/", () -> {
            open("https://trueconf.ru/");
        });

        step("Нажать кнопку 'Скачать'", () -> {
            $(byText("Скачать")).click();
        });

        step("На странице есть кнопка 'Скачать бесплатно'", () -> {
           $(".default-button__text").shouldBe(visible);
        });
    }

    @Test
    @DisplayName("В блоге есть ссылка на вебинары")
    void CheckWebinarsLink() {
        step("Открыть https://trueconf.ru/", () -> {
            open("https://trueconf.ru/");
        });

        step("Клик на кнопку 'Наш блог'", () -> {
            $(byText("Наш блог")).click();
        });

        step("На странице есть ссылка на вебинары", () -> {
            $(".link_category").shouldHave(text("Вебинары"));
        });
    }

    @Test
    @DisplayName("Кнопка 'Онлайн-консультация' активна")
    void CheckRegistrationButton() {
        step("Открыть https://trueconf.ru/", () -> {
            open("https://trueconf.ru/");
        });

        step("Кнопка 'онлайн-консультация' кликабельна", () -> {
            $(".chat-button-wrapper__button z-depth-1").shouldBe(visible);
        });
    }

    @Test
    @DisplayName("Проверка открытия страницы тарифов")
    void CheckTariffs() {
        step("Открыть https://trueconf.ru/", () -> {
            open("https://trueconf.ru/");
        });

        step("Клик по 'Цены'", () -> {
            $(byText("Цены")).click();
        });

        step("Клик по 'Выбрать тариф'", () -> {
            $(byText("Выбрать тариф")).click();
        });

        step("В заголовке страницы содержится текст 'Тарифы TrueConf Online'", () -> {
            $("h1").shouldHave(text("Тарифы TrueConf Online"));
        });
    }

    @Test
    @DisplayName("У заголовка вкладки актуальный текст")
    void CheckTitlePage() {
        step("Open url 'https://trueconf.ru/'", () ->
            open("https://trueconf.ru/"));

        step("Заголовок вкладки должен быть 'Видеоконференция в локальной сети и через интернет Видеоконференции для бизнеса — TrueConf'", () -> {
            String expectedTitle = "Видеоконференция в локальной сети и через интернет Видеоконференции для бизнеса — TrueConf";
            String actualTitle = title();

            assertThat(actualTitle).isEqualTo(expectedTitle);
        });
    }
}
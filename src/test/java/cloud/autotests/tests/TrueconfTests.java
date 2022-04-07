package cloud.autotests.tests;

import cloud.autotests.helpers.DriverUtils;
import com.codeborne.selenide.Condition;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.visible;
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
    @DisplayName("На главной странице указан актуальный номер телефона")
    void CheckTelephoneNumber() {
        step("Открыть https://trueconf.ru/", () -> {
            open("https://trueconf.ru/");
        });

        step("На странице указан актуальный номер телефона", () -> {
            $("#wac").shouldHave(Condition.attribute(("+7 (495) 698-60-66")));
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
            $("h1").shouldHave(Condition.text("Тарифы TrueConf Online"));
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

    @Test
    @DisplayName("В консоли логов браузера нет ошибок")
    void consoleShouldNotHaveErrorsTest() {
        step("Open url 'https://trueconf.ru/'", () ->
            open("https://trueconf.ru/"));

        step("Логи консоли браузера не содержат текст 'SEVERE'", () -> {
            String consoleLogs = DriverUtils.getConsoleLogs();
            String errorText = "SEVERE";

            assertThat(consoleLogs).doesNotContain(errorText);
        });
    }
}
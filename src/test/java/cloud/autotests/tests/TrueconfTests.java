package cloud.autotests.tests;

import cloud.autotests.helpers.DriverUtils;
import com.codeborne.selenide.Condition;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;
import static io.qameta.allure.Allure.step;
import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.error.ShouldBe.shouldBe;


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
    @DisplayName("На странице 'Контакты' указан актуальный номер")
    void CheckPhoneNumber() {
        step("Открыть https://trueconf.ru/", () -> {
            open("https://trueconf.ru/");
        });

        step("Клик по 'Компания'", () -> {
            $(byText("Компания")).click();

        });

        step("Клик по 'Контакты'", () -> {
            $(".h4").click();
        });

        step("В заголовке страницы содержится текст 'Тарифы TrueConf Online'", () -> {
            $("li.contacts").find(String.valueOf(text("8 (800) 101-60-66"))).shouldBe(visible);
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
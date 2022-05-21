package trueconf.tests;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import trueconf.pages.*;

import static com.codeborne.selenide.Selenide.*;
import static io.qameta.allure.Allure.step;
import static org.assertj.core.api.Assertions.assertThat;


public class TrueconfTests extends TestBase {

    BlogPage blogPage = new BlogPage();
    ConferencesPage conferencesPage = new ConferencesPage();
    DownloadsPage downloadsPage = new DownloadsPage();
    MainPage mainPage = new MainPage();
    PricesPage pricesPage = new PricesPage();


    @Test
    @DisplayName("На странице скачивания для Windows есть кнопка 'Скачать бесплатно'")
    void tryFreeForBrowsers() {
        step("Открыть https://trueconf.ru/", () -> {
            mainPage.openPage();
        });

        step("Нажать кнопку 'Скачать'", () -> {
            mainPage.downloadButtonClick();
        });

        step("Проверяем, что на странице есть кнопка 'Скачать бесплатно'", () -> {
            downloadsPage.checkFreeDownloadButton();
        });
    }

    @Test
    @DisplayName("В блоге есть ссылка на вебинары")
    void checkWebinarsLink() {
        step("Открыть https://trueconf.ru/", () -> {
            mainPage.openPage();
        });

        step("Клик на кнопку 'Наш блог'", () -> {
            mainPage.blogButtonClick();
        });

        step("Проверяем, что на странице есть ссылка на вебинары", () -> {
            blogPage.webinarsLinkCheck();
        });
    }

    @Test
    @DisplayName("Кнопка 'Войти в конференцию' кликабельна")
    void checkRegistrationButton() {
        step("Открыть https://trueconf.ru/", () -> {
            mainPage.openPage();
        });

        step("Нажать на кнопку 'Войти в конференцию' в хедере", () -> {
            mainPage.joinConferenceButtonClick();
        });

        step("Проверяем, что кнопка 'Войти в конференцию' кликабельна", () -> {
            conferencesPage.joinConferenceButtonClickable();
        });
    }

    @Test
    @DisplayName("Проверка открытия страницы тарифов")
    void checkTariffs() {
        step("Открыть https://trueconf.ru/", () -> {
            mainPage.openPage();
        });

        step("Клик по 'Цены'", () -> {
            mainPage.priceButtonClick();
        });

        step("Клик по 'Выбрать тариф'", () -> {
            pricesPage.chooseTariffButtonClick();
        });

        step("Проверяем, что в заголовке страницы содержится текст 'Тарифы TrueConf Online'", () -> {
            pricesPage.headerPageCheck();
        });
    }

    @Test
    @DisplayName("У заголовка вкладки актуальный текст")
    void checkTitlePage() {
        step("Open url 'https://trueconf.ru/'", () ->
                mainPage.openPage());

        step("Проверяем, что заголовок вкладки должен быть 'Видеоконференция в локальной сети и через интернет Видеоконференции для бизнеса — TrueConf'", () -> {
            String expectedTitle = "Видеоконференция в локальной сети и через интернет Видеоконференции для бизнеса — TrueConf";
            String actualTitle = title();

            assertThat(actualTitle).isEqualTo(expectedTitle);
        });
    }
}
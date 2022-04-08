# Проект по автоматизации тестирования для <a target="_blank" href="https://trueconf.ru/">Trueconf</a>

## 📃 Содержание:

- [Технологии и инструменты](#earth_africa-технологии-и-инструменты)
- [Реализованные проверки](#earth_africa-Реализованные-проверки)
- [Сборка в Jenkins](#earth_africa-Jenkins-job)
- [Запуск из терминала](#earth_africa-Запуск-тестов-из-терминала)
- [Allure отчет](#earth_africa-Allure-отчет)
- [Отчет в Telegram](#earth_africa-Уведомление-в-Telegram-при-помощи-бота)
- [Видео примеры прохождения тестов](#earth_africa-Примеры-видео-о-прохождении-тестов)

## :computer: Технологии и инструменты
<p align="center">
<img width="6%" title="IntelliJ IDEA" src="src/test/resources/logo/Intelij_IDEA.svg">
<img width="6%" title="Java" src="src/test/resources/logo/Java.svg">
<img width="6%" title="Selenide" src="src/test/resources/logo/Selenide.svg">
<img width="6%" title="Selenoid" src="src/test/resources/logo/Selenoid.svg">
<img width="6%" title="Allure Report" src="src/test/resources/logo/Allure_Report.svg">
<img width="6%" title="Gradle" src="src/test/resources/logo/Gradle.svg">
<img width="6%" title="JUnit5" src="src/test/resources/logo/JUnit5.svg">
<img width="6%" title="GitHub" src="src/test/resources/logo/GitHub.svg">
<img width="6%" title="Jenkins" src="src/test/resources/logo/Jenkins.svg">
<img width="6%" title="Telegram" src="src/test/resources/logo/Telegram.svg">
</p>

## :boom: Реализованные проверки

- ✓ На странице скачивания для Windows есть кнопка 'Скачать бесплатно'
- ✓ У заголовка вкладки верный текст
- ✓ Страница тарифов TrueConf Online открывается
- ✓ Кнопка 'Войти в конференцию' кликабельна
- ✓ На странице блога есть ссылка на вебинары

## <img src="src/test/resources/logo/Jenkins.svg" width="25" height="25"  alt="Jenkins"/></a> Jenkins job
<a target="_blank" href="https://jenkins.autotests.cloud/job/C11-eisritter-unit13-homework//">Сборка в Jenkins</a>
<p align="center">
<a href="https://jenkins.autotests.cloud/job/C11-eisritter-unit13-homework//"><img src="src/test/resources/screenshots/jenkins-dashboard.png" alt="Jenkins"/></a>
</p>

### :maple_leaf: Параметры сборки в Jenkins:

- browser (браузер, по умолчанию chrome)
- browserSize (размер окна браузера, по умолчанию 1920x1080)
- remoteDriverUrl (логин, пароль и адрес удаленного сервера selenoid или grid)
- threads (количество потоков)
- AlureNotificationVersion (версия AllureNotification)

## :computer: Запуск тестов из терминала

Локальный запуск:
```
gradle clean test
```

Удаленный запуск:
```
clean
test
-Dbrowser=${BROWSER}
-DbrowserSize=${BROWSER_SIZE}
-DremoteDriverUrl=https://user1:1234@${REMOTE_DRIVER_URL}/wd/hub/
-DvideoStorage=https://${REMOTE_DRIVER_URL}/video/
-Dthreads=${THREADS}
```
## <img src="src/test/resources/logo/Allure_Report.svg" width="25" height="25"  alt="Allure"/></a> Отчет в <a target="_blank" href="https://jenkins.autotests.cloud/job/C11-eisritter-unit13-homework/allure">Allure report</a>

### :lady_beetle: Основное окно

<p align="center">
<img title="Allure Overview Dashboard" src="src/test/resources/screenshots/allure-main-page.png">
</p>

### :cherries: Тесты

<p align="center">
<img title="Allure Tests" src="src/test/resources/screenshots/allure-test-page.png">
</p>

## <img src="src/test/resources/logo/Telegram.svg" width="25" height="25"  alt="Allure"/></a> Уведомление в Telegram при помощи бота

<p align="center">
<img title="Telegram bot" src="src/test/resources/screenshots/telegram_bot.png" >
</p>


## <img src="src/test/resources/logo/Selenoid.svg" width="25" height="25"  alt="Allure"/></a> Видео прохождения теста

<p align="center">
<img title="Selenoid Video" src="src/test/resources/gif/testvideo.gif" alt="video"> 
</p>

# Проект по автоматизации тестирования для <a target="_blank" href="https://favQs.com/">FavQs</a>

## 📃 Содержание:

- [Технологии и инструменты](#computer-технологии-и-инструменты)
- [Реализованные проверки](#boom-Реализованные-проверки)
- [Сборка в Jenkins](#-сборка-в-jenkins)
- [Запуск из терминала](#computer-Запуск-тестов-из-терминала)
- [Отчет в Allure report](#-отчет-в-allure-report)
- [Отчет в Telegram](#-уведомление-в-telegram-при-помощи-бота)
- [Видео пример прохождения тестов](#-видео-пример-прохождения-теста)

## :computer: Технологии и инструменты
<p align="center">
<img width="6%" title="IntelliJ IDEA" src="image/logo/Intelij_IDEA.svg">
<img width="6%" title="Java" src="image/logo/Java.svg">
<img width="6%" title="Selenide" src="image/logo/Selenide.svg">
<img width="6%" title="Selenoid" src="image/logo/Selenoid.svg">
<img width="6%" title="Allure Report" src="image/logo/Allure_Report.svg">
<img width="6%" title="Allure TestOps" src="image/logo/Allure_TestOps.svg">
<img width="6%" title="Gradle" src="image/logo/Gradle.svg">
<img width="6%" title="JUnit5" src="image/logo/JUnit5.svg">
<img width="6%" title="GitHub" src="image/logo/GitHub.svg">
<img width="6%" title="Jenkins" src="image/logo/Jenkins.svg">
<img width="6%" title="Telegram" src="image/logo/Telegram.svg">
 <img width="6%" title="Telegram" src="image/logo/Rest-Assured.svg">
</p>

## :boom: Реализованные проверки
### &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; UI

> - [x] *Проверка заголовка страницы входа в Систему*
>- [x] *Лог консоли браузера на странице входа в Систему не содержит ошибок*
>- [x] *Успешный вход в Систему*
>- [x] *Попытка входа в Систему вне рабочего расписания доступа*
>- [x] *Попытка входа в Систему с неразрешенного IP-адреса*
>- [x] *Попытка входа в Систему под пользователем с истекшим сроком доступа*
>- [x] *Попытка входа в Систему под пользователем с отключенной учетной записью*
>- [x] *Попытка входа в Систему с невалидным значением логина*
>- [x] *Попытка входа в Систему без указания пароля*
>- [x] *Переход на страницу 'Восстановление пароля'*
### &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; API

>- [x] *Успешное начало процедуры восстановления пароля пользователя*
>- [x] *Ошибка начала процедуры восстановления пароля пользователя без указания логина*
>- [x] *Ошибка начала процедуры восстановления пароля пользователя по неизвестному логину*
>- [x] *Ошибка начала процедуры восстановления пароля пользователя с не подтвержденным адресом электронной почты*
>- [x] *Ошибка начала процедуры восстановления пароля пользователя с не указанным адресом электронной почты*
>- [x] *Ошибка начала процедуры восстановления пароля пользователя с отключенной учетной записью*


## <img src="image/logo/Jenkins.svg" width="25" height="25"  alt="Jenkins"/></a> Сборка в Jenkins
<a target="_blank" href="https://jenkins.autotests.cloud/job/C11-eisritter-UI/">Jenkins job</a>
<p align="center">
<a href="https://jenkins.autotests.cloud/job/C11-eisritter-UI-and-API/"><img src="image/screenshots/jenkins-dashboard.png" alt="Jenkins"/></a>
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
-DbrowserVersion=${BROWSER_VERSION}
-DbrowserSize=${BROWSER_SIZE}
-DbrowserMobileView="${BROWSER_MOBILE}"
-DremoteDriverUrl=https://${USER}:${PASSWORD}@${REMOTE_DRIVER_URL}/wd/hub/
-DvideoStorage=https://${REMOTE_DRIVER_URL}/video/
-Dthreads=${THREADS}
```
## <img src="image/logo/Allure_Report.svg" width="25" height="25"  alt="Allure"/></a> Отчет в <a target="_blank" href="https://jenkins.autotests.cloud/job/C11-eisritter-unit13-homework/allure">Allure report</a>

### :lady_beetle: Основное окно

<p align="center">
<img title="Allure Overview Dashboard" src="image/screenshots/allure-main-page.png">
</p>

### :cherries: Тесты

<p align="center">
<img title="Allure Tests" src="image/screenshots/allure-test-page.png">
</p>

## <img src="image/logo/Allure_TestOps.svg" width="25" height="25"  alt="Allure"/></a> Отчет в <a target="_blank" href="https://allure.autotests.cloud/project/1322/dashboards">Allure TestOps</a>

### :lady_beetle: Результаты запуска тестов

<p align="center">
<img title="Allure Launches" src="image/screenshots/allure-test-ops-launches.png">
</p>

### :cherries: Тест-кейсы

<p align="center">
<img title="Allure Tests Cases" src="image/screenshots/allure-test-ops-test-cases.png">
</p>

## <img src="image/logo/Telegram.svg" width="25" height="25"  alt="Allure"/></a> Уведомление в Telegram при помощи бота

<p align="center">
<img title="Telegram bot" src="image/screenshots/telegram_bot.png" >
</p>


## <img src="image/logo/Selenoid.svg" width="25" height="25"  alt="Allure"/></a> Видео пример прохождения UI теста

<p align="center">
<img title="Selenoid Video" src="image/gif/testvideo.gif" alt="video"> 
</p>

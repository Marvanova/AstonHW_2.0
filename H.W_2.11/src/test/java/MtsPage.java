import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class MtsPage {

    private final WebDriver driver;
    private final WebDriverWait wait;

    public MtsPage(WebDriver driver, WebDriverWait wait) {
        this.driver = driver;
        this.wait = wait;
    }

    private final By blockTitle = By.xpath(
            "//h2[contains(text(),'Онлайн пополнение')]");

    private final By paymentLogos = By.xpath(
            "//img[contains(@src,'visa') or contains(@src,'mastercard') or " +
                    "contains(@src,'belkart') or contains(@alt,'Visa') or " +
                    "contains(@alt,'MasterCard') or contains(@alt,'Белкарт')]");

    private final By moreInfoLink = By.xpath(
            "//a[contains(text(),'Подробнее о сервисе')]");

    private final By tabServices = By.xpath(
            "//a[h3[contains(normalize-space(text()),'Услуги связи')]]");
    private final By tabInternet = By.xpath(
            "//a[h3[contains(normalize-space(text()),'Домашний интернет')]]");
    private final By tabInstallment = By.xpath(
            "//a[h3[contains(normalize-space(text()),'Рассрочка')]]");
    private final By tabArrears = By.xpath(
            "//a[h3[contains(normalize-space(text()),'Задолженность')]]");

    private final By phoneInput = By.id("connection-phone");
    private final By sumInput = By.xpath(
            "//input[contains(@placeholder,'умма')] | " +
                    "//input[contains(@id,'sum')]");
    private final By continueButton = By.xpath(
            "//form[@id='pay-connection']//button[@type='submit'] | " +
                    "//button[@type='submit' and contains(normalize-space(text()),'Продолжить')] | " +
                    "//button[contains(normalize-space(text()),'Продолжить')]");

    private final By cookieBanner = By.xpath(
            "//button[contains(text(),'Принять') or contains(text(),'Согласен')]");

    private final By paymentWindow = By.xpath(
            "//input[contains(@placeholder,'Номер карты')]");

    private final By windowTotalAmount = By.xpath(
            "//*[contains(text(),'BYN') and string-length(normalize-space(text())) < 20]");

    private final By windowPhone = By.xpath(
            "//*[contains(text(),'375297777777')]");

    private final By windowCardPlaceholder = By.xpath(
            "//input[contains(@placeholder,'Номер карты')]");

    private final By windowCardExpiry = By.xpath(
            "//input[contains(@placeholder,'Срок действия')]");

    private final By windowCardCvc = By.xpath(
            "//input[contains(@placeholder,'CVC')]");

    private final By windowCardHolder = By.xpath(
            "//input[contains(@placeholder,'Имя и фамилия')]");

    private final By windowPaymentLogos = By.xpath(
            "//img[contains(@src,'visa') or contains(@src,'mastercard') or " +
                    "contains(@src,'belkart') or contains(@src,'mir')]");

    @Step("Закрыть куки-баннер (если появился)")
    public void closeCookieBannerIfPresent() {
        try {
            WebElement button = wait.until(ExpectedConditions.elementToBeClickable(cookieBanner));
            button.click();
        } catch (Exception e) {
        }
    }

    @Step("Получить заголовок блока «Онлайн пополнение»")
    public WebElement getBlockTitle() {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(blockTitle));
    }

    @Step("Получить логотипы платёжных систем")
    public List<WebElement> getPaymentLogos() {
        wait.until(ExpectedConditions.presenceOfElementLocated(paymentLogos));
        return driver.findElements(paymentLogos);
    }

    @Step("Получить ссылку «Подробнее о сервисе»")
    public WebElement getMoreInfoLink() {
        return wait.until(ExpectedConditions.elementToBeClickable(moreInfoLink));
    }

    @Step("Открыть вкладку: {tabName}")
    public void clickTab(String tabName) {
        By locator;
        switch (tabName) {
            case "Услуги связи":      locator = tabServices; break;
            case "Домашний интернет": locator = tabInternet; break;
            case "Рассрочка":         locator = tabInstallment; break;
            case "Задолженность":     locator = tabArrears; break;
            default: throw new IllegalArgumentException("Неизвестная вкладка: " + tabName);
        }
        try {
            WebElement tab = new WebDriverWait(driver, Duration.ofSeconds(3))
                    .until(ExpectedConditions.elementToBeClickable(locator));
            tab.click();
        } catch (Exception e) {
            System.out.println("Вкладка '" + tabName + "' не кликнута (возможно, открыта по умолчанию)");
        }
    }

    @Step("Получить поле «Номер телефона»")
    public WebElement getPhoneInput() {
        try {
            return new WebDriverWait(driver, Duration.ofSeconds(10))
                    .until(ExpectedConditions.visibilityOfElementLocated(phoneInput));
        } catch (Exception e) {
            System.out.println("Поле 'Номер телефона' не найдено: " + e.getMessage());
            return null;
        }
    }

    @Step("Получить поле «Сумма»")
    public WebElement getSumInput() {
        try {
            return new WebDriverWait(driver, Duration.ofSeconds(10))
                    .until(ExpectedConditions.visibilityOfElementLocated(sumInput));
        } catch (Exception e) {
            System.out.println("Поле 'Сумма' не найдено: " + e.getMessage());
            return null;
        }
    }

    @Step("Нажать кнопку «Продолжить»")
    public void clickContinue() {
        WebElement button = wait.until(ExpectedConditions.visibilityOfElementLocated(continueButton));
        ((JavascriptExecutor) driver)
                .executeScript("arguments[0].scrollIntoView({block:'center'});", button);
        try { Thread.sleep(500); } catch (InterruptedException ignored) {}
        try {
            button.click();
        } catch (Exception e) {
            ((JavascriptExecutor) driver).executeScript("arguments[0].click();", button);
        }
    }

    @Step("Проверить, открылось ли окно bePaid")
    public boolean isPaymentWindowOpened() {
        try {
            new WebDriverWait(driver, Duration.ofSeconds(10))
                    .until(ExpectedConditions.visibilityOfElementLocated(paymentWindow));
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    @Step("Проверить, заблокирована ли форма SmartCaptcha")
    public boolean isBlockedByCaptcha() {
        String source = driver.getPageSource().toLowerCase();
        return source.contains("smartcaptcha") || source.contains("captcha");
    }

    @Step("Получить сумму в окне bePaid")
    public WebElement getWindowTotalAmount() {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(windowTotalAmount));
    }

    @Step("Получить номер телефона в окне bePaid")
    public WebElement getWindowPhone() {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(windowPhone));
    }

    @Step("Получить плейсхолдер поля «Номер карты»")
    public WebElement getWindowCardPlaceholder() {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(windowCardPlaceholder));
    }

    @Step("Получить плейсхолдер поля «Срок действия»")
    public WebElement getWindowCardExpiry() {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(windowCardExpiry));
    }

    @Step("Получить плейсхолдер поля «CVC»")
    public WebElement getWindowCardCvc() {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(windowCardCvc));
    }

    @Step("Получить плейсхолдер поля «Имя и фамилия»")
    public WebElement getWindowCardHolder() {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(windowCardHolder));
    }

    @Step("Получить логотипы ПС в окне bePaid")
    public List<WebElement> getWindowPaymentLogos() {
        wait.until(ExpectedConditions.presenceOfElementLocated(windowPaymentLogos));
        return driver.findElements(windowPaymentLogos);
    }
}
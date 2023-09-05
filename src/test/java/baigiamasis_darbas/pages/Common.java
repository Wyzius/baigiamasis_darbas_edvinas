package baigiamasis_darbas.pages;

import baigiamasis_darbas.utilities.Driver;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

public class Common {

    public static Alert getAlert() {
        return Driver.getInstance().switchTo().alert();
    }

    public static void setUpChromeDriver() {
        Driver.setChrome();
    }

    public static void openUrl(String url) {
        Driver.getInstance().get(url);
    }

    public static void quitWebDriver() {
        Driver.quitWebDriver();
    }

    public static WebElement getElement(By locator) {
        return Driver.getInstance().findElement(locator);
    }

    public static List<WebElement> getElements(By locator) {
        return Driver.getInstance().findElements(locator);
    }

    public static void sendKeysToElement(By locator, String message) {
        getElement(locator).sendKeys(message);
    }

    public static void clickOnElement(By locator) {
        getElement(locator).click();
    }

    public static String getTextFromElement(By locator) {
        return getElement(locator).getText();
    }

    public static boolean isElementSelected(By locator) {
        return getElement(locator).isSelected();
    }

    public static boolean isElementEnabled(By locator) {
        return getElement(locator).isEnabled();
    }

    public static List<Boolean> getSelectedStatusesOfCheckBoxGroup(By locator) {
        List<Boolean> statusList = new ArrayList<>();

        for (WebElement element : getElements(locator)) {
            statusList.add(element.isSelected());
        }

        return statusList;
    }

    public static String getElementAttributeValue(By locator, String attributeName) {
        return getElement(locator).getAttribute(attributeName);
    }

    public static void selectOptionByValue(By locator, String selectValue) {
        WebElement element = getElement(locator);

        Select select = new Select(element);

        select.selectByValue(selectValue);
    }

    public static void acceptAlert() {
        Driver.getInstance().switchTo().alert().accept();
    }

    public static String getTextFromAlert() {
        return getAlert().getText();
    }

    public static boolean isAlertPresent() {
        try {
            getAlert();
        } catch (NoAlertPresentException e) {
            return false;
        }
        return true;
    }

    public static void cancelAlert() {
        getAlert().dismiss();
    }

    public static void sendKeysToAlert(String message) {
        getAlert().sendKeys(message);
    }

    public static void waitForElementToBeVisible(By locator) {
        WebDriverWait wait = new WebDriverWait(Driver.getInstance(), Duration.ofSeconds(8));
        wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
    }
}

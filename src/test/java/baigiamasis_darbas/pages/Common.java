package baigiamasis_darbas.pages;

import baigiamasis_darbas.utilities.Driver;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

public class Common {

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

    public static boolean isElementVisible(By locator) {
        return getElement(locator).isDisplayed();
    }

    public static void waitForElementToBeVisible(By locator) {
        WebDriverWait wait = new WebDriverWait(Driver.getInstance(), Duration.ofSeconds(8));
        wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
    }
    public static boolean waitForElementToBeVisibleAfterCustomised(By locator, int seconds) {
        int count = 0;

        for (int i = 1; i <= (seconds * 2); i++) {
            try {
                Thread.sleep(500);
                if (isElementVisible(locator)){
                    return true;
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }catch (NoSuchElementException e){
                System.out.println("catch counting" + (++count));
            }
        }
        return false;
    }

    public static List<String> getSearchResults(By locator) {
        List<WebElement> elements = getElements(locator);
        List<String> searchResults = new ArrayList<>();

        for (WebElement element : elements){
            searchResults.add(element.getText().toLowerCase());
        }

        return searchResults;
    }
}

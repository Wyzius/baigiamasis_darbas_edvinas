package baigiamasis_darbas.pages.skonis_ir_kvapas;

import baigiamasis_darbas.pages.Common;
import baigiamasis_darbas.pages.Locators;
import java.util.List;

public class HomePage {

    public static void open() {
        Common.setUpChromeDriver();
        Common.openUrl("https://www.skonis-kvapas.lt/");
    }

    public static void acceptCookies() {
        boolean isVisible =
                Common.waitForElementToBeVisibleAfterCustomised(Locators.SkonisIrKvapas.HomePage.dialogCookies,
                        8
                );
        if (isVisible){
            Common.clickOnElement(Locators.SkonisIrKvapas.HomePage.acceptCookies);
        }
    }

    public static void inputIeskoti(String text) {
        Common.sendKeysToElement(Locators.SkonisIrKvapas.HomePage.itemsSearch, text);
    }

    public static void clickOnPaieska() {
        Common.clickOnElement(Locators.SkonisIrKvapas.HomePage.buttonSearch);
    }

    public static boolean checkSearchResults(List<String> searchResultCriteria) {
        Common.waitForElementToBeVisible(Locators.SkonisIrKvapas.HomePage.productList);
        List<String> searchResults = Common.getSearchResults(Locators.SkonisIrKvapas.HomePage.productList);

        for (String result : searchResults) {
            if (compareResults(result, searchResultCriteria)){
                return false;
            }
        }
        return true;
    }

    private static boolean compareResults(String result, List<String> resultsCriteria) {
        for (String criteria : resultsCriteria) {
            if (!result.contains(criteria)) {
                return false;
            }
        }
        return true;
    }

    public static void clickOnManoPaskyra() {
        Common.clickOnElement(Locators.SkonisIrKvapas.HomePage.paragraphManoPaskyra);
    }
}

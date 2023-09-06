package baigiamasis_darbas.pages.skonis_ir_kvapas;

import baigiamasis_darbas.pages.Common;
import baigiamasis_darbas.pages.Locators;

import java.util.List;

public class ArbataPage {

    public static void open() {
        Common.setUpChromeDriver();
        Common.openUrl("https://www.skonis-kvapas.lt/arbata");
    }

    public static void clickOnCheckbox() {
        Common.clickOnElement(Locators.SkonisIrKvapas.Arbata.clickOnCategoryCheckbox);
    }

    public static boolean filteredItems(List<String> checkboxResultCriteria) {
        Common.waitForElementToBeVisible(Locators.SkonisIrKvapas.Arbata.checkboxFilteredItems);
        List<String> checkboxResults = Common.getSearchResults(Locators.SkonisIrKvapas.Arbata.checkboxFilteredItems);

        for (String result : checkboxResults) {
            if (compareResults(result, checkboxResultCriteria)){
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

    public static void selectItem(String item) {
        Common.clickOnElement(Locators.SkonisIrKvapas.Arbata.selectItem(item));
    }

    public static void AddWantedItemToCart() {
        Common.waitForElementToBeVisible(Locators.SkonisIrKvapas.Arbata.addItem);
        Common.clickOnElement(Locators.SkonisIrKvapas.Arbata.addItem);
    }

    public static void moveToPaymentDialog() {
        Common.waitForElementToBeVisible(Locators.SkonisIrKvapas.Arbata.waitForDialog);
        Common.clickOnElement(Locators.SkonisIrKvapas.Arbata.moveToPayment);
    }

    public static String cartItem(String item) {
        Common.waitForElementToBeVisible(Locators.SkonisIrKvapas.Arbata.visibleCart);
        return Common.getTextFromElement(Locators.SkonisIrKvapas.Arbata.cartItemName(item));
    }
}

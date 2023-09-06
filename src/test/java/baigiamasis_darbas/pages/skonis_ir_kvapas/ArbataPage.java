package baigiamasis_darbas.pages.skonis_ir_kvapas;

import baigiamasis_darbas.pages.Common;
import baigiamasis_darbas.pages.Locators;

import java.util.List;

public class ArbataPage {

    public static void open() {
        Common.setUpChromeDriver();
        Common.openUrl("https://www.skonis-kvapas.lt/arbata");
    }

    public static void selectItem(String item) {
        Common.clickOnElementByAction(Locators.SkonisIrKvapas.Arbata.selectItem(item));
    }

    public static void AddWantedItemToCart() {
        Common.waitForElementToBeVisible(Locators.SkonisIrKvapas.Arbata.addItem);
        Common.clickOnElementByAction(Locators.SkonisIrKvapas.Arbata.addItem);
    }

    public static void moveToPaymentDialog() {
        Common.waitForElementToBeVisible(Locators.SkonisIrKvapas.Arbata.waitForDialog);
        Common.clickOnElementByAction(Locators.SkonisIrKvapas.Arbata.buttonDark);
    }

    public static String cartItem(String item) {
        Common.waitForElementToBeVisible(Locators.SkonisIrKvapas.Arbata.sectionCart);
        return Common.getTextFromElement(Locators.SkonisIrKvapas.Arbata.cartItemName(item));
    }
}

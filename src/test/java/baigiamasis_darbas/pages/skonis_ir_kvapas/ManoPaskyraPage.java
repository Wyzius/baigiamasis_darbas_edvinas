package baigiamasis_darbas.pages.skonis_ir_kvapas;

import baigiamasis_darbas.pages.Common;
import baigiamasis_darbas.pages.Locators;

public class ManoPaskyraPage {
    public static void closeTab() {
        Common.waitForElementToBeClickable(Locators.SkonisIrKvapas.ManoPaskyra.clickOnCloseTab);
        Common.clickOnElement(Locators.SkonisIrKvapas.ManoPaskyra.clickOnCloseTab);
    }

    public static void clickOnInformacija() {
        Common.waitForElementToBeClickable(Locators.SkonisIrKvapas.ManoPaskyra.clickOnInformacija);
        Common.clickOnElement(Locators.SkonisIrKvapas.ManoPaskyra.clickOnInformacija);
    }
}

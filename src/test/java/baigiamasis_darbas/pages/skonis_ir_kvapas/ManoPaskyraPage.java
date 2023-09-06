package baigiamasis_darbas.pages.skonis_ir_kvapas;

import baigiamasis_darbas.pages.Common;
import baigiamasis_darbas.pages.Locators;

public class ManoPaskyraPage {
    public static void closeTab() {
        Common.waitForElementToBeClickable(Locators.SkonisIrKvapas.ManoPaskyra.close);
        Common.clickOnElement(Locators.SkonisIrKvapas.ManoPaskyra.close);
    }

    public static void clickOnInformacija() {
        Common.waitForElementToBeClickable(Locators.SkonisIrKvapas.ManoPaskyra.identityLink);
        Common.clickOnElement(Locators.SkonisIrKvapas.ManoPaskyra.identityLink);
    }
}

package baigiamasis_darbas.pages.skonis_ir_kvapas;

import baigiamasis_darbas.pages.Common;
import baigiamasis_darbas.pages.Locators;

public class InformacijaPage {

    public static String readAlert() {
        Common.waitForElementToBeVisible(Locators.SkonisIrKvapas.Informacija.messageSuccess);
        return Common.getTextFromElement(Locators.SkonisIrKvapas.Informacija.messageSuccess);
    }

    public static void inputName(String text) {
        Common.clearElementKeys(Locators.SkonisIrKvapas.Informacija.inputFirstName);
        Common.sendKeysToElement(Locators.SkonisIrKvapas.Informacija.inputFirstName, text);
    }

    public static void inputLastName(String text) {
        Common.clearElementKeys(Locators.SkonisIrKvapas.Informacija.inputLastName);
        Common.sendKeysToElement(Locators.SkonisIrKvapas.Informacija.inputLastName, text);
    }

    public static void inputSlaptazodis(String text) {
        Common.sendKeysToElement(Locators.SkonisIrKvapas.Informacija.inputPassword, text);
    }

    public static void clickOnCheckBoxPolicy() {
        Common.clickOnElement(Locators.SkonisIrKvapas.Informacija.checkBoxPolicy);
    }

    public static void clickOnButtonSaveInformation() {
        Common.clickOnElement(Locators.SkonisIrKvapas.Informacija.saveCustomer);
    }
}

package baigiamasis_darbas.pages.skonis_ir_kvapas;

import baigiamasis_darbas.pages.Common;
import baigiamasis_darbas.pages.Locators;

public class PrisijungimasPage {


    public static void open() {
        Common.setUpChromeDriver();
        Common.openUrl("https://www.skonis-kvapas.lt/prisijungimas");
    }

    public static void clickOnRegisterButton() {
        Common.clickOnElement(Locators.SkonisIrKvapas.Prisijungimas.buttonRegister);
    }

    public static void inputVardasRegister(String text) {
        Common.waitForElementToBeVisible(Locators.SkonisIrKvapas.Prisijungimas.inputName);
        Common.sendKeysToElement(Locators.SkonisIrKvapas.Prisijungimas.inputName, text);
    }

    public static void inputPavardeRegister(String text) {
        Common.sendKeysToElement(Locators.SkonisIrKvapas.Prisijungimas.inputLastName, text);
    }

    public static void inputPastasRegister(String text) {
        Common.sendKeysToElement(Locators.SkonisIrKvapas.Prisijungimas.inputEmailRegister, text);
    }

    public static void inputSlaptazodisRegister(String text) {
        Common.sendKeysToElement(Locators.SkonisIrKvapas.Prisijungimas.inputPasswordRegister, text);
    }

    public static void clickOnRegisterCheckBox() {
        Common.clickOnElement(Locators.SkonisIrKvapas.Prisijungimas.clickOnCheckBoxPolicy);
    }

    public static void clickOnIssaugoti() {
        Common.clickOnElement(Locators.SkonisIrKvapas.Prisijungimas.clickOnSaveCustomer);
    }

    public static String getAlert() {
        Common.waitForElementToBeVisible(Locators.SkonisIrKvapas.Prisijungimas.getAlertDanger);
        return Common.getTextFromElement(Locators.SkonisIrKvapas.Prisijungimas.getAlertDanger);
    }

    public static void inputPastasLogin(String text) {
        Common.sendKeysToElement(Locators.SkonisIrKvapas.Prisijungimas.inputEmailLogin, text);
    }

    public static void inputPasswordLogin(String text) {
        Common.sendKeysToElement(Locators.SkonisIrKvapas.Prisijungimas.inputPasswordLogin, text);
    }

    public static void clickOnButtonLogin() {
        Common.clickOnElement(Locators.SkonisIrKvapas.Prisijungimas.clickOnButtonSubmitLogin);
    }

    public static String getManoPaskyra() {
        Common.waitForElementToBeVisible(Locators.SkonisIrKvapas.Prisijungimas.getTextMyAccount);
        return Common.getTextFromElement(Locators.SkonisIrKvapas.Prisijungimas.getTextMyAccount);
    }
}
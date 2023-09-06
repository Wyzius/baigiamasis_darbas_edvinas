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
        Common.waitForElementToBeVisible(Locators.SkonisIrKvapas.Prisijungimas.inputFirstName);
        Common.sendKeysToElement(Locators.SkonisIrKvapas.Prisijungimas.inputFirstName, text);
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
        Common.clickOnElement(Locators.SkonisIrKvapas.Prisijungimas.checkboxPolicyRegister);
    }

    public static void clickOnIssaugoti() {
        Common.clickOnElement(Locators.SkonisIrKvapas.Prisijungimas.saveCustomer);
    }

    public static String getAlert() {
        Common.waitForElementToBeVisible(Locators.SkonisIrKvapas.Prisijungimas.messageBlock);
        return Common.getTextFromElement(Locators.SkonisIrKvapas.Prisijungimas.messageBlock);
    }

    public static void inputPastasLogin(String text) {
        Common.sendKeysToElement(Locators.SkonisIrKvapas.Prisijungimas.inputEmailLogin, text);
    }

    public static void inputPasswordLogin(String text) {
        Common.sendKeysToElement(Locators.SkonisIrKvapas.Prisijungimas.inputPasswordLogin, text);
    }

    public static void clickOnButtonLogin() {
        Common.clickOnElement(Locators.SkonisIrKvapas.Prisijungimas.submitLogin);
    }

    public static String getManoPaskyra() {
        Common.waitForElementToBeVisible(Locators.SkonisIrKvapas.Prisijungimas.paragraphManoPaskyra);
        return Common.getTextFromElement(Locators.SkonisIrKvapas.Prisijungimas.paragraphManoPaskyra);
    }

    public static void login() {
        String email = "auto.testas.edvinas@gmail.com";
        String password = "slaptazodis123";

        Common.sendKeysToElement(Locators.SkonisIrKvapas.Prisijungimas.inputEmailLogin, email);
        Common.sendKeysToElement(Locators.SkonisIrKvapas.Prisijungimas.inputPasswordLogin, password);
        Common.clickOnElement(Locators.SkonisIrKvapas.Prisijungimas.submitLogin);
    }
}

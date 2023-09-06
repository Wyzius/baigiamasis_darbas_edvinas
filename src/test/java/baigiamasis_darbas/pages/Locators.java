package baigiamasis_darbas.pages;

import org.openqa.selenium.By;

public class Locators {


    public class SkonisIrKvapas {

        public class Prisijungimas {

            public static By buttonRegister = By.xpath(
                    "//a[@data-link-action='display-register-form text-13px']");

            public static By inputName = By.xpath("//input[@name='firstname']");

            public static By inputLastName = By.xpath("//input[@name='lastname']");

            public static By inputEmailRegister = By.xpath(
                    "//div[@class='col-md-6 w-full']//input[@name='email']"
            );

            public static By inputPasswordRegister = By.xpath("//input[@type='password']");

            public static By clickOnCheckBoxPolicy = By.xpath("//input[@name='psgdpr']");

            public static By clickOnSaveCustomer = By.xpath(
                    "//button[@data-link-action='save-customer']"
            );

            public static By getAlertDanger = By.xpath("//div[@class='help-block']");

            public static By inputEmailLogin = By.xpath(
                    "//div[@class='col-md-6 w-full']//input[@name='email']"
            );

            public static By inputPasswordLogin = By.xpath(
                    "//div[@class='col-md-6 w-full']//input[@name='password']"
            );

            public static By clickOnButtonSubmitLogin = By.xpath("//button[@id='submit-login']");

            public static By getTextMyAccount = By.xpath(
                    "//div[@class='hidden lg:flex']//a[contains(text(),'Mano paskyra')]"
            );
        }

        public class HomePage {

            public static By dialogCookies = By.xpath("//div[@id='lgcookieslaw_banner']");

            public static By acceptCookies = By.xpath(
                    "//div[@id='lgcookieslaw_banner']//div[@class='lgcookieslaw-button-container']");

            public static By inputItemsSearch = By.xpath("//input[@id='items-search']");

            public static By clickOnSearchButton = By.xpath(
                    "//form[@id='search_widget']//button[@aria-label='Paieška']");

            public static By itemsOfSearchResults = By.xpath("//div[@id='js-product-list']");
        }

        public static class Arbata {
            public static By clickOnCategoryCheckbox = By.xpath(
                    "//ul[@class='checkbox-filter']//label[contains(text(),'Ulongo arbata')]");

            public static By checkboxFilteredItems = By.xpath("//div[@id='js-product-list']");

            public static By addItem = By.xpath(
                    "//div[@class='add w-full']//button[@aria-label='Į krepšelį']"
            );
            public static By waitForDialog = By.xpath("//div[@class='modal-footer flex justify-between']");

            public static By moveToPayment = By.xpath(
                    "//div[@class='modal-footer flex justify-between']//a[@class='button button--dark']"
            );

            public static By visibleCart = By.xpath("//section[@class='cart']");

            public static By selectItem(String item) {
                return By.xpath
                        (String.format("//h2[@class='products__item-title' and contains(text(),'%s')]",item)
                        );
            }

            public static By cartItemName(String item) {
                return By.xpath
                        (String.format
                                ("//h2[@class='cart-table__body-title hidden lg:block ok' and contains(text(),'%s')]",item)
                        );
            }
        }
    }
}

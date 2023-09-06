package baigiamasis_darbas.tests.skonis_ir_kvapas;

import baigiamasis_darbas.pages.skonis_ir_kvapas.HomePage;
import baigiamasis_darbas.pages.skonis_ir_kvapas.InformacijaPage;
import baigiamasis_darbas.pages.skonis_ir_kvapas.ManoPaskyraPage;
import baigiamasis_darbas.pages.skonis_ir_kvapas.PrisijungimasPage;
import baigiamasis_darbas.tests.BaseTest;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class InformacijaTest extends BaseTest {

    @BeforeMethod
    @Override
    public void setUP() {
        PrisijungimasPage.open();
        PrisijungimasPage.login();
        HomePage.acceptCookies();
        HomePage.clickOnManoPaskyra();
        ManoPaskyraPage.closeTab();
        ManoPaskyraPage.clickOnInformacija();
    }

    @DataProvider(name = "addFirtandLastNames")
    public Object[][] provideDataFirstAndLastNames(){
        return new Object[][]{
                {"Petras", "Petraitis", "Informacija atnaujinta."},
                {"Jonas", "Jonatis", "Informacija atnaujinta."},
                {"Edvinas", "Kazkas", "Informacija atnaujinta."}
        };
    }

    @Test(dataProvider = "addFirtandLastNames")
    public void testChangeUserNameAndLastName(String firstName, String lastName, String expectedResult){
        String slaptazodis = "slaptazodis123";
        String actualResult;

        InformacijaPage.inputName(firstName);
        InformacijaPage.inputLastName(lastName);
        InformacijaPage.inputSlaptazodis(slaptazodis);
        InformacijaPage.clickOnCheckBoxPolicy();
        InformacijaPage.clickOnButtonSaveInformation();
        actualResult = InformacijaPage.readAlert();

        Assert.assertEquals(actualResult, expectedResult);
    }
}

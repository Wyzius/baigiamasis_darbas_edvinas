package baigiamasis_darbas.tests.skonis_ir_kvapas;

import baigiamasis_darbas.pages.skonis_ir_kvapas.PrisijungimasPage;
import baigiamasis_darbas.tests.BaseTest;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class PrisijungimasTest extends BaseTest {

    @BeforeMethod
    @Override
    public void setUP() {
        PrisijungimasPage.open();
    }

    @Test
    public void testRegistrationWithPreExistingAccount(){
        String vardas = "Edvinas";
        String pavarde = "Kazkas";
        String elPastas = "auto.testas.edvinas@gmail.com";
        String slaptazodis = "slaptazodis123";
        String expectResult = "Šis el. pašto adresas jau naudojamas, pasirinkite kitą arba prisijunkite";
        String actualResult;

        PrisijungimasPage.clickOnRegisterButton();
        PrisijungimasPage.inputVardasRegister(vardas);
        PrisijungimasPage.inputPavardeRegister(pavarde);
        PrisijungimasPage.inputPastasRegister(elPastas);
        PrisijungimasPage.inputSlaptazodisRegister(slaptazodis);
        PrisijungimasPage.clickOnRegisterCheckBox();
        PrisijungimasPage.clickOnIssaugoti();

        actualResult = PrisijungimasPage.getAlert();

        Assert.assertEquals(actualResult, expectResult);
    }

    @Test
    public void testLoginWithExistingAccount(){
        String elPastas = "auto.testas.edvinas@gmail.com";
        String slaptazodis = "slaptazodis123";
        String expectedResult = "Mano paskyra";
        String actualResult;

        PrisijungimasPage.inputPastasLogin(elPastas);
        PrisijungimasPage.inputPasswordLogin(slaptazodis);
        PrisijungimasPage.clickOnButtonLogin();
        actualResult = PrisijungimasPage.getManoPaskyra();

        Assert.assertEquals(actualResult, expectedResult);
    }
}

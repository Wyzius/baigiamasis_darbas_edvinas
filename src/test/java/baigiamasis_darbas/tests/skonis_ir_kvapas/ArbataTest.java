package baigiamasis_darbas.tests.skonis_ir_kvapas;

import baigiamasis_darbas.pages.skonis_ir_kvapas.ArbataPage;
import baigiamasis_darbas.tests.BaseTest;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


public class ArbataTest extends BaseTest {

    @BeforeMethod
    @Override
    public void setUP() {
        ArbataPage.open();
    }


    @DataProvider(name = "teaToCart")
    public Object[][] provideDataForTestMultipleCheckBox() {
        return new Object[][]{
                {"Juodoji arbata SKONIS IR KVAPAS EARL GREY", "Juodoji arbata SKONIS IR KVAPAS EARL GREY"},
                {"Žalioji arbata CITRUSŲ VĖJAS", "Žalioji arbata CITRUSŲ VĖJAS"},
                {"Matė PARANA TRADITIONAL, 250 g", "Matė PARANA TRADITIONAL, 250 g"}
        };
    }

    @Test(dataProvider = "teaToCart")
    public void testAddTeaToCart(String itemName, String itemCartName){
        String actualResult;

        ArbataPage.selectItem(itemName);
        ArbataPage.AddWantedItemToCart();
        ArbataPage.moveToPaymentDialog();

        actualResult = ArbataPage.cartItem(itemCartName);

        Assert.assertEquals(actualResult, itemCartName);
    }
}

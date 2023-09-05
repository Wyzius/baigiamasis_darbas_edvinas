package baigiamasis_darbas.tests.skonis_ir_kvapas;

import baigiamasis_darbas.pages.skonis_ir_kvapas.HomePage;
import baigiamasis_darbas.tests.BaseTest;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import java.util.Arrays;
import java.util.List;

public class HomeTest extends BaseTest {


    @BeforeMethod
    @Override
    public void setUP() {
        HomePage.open();
        HomePage.acceptCookies();
    }

    @Test
    public void testSearchBoxRooibos(){
        String searchValue = "Rooibos";
        List<String> searchResultCriteria = Arrays.asList("Rooibos");
        boolean actualResult;

        HomePage.inputIeskoti(searchValue);
        HomePage.clickOnPaieska();

        actualResult = HomePage.checkSearchResults(searchResultCriteria);

        Assert.assertTrue(actualResult);
    }
}

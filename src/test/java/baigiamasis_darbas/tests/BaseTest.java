package baigiamasis_darbas.tests;

import baigiamasis_darbas.pages.Common;
import baigiamasis_darbas.utilities.TestListener;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;

@Listeners(TestListener.class)
public abstract class BaseTest {

    @BeforeMethod
    public abstract void setUP();

    @AfterMethod
    public void tearDown(){
        Common.quitWebDriver();
    }

}

package automation.practiceFramework;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class RegisterTest extends TestBase{
    RegisterPageObjects registerPageObjects;

    @BeforeClass(alwaysRun = true)
    public void initializePageObjects() {
        registerPageObjects = new RegisterPageObjects(driver);
    }

    @BeforeMethod(alwaysRun = true)
    public void navigateToRegisterPage(){
        driver.get("https://demo.guru99.com/test/newtours/register.php");
    }

    @Test(priority = 1)
    public void verifyMandatoryFieldsPresent(){
        SoftAssert softAssert = new SoftAssert();

        softAssert.assertTrue(registerPageObjects.inputUsername.isDisplayed(),"User Name is not displayed.");
        softAssert.assertTrue(registerPageObjects.inputPassword.isDisplayed(),"Password is not displayed.");
        softAssert.assertTrue(registerPageObjects.inputConfirmPassword.isDisplayed(),"Confirm Password is not displayed.");
        softAssert.assertTrue(registerPageObjects.buttonSubmit.isDisplayed(),"Submit Button is not displayed.");

        softAssert.assertAll();
    }

    @Test(priority = 2, dependsOnMethods = "verifyMandatoryFieldsPresent")
    public void verifyUserISAbleToRegister(){
        registerPageObjects.setTextUsername("Selenium");
        registerPageObjects.setTextPassword("Testng");
        registerPageObjects.setTextConfirmPassword("Testng");
        registerPageObjects.clickSubmitButton();

        Assert.assertTrue(driver.getCurrentUrl().contains("register_sucess"));
    }

    @Test(priority = 3, dependsOnMethods = "verifyMandatoryFieldsPresent")
    public void verifySubmitButtonIsDisabledByDefault(){
        Assert.assertFalse(registerPageObjects.buttonSubmit.isEnabled(),"Submit Button is Enabled By Default");
    }
}

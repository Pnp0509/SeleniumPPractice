package automation.practiceFramework;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginTest extends TestBase{
    LoginPageObjects loginPageObjects;

    @BeforeClass(alwaysRun = true)
    public void initializePageObjects() {
        loginPageObjects = new LoginPageObjects(driver);
    }

    @BeforeMethod(alwaysRun = true)
    public void navigateToHomePage(){
        driver.get("https://demo.guru99.com/test/newtours/index.php");
    }

    @Test(priority = 1)
    public void loginWithValidCredentials() {
        loginPageObjects.setTextUsername("admin");
        loginPageObjects.setTextPassword("admin");

        loginPageObjects.clickSubmitButton();

        Assert.assertTrue(driver.getCurrentUrl().contains("login_sucess"), "Login Fail");
    }

    @Test(priority = 2)
    public void loginWithBlankCredentials() {
        loginPageObjects.clickSubmitButton();

        Assert.assertFalse(driver.getCurrentUrl().contains("login_sucess"), "Login Success with Blank Credentials");
    }

    @Test(priority = 3)
    public void loginWithInValidCredentials() {
        loginPageObjects.setTextUsername("admin123");
        loginPageObjects.setTextPassword("admin");

        loginPageObjects.clickSubmitButton();

        Assert.assertTrue(!driver.getCurrentUrl().contains("login_sucess"), "Login Fail");
    }

}

package automation.practiceFramework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginTest {
    WebDriver driver;
    LoginPageObjects loginPageObjects;

    @BeforeClass(alwaysRun = true)
    public void launchBrowser() {
        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\src\\main\\resources\\drivers\\chromedriver_win.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demo.guru99.com/test/newtours/index.php");
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

        Assert.assertFalse(driver.getCurrentUrl().contains("login_sucess"), "Login Fail");
    }

    @Test(priority = 3)
    public void loginWithInValidCredentials() {
        loginPageObjects.setTextUsername("admin123");
        loginPageObjects.setTextPassword("admin");

        loginPageObjects.clickSubmitButton();

        Assert.assertTrue(!driver.getCurrentUrl().contains("login_sucess"), "Login Fail");
    }

    @AfterClass(alwaysRun = true)
    public void closeBrowser(){
        driver.quit();
    }
}

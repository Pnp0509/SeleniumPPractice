package automation.Swaglab2;

import automation.practiceFramework.LoginPageObjects;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginTest {
    WebDriver driver;
    LoginPageElements loginPageElements;

    @BeforeClass(alwaysRun = true)
    public void intilalizeBrowser(){
        String baseDir = System.getProperty("user.dir");
        System.setProperty("webdriver.chrome.driver", baseDir + "\\src\\main\\resources\\drivers\\chromedriver_win.exe");
        driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/");
        loginPageElements = new LoginPageElements(driver);
    }
    @BeforeMethod(alwaysRun = true)
    public void urlsubmittion(){
        driver.get("https://www.saucedemo.com/");
    }

    @Test(priority = 1)
    public void vailduservalidpassword(){
        loginPageElements.setTextUsername("problem_user");
        loginPageElements.setTextPassword("secret_sauce");
        loginPageElements.clickSubmitButton();

        String titleverify = driver.findElement(By.xpath("//span[@class='title']")).getText();
        String tobevaildString="PRODUCTS";
        Assert.assertTrue(titleverify.equals(tobevaildString),"Test case fail");

    }
    @Test(priority = 2)
    public void vailduserInvalidpassword(){
        loginPageElements.setTextUsername("problem_user");
        loginPageElements.setTextPassword("secret");
        loginPageElements.clickSubmitButton();

        String errormessege=driver.findElement(By.xpath("//h3[@data-test='error']")).getText();
        String errorMessegetobevalidate="Epic sadface: Username and password do not match any user in this service";
        Assert.assertTrue(errormessege.equals(errorMessegetobevalidate),"Test case fail");

    }

    @AfterClass(alwaysRun = true)
    public void closeBroswer(){
        driver.quit();
    }
}

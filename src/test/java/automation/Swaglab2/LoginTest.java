package automation.Swaglab2;

import automation.practiceFramework.LoginPageObjects;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.concurrent.TimeUnit;

public class LoginTest extends TestBase {
//    WebDriver driver;
    LoginPageElements loginPageElements;

    @BeforeClass(alwaysRun = true)
    public void initializePageObjects(){
        loginPageElements = new LoginPageElements(driver);
    }
    @BeforeMethod(alwaysRun = true)
    public void urlsubmittion() throws InterruptedException,IOException  {
        driver.get("https://www.saucedemo.com/");
        generateScreenshot(driver);
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);

    }

    @AfterMethod(alwaysRun = true)
    public void screenShot() throws IOException {
        generateScreenshot(driver);
    }

    @Test(priority =1)
    public void isElementsPresent(){
        Assert.assertTrue(loginPageElements.inputUserName.isEnabled(),"Username is not present");
        Assert.assertTrue(loginPageElements.inputPassword.isEnabled(),"Password is not present");
        Assert.assertTrue(loginPageElements.loginButton.isEnabled(),"Login Switch is not present");
    }

    @Test(priority = 1,dependsOnMethods = "isElementsPresent")
    public void vailduservalidpassword() throws IOException{
        loginPageElements.setTextUsername("problem_user");
        loginPageElements.setTextPassword("secret_sauce");
        generateScreenshot(driver);
        loginPageElements.clickSubmitButton();

        String titleverify = driver.findElement(By.xpath("//span[@class='title']")).getText();
        String tobevaildString="PRODUCTS";
        Assert.assertTrue(titleverify.equals(tobevaildString),"Test case fail");

    }
    @DataProvider(name ="CrenditalProvider")
    public Object[][] credprovider(){
        Object[][] credentials = new Object[6][3];

        credentials[0]= new Object [] {"problem_user","secret","Epic sadface: Username and password do not match any user in this service"};
        credentials[1]= new Object [] {"problem","secret_sauce","Epic sadface: Username and password do not match any user in this service"};
        credentials[2]= new Object [] {"problem","secret","Epic sadface: Username and password do not match any user in this service"};
        credentials[3]= new Object [] {"problem_user","","Epic sadface: Password is required"};
        credentials[4]= new Object [] {"","secret_sauce","Epic sadface: Username is required"};
        credentials[5]= new Object [] {"","","Epic sadface: Username is required"};

        return credentials;

    }

    @Test(priority = 3, dataProvider="CrenditalProvider",dependsOnMethods = "isElementsPresent")
    public void allTests(String userName,String password,String verificationText)throws IOException{
        loginPageElements.setTextUsername(userName);
        loginPageElements.setTextPassword(password);
        generateScreenshot(driver);
        loginPageElements.clickSubmitButton();

        String errormessege=driver.findElement(By.xpath("//h3[@data-test='error']")).getText();
        String errorMessegetobevalidate= verificationText;
        Assert.assertTrue(errormessege.equals(errorMessegetobevalidate),"Test case fail");

    }
//    @Test(priority = 2,dependsOnMethods = "isElementsPresent")
    public void vailduserInvalidpassword() throws IOException{
        loginPageElements.setTextUsername("problem_user");
        loginPageElements.setTextPassword("secret");
        generateScreenshot(driver);
        loginPageElements.clickSubmitButton();

        String errormessege=driver.findElement(By.xpath("//h3[@data-test='error']")).getText();
        String errorMessegetobevalidate= "Epic sadface: Username and password do not match any user in this service";
        Assert.assertTrue(errormessege.equals(errorMessegetobevalidate),"Test case fail");

    }
//    @Test(priority = 3,dependsOnMethods = "isElementsPresent")
    public void invailduserValidpassword() throws IOException{
        loginPageElements.setTextUsername("standard");
        loginPageElements.setTextPassword("secret_sauce");
        generateScreenshot(driver);
        loginPageElements.clickSubmitButton();

        String errormessege=driver.findElement(By.xpath("//h3[@data-test='error']")).getText();
        String errorMessegetobevalidate= "Epic sadface: Username and password do not match any user in this service";
        Assert.assertTrue(errormessege.equals(errorMessegetobevalidate),"Test case fail");

    }
//    @Test(priority = 4,dependsOnMethods = "isElementsPresent")
    public void invailduserInvalidpassword() throws IOException{
        loginPageElements.setTextUsername("standard");
        loginPageElements.setTextPassword("secret");
        generateScreenshot(driver);
        loginPageElements.clickSubmitButton();

        String errormessege=driver.findElement(By.xpath("//h3[@data-test='error']")).getText();
        String errorMessegetobevalidate= "Epic sadface: Username and password do not match any user in this service";
        Assert.assertTrue(errormessege.equals(errorMessegetobevalidate),"Test case fail");

    }
//    @Test(priority = 5,dependsOnMethods = "isElementsPresent")
    public void onlyUsernameProivded() throws IOException{
        loginPageElements.setTextUsername("problem_user");
        generateScreenshot(driver);
        loginPageElements.clickSubmitButton();

        String errormessege=driver.findElement(By.xpath("//h3[@data-test='error']")).getText();
        String errorMessegetobevalidate= "Epic sadface: Password is required";
        Assert.assertTrue(errormessege.equals(errorMessegetobevalidate),"Test case fail");

    }
//    @Test(priority = 6,dependsOnMethods = "isElementsPresent")
    public void onlyPasswordProivded() throws IOException{
        loginPageElements.setTextPassword("secret");
        generateScreenshot(driver);
        loginPageElements.clickSubmitButton();

        String errormessege=driver.findElement(By.xpath("//h3[@data-test='error']")).getText();
        String errorMessegetobevalidate= "Epic sadface: Username is required";
        Assert.assertTrue(errormessege.equals(errorMessegetobevalidate),"Test case fail");

    }
//    @Test(priority = 7,dependsOnMethods = "isElementsPresent")
    public void bothUseNamePasswordBlank() throws IOException{

        generateScreenshot(driver);
        loginPageElements.clickSubmitButton();

        String errormessege=driver.findElement(By.xpath("//h3[@data-test='error']")).getText();
        String errorMessegetobevalidate= "Epic sadface: Username is required";
        Assert.assertTrue(errormessege.equals(errorMessegetobevalidate),"Test case fail");

    }
    public static void generateScreenshot(WebDriver driver) throws IOException {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyyMMddHHmmss");
        LocalDateTime now = LocalDateTime.now();
        String currentDirectory = System.getProperty("user.dir");
        String filePath = currentDirectory + "\\src\\test\\Output\\Swaglab\\LoginValidation\\";
        String fileName = filePath + dtf.format(now) + ".png";
        File screenshotFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(screenshotFile, new File(fileName));

        System.out.println("Screenshot Saved : " + fileName);
    }

}

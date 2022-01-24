package automation.swagLab;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.concurrent.TimeUnit;

import static org.apache.xalan.xsltc.compiler.sym.error;

public class LoginVaildation {


    public static void main(String[] args) throws InterruptedException, IOException {
        // TODO Auto-generated method stub

        String baseDir = System.getProperty("user.dir");
        System.setProperty("webdriver.chrome.driver", baseDir + "\\src\\main\\resources\\drivers\\chromedriver_win.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/");

        driver.manage().timeouts().implicitlyWait(11, TimeUnit.SECONDS);

        Thread.sleep(10000);

        WebElement username = driver.findElement(By.xpath("//input[@placeholder='Username']"));
        WebElement password = driver.findElement(By.xpath("//input[@placeholder='Password']"));
        WebElement loginButton = driver.findElement(By.xpath("//input[@data-test='login-button']"));
        String validusername="problem_user";
        String validpassword="secret_sauce";
        String invalidusernam="standard";
        String invalidpass="1234";
        String inavlidpassmessege="Epic sadface: Username and password do not match any user in this service";
        String inavliduser="Epic sadface: Username and password do not match any user in this service";
        String usernameisrequired="Epic sadface: Username is required";
        String passwordisrequired="Epic sadface: Password is required";


        System.out.println("\n"+"Test case 1 -Valid user name and Password provided");

        Actions builder = new Actions(driver);
        Action validlogin = builder.sendKeys(username, validusername).sendKeys(password, validpassword).click(loginButton).build();
        generateScreenshot(driver);
        validlogin.perform();
        generateScreenshot(driver);
        String titleverify = driver.findElement(By.xpath("//span[@class='title']")).getText();
        String tobevaildString="PRODUCTS";
        if (titleverify.equals(tobevaildString)) {
            System.out.println("Login is successful");
        }
        else {
            System.out.println("Test case fail");
        }

        driver.navigate().back();
        driver.navigate().refresh();

        System.out.println(("\n"+"Test case 2 -Valid user name and Invalid password provided"));

        try{
            Action validuserinvalidpass = builder.sendKeys(username, validusername).sendKeys(password,invalidpass).click(loginButton).build();
            validuserinvalidpass.perform();

        }
        catch(StaleElementReferenceException e)
        {
            username = driver.findElement(By.xpath("//input[@placeholder='Username']"));
            password = driver.findElement(By.xpath("//input[@placeholder='Password']"));
            loginButton = driver.findElement(By.xpath("//input[@data-test='login-button']"));
            Action validuserinvalidpass = builder.sendKeys(username, validusername).sendKeys(password,invalidpass).click(loginButton).build();
            validuserinvalidpass.perform();
            generateScreenshot(driver);
            Thread.sleep(2000);
        }

        String errormessege=driver.findElement(By.xpath("//h3[@data-test='error']")).getText();
        if (errormessege.equals(inavlidpassmessege)){
            System.out.println("Valid name and invalid pass we can not login");
        }
        else{
            System.out.println("fail test");
        }


        driver.navigate().refresh();

        System.out.println(("\n"+"Test case 3 -Invalid user name and Valid password provided"));

        try{
            Action invaliduservalidpass = builder.sendKeys(username, invalidusernam).sendKeys(password,validpassword).click(loginButton).build();
            invaliduservalidpass.perform();

        }
        catch(StaleElementReferenceException e)
        {
            username = driver.findElement(By.xpath("//input[@placeholder='Username']"));
            password = driver.findElement(By.xpath("//input[@placeholder='Password']"));
            loginButton = driver.findElement(By.xpath("//input[@data-test='login-button']"));
            Action invaliduservalidpass = builder.sendKeys(username, invalidusernam).sendKeys(password,validpassword).click(loginButton).build();
            invaliduservalidpass.perform();
            generateScreenshot(driver);
            Thread.sleep(2000);
        }

        String errormessegeinvaliduservalidpass=driver.findElement(By.xpath("//h3[@data-test='error']")).getText();
        if (errormessegeinvaliduservalidpass.equals(inavliduser)){
            System.out.println("With InValid name and valid pass we can not login");
        }
        else{
            System.out.println("fail test");
        }

        driver.navigate().refresh();

        System.out.println(("\n"+"Test case 4 -Invalid user name and Invalid password provided"));

        try{
            Action invaliduserinvalidpass = builder.sendKeys(username, invalidusernam).sendKeys(password,invalidpass).click(loginButton).build();
            invaliduserinvalidpass.perform();

        }
        catch(StaleElementReferenceException e)
        {
            username = driver.findElement(By.xpath("//input[@placeholder='Username']"));
            password = driver.findElement(By.xpath("//input[@placeholder='Password']"));
            loginButton = driver.findElement(By.xpath("//input[@data-test='login-button']"));
            Action invaliduserinvalidpass = builder.sendKeys(username, invalidusernam).sendKeys(password,invalidpass).click(loginButton).build();
            invaliduserinvalidpass.perform();
            generateScreenshot(driver);
            Thread.sleep(2000);
        }

        String errormessegeinvaliduserinvalidpass=driver.findElement(By.xpath("//h3[@data-test='error']")).getText();
        if (errormessegeinvaliduserinvalidpass.equals(errormessegeinvaliduservalidpass)){
            System.out.println("InValid name and Invalid password we can not login");
        }
        else{
            System.out.println("fail test");
        }

        driver.navigate().refresh();

        System.out.println(("\n"+"Test case 5 -Only User id provided"));

        try{
            Action onlyUserProvided = builder.sendKeys(username, validusername).click(loginButton).build();
            onlyUserProvided.perform();

        }
        catch(StaleElementReferenceException e)
        {
            username = driver.findElement(By.xpath("//input[@placeholder='Username']"));
            password = driver.findElement(By.xpath("//input[@placeholder='Password']"));
            loginButton = driver.findElement(By.xpath("//input[@data-test='login-button']"));
            Action onlyUserProvided = builder.sendKeys(username, validusername).click(loginButton).build();
            onlyUserProvided.perform();
            generateScreenshot(driver);
            Thread.sleep(2000);
        }

        String errormessegeonlyuser=driver.findElement(By.xpath("//h3[@data-test='error']")).getText();
        if (errormessegeonlyuser.equals(passwordisrequired)){
            System.out.println("Only user name is not sufficient for login");
        }
        else{
            System.out.println("fail test");
        }

        driver.navigate().refresh();

        System.out.println(("\n"+"Test case 6 -Only Password provided"));

        try{
            Action onlypassProvided = builder.sendKeys(password, validpassword).click(loginButton).build();
            onlypassProvided.perform();

        }
        catch(StaleElementReferenceException e)
        {
            username = driver.findElement(By.xpath("//input[@placeholder='Username']"));
            password = driver.findElement(By.xpath("//input[@placeholder='Password']"));
            loginButton = driver.findElement(By.xpath("//input[@data-test='login-button']"));
            Action onlypassProvided = builder.sendKeys(password, validpassword).click(loginButton).build();
            onlypassProvided.perform();
            generateScreenshot(driver);
            Thread.sleep(2000);
        }

        String errormessegeonlypass=driver.findElement(By.xpath("//h3[@data-test='error']")).getText();
        if (errormessegeonlypass.equals(usernameisrequired)){
            System.out.println("Only user password is not sufficient for login");
        }
        else{
            System.out.println("fail test");
        }

        driver.navigate().refresh();

        System.out.println(("\n"+"Test case 7 - User name and  Password both are empty"));

        try{
            Action bothemtyProvided = builder.click(loginButton).build();
            bothemtyProvided.perform();

        }
        catch(StaleElementReferenceException e)
        {
            username = driver.findElement(By.xpath("//input[@placeholder='Username']"));
            password = driver.findElement(By.xpath("//input[@placeholder='Password']"));
            loginButton = driver.findElement(By.xpath("//input[@data-test='login-button']"));
            Action bothemtyProvided = builder.click(loginButton).build();
            bothemtyProvided.perform();
            generateScreenshot(driver);
            Thread.sleep(2000);
        }

        String errormessegebothempty=driver.findElement(By.xpath("//h3[@data-test='error']")).getText();
        if (errormessegebothempty.equals(usernameisrequired)){
            System.out.println("Both user and password are empty then we can not login");
        }
        else{
            System.out.println("fail test");
        }

        Thread.sleep(5000);

        driver.quit();
    }
    public static void generateScreenshot(WebDriver driver) throws IOException {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyyMMddHHmmss");
        LocalDateTime now = LocalDateTime.now();
        String currentDirectory = System.getProperty("user.dir");
        String filePath = currentDirectory + "\\src\\test\\Output\\Swaglab\\LoginValidation\\";
        String fileName = filePath + dtf.format(now) + ".png";
//        String fileName = filePath + "Captured" +  ".png";
        File screenshotFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(screenshotFile, new File(fileName));

        System.out.println("Screenshot Saved : " + fileName);
    }
}



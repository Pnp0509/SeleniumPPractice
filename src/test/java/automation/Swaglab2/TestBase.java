package automation.Swaglab2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public abstract class TestBase {
    public WebDriver driver;

    @BeforeTest(alwaysRun = true)
    public void invokeBrowser(){
        System.out.println("Invoking Browser Started");
        String baseDir = System.getProperty("user.dir");
        System.setProperty("webdriver.chrome.driver", baseDir + "\\src\\main\\resources\\drivers\\chromedriver_win.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        System.out.println("Invoking Browser Finished");
    }
    @BeforeTest(alwaysRun=true, dependsOnMethods = "invokeBrowser")
    public void baseNvigation(){
        System.out.println("Navigating to Base URL");
        driver.get("https://www.saucedemo.com/");
        System.out.println("Navigating to Base URL ends");
    }

    @AfterTest
    public void closeBrowser(){
        System.out.println("Closing Browser");
        driver.quit();
        System.out.println("Closing Browser ends");
    }

}

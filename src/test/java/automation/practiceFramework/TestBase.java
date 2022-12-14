package automation.practiceFramework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;

public abstract class TestBase {

    public WebDriver driver;

    @BeforeTest(alwaysRun = true)
    public void invokeBrowser(){
        System.out.println("Invoking Browser");
        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\src\\main\\resources\\drivers\\chromedriver_win.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        System.out.println("Invoking Browser Finished");
    }

    @BeforeTest(alwaysRun = true,dependsOnMethods = "invokeBrowser")
    public void baseNavigation(){
        System.out.println("Navigating to Base URL");
        driver.get("https://demo.guru99.com/test/newtours/index.php");
        System.out.println("Navigating to Base URL Finished");
    }



    @AfterTest(alwaysRun = true)
    public void closeBrowser(){
        System.out.println("Closing Browser");
        driver.quit();
        System.out.println("Closing Browser Finished");
    }
}

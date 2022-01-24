package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class Wait2 {
    public static void main(String... a) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\src\\main\\resources\\drivers\\chromedriver_win.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(11, TimeUnit.SECONDS);
//        WebDriverWait wait = new WebDriverWait(driver,11);

        driver.get("https://chercher.tech/practice/explicit-wait-sample-selenium-webdriver");

        WebElement changeTextButton = driver.findElement(By.id("populate-text"));
        changeTextButton.click();
//        wait.until(ExpectedConditions.visibilityOfElementLocated((By.xpath("//h2[text()='Selenium Webdriver']"))));
        WebElement changedText = driver.findElement(By.xpath("//h2[text()='Selenium Webdriver']"));


        WebElement displayOtherButton = driver.findElement(By.id("display-other-button"));
        displayOtherButton.click();
//        WebElement text1 = driver.findElement(By.xpath("//span[@id='hidecountdowntimer'][text()='0']"));
//        WebElement text1 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@id='hidecountdowntimer'][text()='0']")));
        WebElement hiddenButton = driver.findElement(By.id("hidden"));
        hiddenButton.click();

        WebElement enableButton = driver.findElement(By.id("enable-button"));
        enableButton.click();
        WebElement text2 = driver.findElement(By.xpath("//span[@id='enablecountdowntimer'][text()='0']"));


        driver.quit();
    }
}

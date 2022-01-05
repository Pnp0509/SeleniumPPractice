package automation;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class Wait {
    public static void main(String ... a) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\src\\main\\resources\\drivers\\chromedriver_win.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://chercher.tech/practice/explicit-wait-sample-selenium-webdriver");

        WebElement buttonForAlert = driver.findElement(By.id("alert"));
        buttonForAlert.click();
        Thread.sleep(5500);
//        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
//        WebDriverWait wait = new WebDriverWait(driver,5);
//        wait.until(ExpectedConditions.alertIsPresent());
        Alert alert = driver.switchTo().alert();
        alert.accept();
        System.out.println("Alert accepted");

//        WebElement changeTextButton = driver.findElement(By.id("populate-text"));
//        changeTextButton.click();
//        Thread.sleep(12000);
//        driver.manage().timeouts().implicitlyWait(9, TimeUnit.SECONDS);
//        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
//        WebDriverWait wait = new WebDriverWait(driver,15);
//        wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//h2[text()='Selenium Webdriver']"))));
//        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h2[text()='Selenium Webdriver']")));
//        WebElement changedText = driver.findElement(By.xpath("//h2[text()='Selenium Webdriver']"));
//        wait.until(ExpectedConditions.visibilityOf(changedText));
//        WebElement changedText = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h2[text()='Selenium Webdriver']")));
//        System.out.println("Text is : " + changedText.getText());

//        WebElement displayOtherButton = driver.findElement(By.id("display-other-button"));
//        WebElement enabledButton = driver.findElement(By.id("hidden"));
//        System.out.println(enabledButton.isDisplayed());
//        displayOtherButton.click();
//        WebDriverWait wait = new WebDriverWait(driver,10);
//        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("hidden")));
//        System.out.println(enabledButton.isDisplayed());

//        WebElement enableButton = driver.findElement(By.id("enable-button"));
//        WebElement enabledButton = driver.findElement(By.id("disable"));
//        System.out.println("Is Enabled : " + enabledButton.isEnabled());
//        enableButton.click();
//        System.out.println("Is Enabled : " + enabledButton.isEnabled());
//        WebDriverWait wait = new WebDriverWait(driver,15);
//        wait.until(ExpectedConditions.elementToBeClickable(enabledButton));
//        System.out.println("Is Enabled : " + enabledButton.isEnabled());
//
//        FluentWait<WebDriver> wait = new FluentWait<WebDriver>(driver)
//                .withTimeout(40,TimeUnit.SECONDS)
//                .pollingEvery(20,TimeUnit.SECONDS)  //polling frequency
//                .ignoring(NoSuchElementException.class);
//        WebDriverWait wait = new WebDriverWait(driver,40);
//
//        WebElement changeTextButton = driver.findElement(By.id("populate-text"));
//        changeTextButton.click();
//        WebElement changedText = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h2[text()='Selenium Webdriver']")));
//        System.out.println("Text is : " + changedText.getText());



        driver.quit();
    }
}
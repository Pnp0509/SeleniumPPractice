package automation;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class WaitTry {
    public static void main(String ... a) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\src\\main\\resources\\drivers\\chromedriver_win.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://chercher.tech/practice/explicit-wait-sample-selenium-webdriver");


//        WebDriverWait wait =new WebDriverWait(driver,20);

        FluentWait<WebDriver> wait = new FluentWait<WebDriver>(driver)
                .withTimeout(10,TimeUnit.SECONDS)
                .pollingEvery(1,TimeUnit.SECONDS)  //polling frequency
                .ignoring(NoSuchElementException.class);

        /*Alert box function*/

        WebElement buttonForAlert = driver.findElement(By.id("alert"));
        buttonForAlert.click();
        wait.until(ExpectedConditions.alertIsPresent());
        Alert alert = driver.switchTo().alert();
        alert.accept();
        System.out.println("Alert accepted");

        /*Change text box case*/

        WebElement changeTextButton = driver.findElement(By.id("populate-text"));
        changeTextButton.click();

//        WebElement changedText = driver.findElement(By.xpath("//h2[text()='Selenium Webdriver']"));
        WebElement changedText = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h2[text()='Selenium Webdriver']")));

        System.out.println("Text is : " + changedText.getText());


        /*Hidden button case*/

        WebElement displayOtherButton = driver.findElement(By.id("display-other-button"));
        WebElement enabledButton = driver.findElement(By.id("hidden"));
        System.out.println("Is hidden button displayed---"+enabledButton.isDisplayed());
        displayOtherButton.click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("hidden")));
        System.out.println("Is hidden button displayed---"+enabledButton.isDisplayed());



        /*Button is Enable or not case*/

        WebElement enableButton = driver.findElement(By.id("enable-button"));
        WebElement enabledButton2 = driver.findElement(By.id("disable"));
        System.out.println("Is enable button Displayed : " + enabledButton2.isDisplayed());
        System.out.println("Is enable button Enabled : " + enabledButton2.isEnabled());
        enableButton.click();
        System.out.println("Is enable button Enabled : " + enabledButton2.isEnabled());
        wait.until(ExpectedConditions.elementToBeClickable(enabledButton2));
        System.out.println("Is enable button Enabled : " + enabledButton2.isEnabled());

        /* check box test case*/

        WebElement checkboxButton= driver.findElement(By.xpath("//button[@id='checkbox']"));
        WebElement chekBox= driver.findElement(By.xpath("//input[@type='checkbox']"));
        checkboxButton.click();
        wait.until(ExpectedConditions.elementToBeSelected(By.xpath("//input[@type='checkbox']")));
        System.out.println("checkBox Isselected---"+chekBox.isSelected());

        driver.quit();
    }
}
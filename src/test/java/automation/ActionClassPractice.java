package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import java.awt.event.KeyEvent;
import java.security.Key;

public class ActionClassPractice {
    public static void main(String ... a) throws InterruptedException{
        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\src\\main\\resources\\drivers\\chromedriver_win.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

//        driver.get("http://demo.guru99.com/test/drag_drop.html");

//        WebElement cash5000 = driver.findElement(By.className("block13"));
//        WebElement bank = driver.findElement(By.className("block14"));
//        WebElement dropCash = driver.findElement(By.className("field13"));
//        WebElement dropBank = driver.findElement(By.className("field14"));

//        Actions builder = new Actions(driver);
//        Thread.sleep(5000);
//        Action seriesOfActionCash = builder.moveToElement(cash5000).clickAndHold().moveToElement(dropCash).release().build();
//        seriesOfActionCash.perform();
//        Thread.sleep(2000);
//
//        Action seriesOfActionBank = builder.moveToElement(bank).clickAndHold().moveToElement(dropBank).release().build();
//        seriesOfActionBank.perform();

//        builder.dragAndDrop(bank,dropBank).build().perform();
//        builder.dragAndDrop(cash5000,dropCash).build().perform();

//        builder.dragAndDropBy(bank,133,40).build().perform();
//
//        builder.dragAndDropBy(cash5000,130,40).build().perform();
//
//        Action seriesOfAction2 = builder.dragAndDropBy(cash5000,142,20).build();
//        seriesOfAction2.perform();
//
//        Action seriesOfAction3 = builder.dragAndDrop(bank,dropBank).build();
//        seriesOfAction3.perform();

//        Actions builder2 = new Actions(driver);
//        Action seriesOfAction4 = builder2.dragAndDrop(bank,dropBank).build();
//        seriesOfAction4.perform();

//        Action seriesOfAction = builder.contextClick(cash5000).build();
//        seriesOfAction.perform();
//        Thread.sleep(2000);
//
//        WebElement ownersEquity = driver.findElement(By.id("credit3"));
//        Action seriesOfAction = builder.moveToElement(ownersEquity).build();
//        seriesOfAction.perform();


            driver.get("https://www.facebook.com/");
            Thread.sleep(5000);
            WebElement email = driver.findElement(By.xpath("//input[@name='email']"));
        WebElement pass = driver.findElement(By.xpath("//input[@name='pass']"));

        Actions builder = new Actions(driver);
        Action inputForUsername = builder.sendKeys(email,"asd").build();
        inputForUsername.perform();

        Action inputForPassword = builder.sendKeys(pass,"asd").build();
        inputForPassword.perform();

        Action pressEnter = builder.sendKeys(Keys.ENTER).build();
        pressEnter.perform();



                Thread.sleep(10000);
        driver.quit();
    }
}
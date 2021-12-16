package automation;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioAndCheckbox {
    public static void main(String a[]) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\src\\main\\resources\\drivers\\chromedriver_win.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.tutorialspoint.com/selenium/selenium_automation_practice.htm");

        WebElement checkboxAutomation = driver.findElement(By.xpath("//input[@name='profession' and @value='Automation Tester']"));
        WebElement radioMale = driver.findElement(By.xpath("//input[@name='sex' and @value='Male']"));
//        WebElement radioMale = driver.findElement(By.name("sex"));
        for(int i=0;i<2;i++){
            System.out.println("Is checked : " + checkboxAutomation.isSelected());
            checkboxAutomation.click();
            System.out.println("Is checked : " + checkboxAutomation.isSelected());
            Thread.sleep(3000);
        }

        JavascriptExecutor js = (JavascriptExecutor) driver;
        for(int i=0;i<2;i++){
            System.out.println("Is selected : " + radioMale.isSelected());
//            radioMale.click();
            js.executeScript("arguments[0].click()",radioMale);
            System.out.println("Is selected : " + radioMale.isSelected());
            Thread.sleep(3000);
        }


        driver.close();
    }
}
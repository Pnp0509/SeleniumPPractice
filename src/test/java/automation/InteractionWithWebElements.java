package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class InteractionWithWebElements {
    public static void main(String[] args) throws InterruptedException {
        // TODO Auto-generated method stub

        String baseDir = System.getProperty("user.dir");
        System.setProperty("webdriver.chrome.driver", baseDir + "\\src\\main\\resources\\drivers\\chromedriver_win.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.calculator.net/percent-calculator.html");


        Thread.sleep(2000);
        driver.findElement(By.id("cpar1")).sendKeys("1000");
        Thread.sleep(2000);
        driver.findElement(By.id("cpar1")).clear();
        Thread.sleep(2000);
        driver.findElement(By.id("cpar1")).sendKeys("2222");
        Thread.sleep(2000);
        driver.findElement(By.id("cpar2")).sendKeys("50");
        Thread.sleep(2000);

        driver.findElement(By.xpath("//input[@id='cpar1']/following::input[@value='Calculate'][1]")).click();
        Thread.sleep(2000);

        System.out.println(driver.findElement(By.className("h2result")).getText());
        Thread.sleep(2000);

        System.out.println("Result is " + (driver.findElement(By.xpath("//*[@id=\"content\"]/p[2]/font/b")).getText()));

        System.out.println(driver.findElement(By.tagName("font")).getAttribute("color"));

        System.out.println(driver.findElement(By.tagName("font")).getCssValue("font-size"));
        System.out.println(driver.findElement(By.tagName("font")).getCssValue("text-align"));
        System.out.println(driver.findElement(By.tagName("font")).getCssValue("color"));

        Thread.sleep(10000);

        driver.close();
    }

}
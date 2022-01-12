package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.awt.*;
import java.awt.event.KeyEvent;

public class RobotClassPractice {
    public static void main(String ... a) throws InterruptedException, AWTException {
        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\src\\main\\resources\\drivers\\chromedriver_win.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://www.facebook.com/");
        Thread.sleep(10000);

        Robot robot = new Robot();

        robot.keyPress(KeyEvent.VK_CAPS_LOCK);
        robot.keyPress(KeyEvent.VK_A);
        robot.keyPress(KeyEvent.VK_N);
        robot.keyPress(KeyEvent.VK_U);
        robot.keyPress(KeyEvent.VK_J);
        robot.keyRelease(KeyEvent.VK_CAPS_LOCK);

        robot.keyPress(KeyEvent.VK_SHIFT);
        robot.keyPress(KeyEvent.VK_2);
        robot.keyRelease(KeyEvent.VK_SHIFT);

        robot.keyPress(KeyEvent.VK_TAB);

        robot.keyPress(KeyEvent.VK_1);
        robot.keyPress(KeyEvent.VK_G);
        robot.keyPress(KeyEvent.VK_3);

        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyPress(KeyEvent.VK_ESCAPE);

//        WebElement signUp= driver.findElement(By.xpath("//*[@id=\"u_0_2_Ws\"]"));
//



        Thread.sleep(5000);

        driver.quit();
    }
}

package automation;

//import com.sun.deploy.cache.Cache;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
//import ru.yandex.qatools.ashot.AShot;
//import ru.yandex.qatools.ashot.Screenshot;
//import ru.yandex.qatools.ashot.shooting.ShootingStrategies;

import javax.imageio.ImageIO;
import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class ScreenshotPractice {
//    private static Cache FileUtils;

    public static void main(String ... a) throws InterruptedException, IOException {
        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\src\\main\\resources\\drivers\\chromedriver_win.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://www.autoitscript.com/site/autoit/downloads/");
//        driver.navigate().to("https://www.google.com");

//        System.out.println("Taking Normal Screenshot");
//        generateScreenshot(driver);

        Thread.sleep(1000);

//        System.out.println("Taking Full Page Screenshot");
//        generateFullPageScreenshot(driver);

        WebElement downloadButton = driver.findElement(By.cssSelector("img[title='Download AutoIt']"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", downloadButton);
        System.out.println("Taking Focused Screenshot");
        generateScreenshot(driver);

        Thread.sleep(3000);
        driver.quit();
    }

    public static void generateScreenshot(WebDriver driver) throws IOException {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyyMMddHHmmss");
        LocalDateTime now = LocalDateTime.now();
        String currentDirectory = System.getProperty("user.dir");
        String filePath = currentDirectory + "\\src\\test\\Output\\Screenshots\\";
        String fileName = filePath + dtf.format(now) + ".png";
//        String fileName = filePath + "Captured" +  ".png";
        File screenshotFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
//        FileUtils.copyFile(screenshotFile, new File(fileName));

        System.out.println("Screenshot Saved : " + fileName);
    }

    public static void generateFullPageScreenshot(WebDriver driver) throws IOException {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyyMMddHHmmss");
        LocalDateTime now = LocalDateTime.now();
        String currentDirectory = System.getProperty("user.dir");
        String filePath = currentDirectory + "\\src\\test\\Output\\Screenshots\\";
        String fileName = filePath + dtf.format(now) + ".png";
//        String fileName = filePath + "Captured" + ".png";
//        Screenshot screenshot=new AShot().shootingStrategy(ShootingStrategies.viewportPasting(1000)).takeScreenshot(driver);
//        ImageIO.write(screenshot.getImage(),"PNG",new File(fileName));

        System.out.println("Full Page Screenshot Saved : " + fileName);
    }
}
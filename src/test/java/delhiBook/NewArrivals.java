package delhiBook;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class NewArrivals {

    public static void main(String[] args) throws InterruptedException {
        // TODO Auto-generated method stub

        String baseDir = System.getProperty("user.dir");
        System.setProperty("webdriver.chrome.driver", baseDir + "\\src\\main\\resources\\drivers\\chromedriver_win.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://delhibookmarket.in/collections/new-books");
        driver.manage().window().maximize();

        Thread.sleep(2000);

//        WebElement siteNav= driver.findElement(By.xpath("//*[@id=\"sticky-wrapper\"]/div/div[1]/div[1]/div/div/div/div[2]/nav/ul/li[1]/a/span[1]"));
//
//        JavascriptExecutor js = (JavascriptExecutor)driver;
//
//
//
//        siteNav.click();
//        List<WebElement> listByTag = driver.findElements(By.xpath("//*[@id=\"sticky-wrapper\"]/div/div[1]/div[1]/div/div/div/div[2]/nav/ul/li[1]/div/ul"));
//        for(WebElement element : driver.findElements(By.xpath("//*[@id=\"sticky-wrapper\"]/div/div[1]/div[1]/div/div/div/div[2]/nav/ul/li[1]/div/ul"))) {
//            System.out.println(element.getText());
//
//
//        }
        WebElement categories= driver.findElement(By.cssSelector("a.menu__moblie[href='/collections']"));

        Actions builder = new Actions(driver);

        Action moveCategories=builder.moveToElement(categories).click().build();
        moveCategories.perform();

        Thread.sleep(10000);
        driver.quit();

    }

}

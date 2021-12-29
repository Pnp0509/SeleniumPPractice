package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScript {

    public static void main(String[] args) throws InterruptedException {
        // TODO Auto-generated method stub

        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\src\\main\\resources\\drivers\\chromedriver_win.exe");
        WebDriver driver = new ChromeDriver();

//		driver.get("https://www.calculator.net/percent-calculator.html");
        driver.get("https://demoqa.com/automation-practice-form");
        driver.manage().window().maximize();
//
//		WebElement textBox1 = driver.findElement(By.id("cpar1"));
//		WebElement textBox2 = driver.findElement(By.id("cpar2"));
//		WebElement calculateButton = driver.findElement(By.xpath("//input[@id='cpar1']/following::input[@value='Calculate'][1]"));
//		WebElement resultDisplayed = driver.findElement(By.xpath("//p[@class='verybigtext']/child::font"));
//
//		JavascriptExecutor js = (JavascriptExecutor)driver;
//
//		js.executeScript("arguments[0].value='10';", textBox1);Thread.sleep(5000);
//		js.executeScript("arguments[0].value='111';", textBox2);Thread.sleep(5000);
//		js.executeScript("arguments[0].value='';", textBox2);Thread.sleep(5000);
//		js.executeScript("arguments[0].value='200';", textBox2);Thread.sleep(5000);
//
//		js.executeScript("arguments[0].click();", calculateButton);
//
//		WebElement resultDisplayed = driver.findElement(By.xpath("//p[@class='verybigtext']/child::font"));
//		String result = (String) js.executeScript("return arguments[0].value" , resultDisplayed);
//		System.out.println(result);
//		System.out.println(resultDisplayed.getText());

        WebElement fname = driver.findElement(By.id("firstName"));
        WebElement male = driver.findElement(By.id("gender-radio-1"));

        JavascriptExecutor js = (JavascriptExecutor)driver;
//        js.executeScript("arguments[0].value='Prashant';", fname);Thread.sleep(5000);
		fname.sendKeys("Prashant");
        System.out.println(fname.getText());



//		fname.clear();
//        js.executeScript("arguments[0].value='';", fname);

//		male.click();
        js.executeScript("arguments[0].click();", male);

        Thread.sleep(5000);

        driver.quit();
    }

}
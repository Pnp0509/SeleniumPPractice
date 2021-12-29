package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class ToolQA {
    public static void main(String[] args) throws InterruptedException {
        // TODO Auto-generated method stub

        String baseDir = System.getProperty("user.dir");
        System.setProperty("webdriver.chrome.driver", baseDir + "\\src\\main\\resources\\drivers\\chromedriver_win.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
//        driver.get("https://www.calculator.net/percent-calculator.html");
        driver.get("https://demoqa.com/automation-practice-form");


//        Thread.sleep(2000);
//        driver.findElement(By.id("cpar1")).sendKeys("1000");
//        Thread.sleep(2000);
//        driver.findElement(By.id("cpar1")).clear();
//        Thread.sleep(2000);
//        driver.findElement(By.id("cpar1")).sendKeys("2222");
//        Thread.sleep(2000);
//        driver.findElement(By.id("cpar2")).sendKeys("50");
//        Thread.sleep(2000);
//
//        driver.findElement(By.xpath("//input[@id='cpar1']/following::input[@value='Calculate'][1]")).click();
//        Thread.sleep(2000);
//
//        System.out.println(driver.findElement(By.className("h2result")).getText());
//        Thread.sleep(2000);
//
//        System.out.println("Result is " + (driver.findElement(By.xpath("//*[@id=\"content\"]/p[2]/font/b")).getText()));
//
//        System.out.println(driver.findElement(By.tagName("font")).getAttribute("color"));
//
//        System.out.println(driver.findElement(By.tagName("font")).getCssValue("font-size"));
//        System.out.println(driver.findElement(By.tagName("font")).getCssValue("text-align"));
//        System.out.println(driver.findElement(By.tagName("font")).getCssValue("color"));
//
//        Thread.sleep(10000);

        Thread.sleep(5000);
        WebElement firstName=driver.findElement(By.id("firstName"));
        WebElement lastName=driver.findElement(By.id("lastName"));

        firstName.sendKeys("Pranav");
        JavascriptExecutor js = (JavascriptExecutor)driver;

        js.executeScript("arguments[0].value='Patil';", lastName);Thread.sleep(5000);
        js.executeScript("arguments[0].value='';", lastName);Thread.sleep(5000);
        js.executeScript("arguments[0].value='Patil';", lastName);Thread.sleep(5000);


        String result = (String) js.executeScript("return arguments[0].value" , firstName);
        System.out.println(result);
        System.out.println((String) js.executeScript("return arguments[0].value" , lastName));
//        System.out.println(firstName.getText());//it is not working for this web page

        WebElement malesel=driver.findElement(By.xpath("//*[@id=\"gender-radio-1\"]"));
        WebElement femaleSel=driver.findElement(By.id("gender-radio-2"));
        WebElement sportcheck=driver.findElement(By.id("hobbies-checkbox-1"));
        WebElement readingcheck=driver.findElement(By.id("hobbies-checkbox-2"));

//        malesel.click();//it is not work here
//        js.executeScript("arguments[0].click()",malesel);Thread.sleep(5000);
//        System.out.println("IS male Selected -"+malesel.isSelected());
//        js.executeScript("arguments[0].click()",femaleSel);Thread.sleep(5000);
//        System.out.println("Is Female Selected - "+femaleSel.isSelected());
//        System.out.println("Is male Selected - "+malesel.isSelected());

//        sportcheck.click();Thread.sleep(5000);
//        js.executeScript("arguments[0].click()",sportcheck);Thread.sleep(5000);
//        System.out.println("Is Sport Selected"+sportcheck.isSelected());
//        readingcheck.click();Thread.sleep(5000);
//        js.executeScript("arguments[0].click()",readingcheck);Thread.sleep(5000);
//        System.out.println("Is reading selected"+readingcheck.isSelected());
//        System.out.println("Is Sport Selected"+sportcheck.isSelected());

        WebElement state=driver.findElement(By.id("state"));
        WebElement selectState= driver.findElement(By.xpath("//*[@id=\"state\"]/div/div[1]/div[1]"));
        WebElement Hariyana= driver.findElement(By.xpath("//*[@id=\"state\"]/div/div[1]/div[1]"));

        js.executeScript("arguments[0].click()",selectState);
        js.executeScript("arguments[0].click()",Hariyana);

        System.out.println((String) js.executeScript("return arguments[0].value" , selectState));


//        js.executeScript("arguments[0].Select()", state);Thread.sleep(5000);

//        Select select1= new Select(state);

//        select1.selectByVisibleText("Uttar Pradesh");

//        System.out.println(select1.getFirstSelectedOption().getText());






        Thread.sleep(5000);

        driver.close();
    }

}

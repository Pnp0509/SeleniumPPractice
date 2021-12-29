package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.*;

public class Amazon {
    public static void main(String[] args) throws InterruptedException {
        // TODO Auto-generated method stub

        String baseDir = System.getProperty("user.dir");
        System.setProperty("webdriver.chrome.driver", baseDir + "\\src\\main\\resources\\drivers\\chromedriver_win.exe");
        WebDriver driver = new ChromeDriver();
//        driver.get("https://www.amazon.in/s?k=mobiles&crid=1VGXNCXWO2NEB&sprefix=mob%2Caps%2C8300&ref=nb_sb_noss_2");
        driver.get("https://www.amazon.in/ref=nav_logo");

        Thread.sleep(2000);
        /*Wbelement can not created*/
//        WebElement price= driver.findElement(By.xpath((//*[@id="search"]/div[1]/div/div/span[3]/div[2]/div/div/span/descendant::div/descendant::a/descendant::span[1]/descendant::span[2]//descendant::span[2])));
        WebElement search=driver.findElement(By.id("twotabsearchtextbox"));
        search.sendKeys("mobiles");
        WebElement button=driver.findElement(By.id("nav-search-submit-button"));
        button.click();

       /*Price list Iterate seperately using foreach loop*/
        List<WebElement> price= driver.findElements(By.xpath("//span[@class='a-price-whole']"));Thread.sleep(10000);

//        for(WebElement element : driver.findElements(By.xpath("//span[@class='a-price-whole']"))) {
//            System.out.println(element.getText());
//        }

        /*Name list Iterate seperately using foreach loop*/
        List<WebElement> name= driver.findElements(By.xpath("//a[@class='a-link-normal s-link-style a-text-normal']/child::span[1]"));

//        for(WebElement elements : driver.findElements(By.xpath("//a[@class='a-link-normal s-link-style a-text-normal']/child::span[1]"))) {
//            System.out.println(elements.getText());
//
//        }


        /*Try to Iterate using ListIterator*/
//        Iterator nam= Name.listIterator();
//        while (nam.hasNext()){
//            System.out.println(nam.next().toString());
//
//        }

        /*Using for loop model name amd their respective price is Iterated*/
        /*i value name.size() unable to iterate price so using listIterator(index).next().getText() used to iterate value*/
        for(int i=0;i<name.size();i++){
            int j=i+1;
            System.out.println("Model-"+""+j+" ---- "+name.get(i).getText());
//            System.out.println("Price---"+price.listIterator(i).next().getText());
        }

        /*i value name.size() unable to iterate price so using listIterator(index).next().getText() used to iterate value*/
//        for(int i=0;i< price.size();i++){
//            System.out.println("Model---"+Name.get(i).getText());
//            System.out.println("Price---"+price.get(i).getText());
//        }


        System.out.println("size of price"+price.size());
        System.out.println("Size of Name"+name.size());


        Thread.sleep(10000);
        driver.quit();

    }
}

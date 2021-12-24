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
        driver.get("https://www.amazon.in/s?k=mobiles&crid=1VGXNCXWO2NEB&sprefix=mob%2Caps%2C8300&ref=nb_sb_noss_2");

        Thread.sleep(2000);

//        WebElement price= driver.findElement(By.xpath((//*[@id="search"]/div[1]/div/div/span[3]/div[2]/div/div/span/descendant::div/descendant::a/descendant::span[1]/descendant::span[2]//descendant::span[2])));

        List<WebElement> price= driver.findElements(By.xpath("//*[@id=\"search\"]/div[1]/div/div/span[3]/div[2]/div/div/span/descendant::div/descendant::a/descendant::span[1]/descendant::span[2]//descendant::span[2]/ancestor::span[1]/child::span[2]"));Thread.sleep(10000);
//
//        for(WebElement element : driver.findElements(By.xpath("//*[@id=\"search\"]/div[1]/div/div/span[3]/div[2]/div/div/span/descendant::div/descendant::a/descendant::span[1]/descendant::span[2]//descendant::span[2]/ancestor::span[1]/child::span[2]"))) {
//            System.out.println(element.getText());
//
//        }




        List<WebElement> Name= driver.findElements(By.xpath("//*[@id=\"search\"]/div[1]/div[1]/div/span[3]/div[2]/div/div/span/descendant::h2/descendant::span"));

//        for(WebElement elements : driver.findElements(By.xpath("//*[@id=\"search\"]/div[1]/div[1]/div/span[3]/div[2]/div/div/span/descendant::h2/descendant::span"))) {
//            System.out.println(elements.getText());

//        }

//        Iterator nam= Name.listIterator();
//        while (nam.hasNext()){
//            System.out.println(nam.next().toString());
//
//        }

        int count=price.size();

        for(int i=0;i< Name.size();i++){
            System.out.println("Model-"+""+i+" ---- "+Name.get(i).getText());
            System.out.println("Price---"+price.listIterator(i).next().getText());
        }

//        for(int i=0;i< price.size();i++){
////            System.out.println("Model---"+Name.get(i).getText());
//            System.out.println("Price---"+price.get(i).getText());
//        }


//        for(WebElement element : driver.findElements(By.xpath("//*[@id=\"search\"]/div[1]/div/div/span[3]/div[2]/div/div/span/descendant::div/descendant::a/descendant::span[1]/descendant::span[2]//descendant::span[2]/ancestor::span[1]/child::span[2]"))) {
//            System.out.println(element.getText());
//            for(WebElement elements : driver.findElements(By.xpath("//*[@id=\"search\"]/div[1]/div[1]/div/span[3]/div[2]/div/div/span/descendant::h2/descendant::span"))) {
//                System.out.println(elements.getText());
//            }
//
//        }



//        System.out.println("size of price"+price.size());
//        System.out.println("Size of Name"+Name.size());


        Thread.sleep(10000);
        driver.quit();

    }
}

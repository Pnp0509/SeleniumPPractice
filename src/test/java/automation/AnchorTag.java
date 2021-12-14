package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;


import java.util.List;

public class AnchorTag {
    public static void main(String[] args) throws InterruptedException {
        // TODO Auto-generated method stub

        String baseDir = System.getProperty("user.dir");
        System.setProperty("webdriver.chrome.driver", baseDir + "\\src\\main\\resources\\drivers\\chromedriver_win.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.calculator.net/percent-calculator.html");

        Thread.sleep(2000);


        List<WebElement> listByTag = driver.findElements(By.tagName("a"));
//        List<WebElement> listByTag = new ArrayList<>(driver.findElements(By.tagName("a")));
//      ArrayList<WebElement> listByTag1 = (ArrayList<WebElement>) driver.findElements(By.tagName("a"));
//        LinkedList<WebElement> listByTag2 = (LinkedList<WebElement>) driver.findElements(By.tagName("a"));
        System.out.println("List of Anchor");
        for(WebElement element : driver.findElements(By.tagName("a"))) {
            System.out.println(element.getText());


        }
//        for(WebElement element : listByTag1) {
//            System.out.println(element.getText());
//
//        }
//        ListIterator list_it= listByTag.listIterator();
//        while (list_it.hasNext()){
//            System.out.println(list_it.next());
//        }


        System.out.println("Anchor list Sze: "+listByTag.size());
        Thread.sleep(5000);

        driver.quit();
    }
}

package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath {

    public static void main(String[] args) throws InterruptedException {
        // TODO Auto-generated method stub
        String baseDir = System.getProperty("user.dir");
        System.setProperty("webdriver.chrome.driver",baseDir + "\\src\\main\\resources\\drivers\\chromedriver_win.exe");

        WebDriver driver = new ChromeDriver();
        driver.get("http://demo.guru99.com/test/selenium-xpath.html");


        //Xpath=//tagname[@attribute='value']

        System.out.println("Absolute xpath " + "/html/body/div[2]/div[2]/div/ul[1]/li[6]/a " + driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/ul[1]/li[6]/a")).getText());

        System.out.println("Relative xpath " + "//*[@id=\"java_technologies\"]/li[6]/a " + driver.findElement(By.xpath("//*[@id=\"java_technologies\"]/li[6]/a")).getText());

//		System.out.println("Following " + "//input[@name='password']/following::input[1] " + driver.findElement(By.xpath("//input[@name='password']/following::input[1]")).getAttribute("value"));
//		System.out.println("Following " + "//input[@name='password']/following::input[2] " + driver.findElement(By.xpath("//input[@name='password']/following::input[2]")).getAttribute("value"));


        Thread.sleep(5000);

        driver.close();
    }

}
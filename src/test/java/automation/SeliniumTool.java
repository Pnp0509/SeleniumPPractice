package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class SeliniumTool {
    public static void main(String[] args) throws InterruptedException {
        // TODO Auto-generated method stub

        String baseDir = System.getProperty("user.dir");
        System.setProperty("webdriver.chrome.driver", baseDir + "\\src\\main\\resources\\drivers\\chromedriver_win.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();



        driver.get("https://www.tutorialspoint.com/selenium/selenium_automation_practice.htm");

        Thread.sleep(5000);

        WebElement contenent= driver.findElement(By.name("continents"));

        Select select3=new Select(contenent);Thread.sleep(5000);



        select3.selectByVisibleText("Africa");Thread.sleep(5000);
        System.out.println("Selected Con-"+select3.getFirstSelectedOption().getText());
        select3.selectByVisibleText("Africa");Thread.sleep(5000);
//        select3.deselectByVisibleText("Africa");Thread.sleep(5000);
        System.out.println("Selected Con-"+select3.getFirstSelectedOption().getText());

        System.out.println("Size-"+select3.getOptions().size());

		for(WebElement option : select3.getOptions()){
			System.out.println(option.getText());
		}

		System.out.println("Default selected : " + select3.getFirstSelectedOption().getText());

        System.out.println("Is multiple= "+select3.isMultiple());

        WebElement command=driver.findElement(By.name("selenium_commands"));

        Select select4=new Select(command);
        select4.selectByIndex(1);
        System.out.println("Selected-"+select4.getFirstSelectedOption().getText());
        select4.selectByIndex(2);
        select4.selectByIndex(3);
        System.out.println("MultipleSelected-"+select4.getAllSelectedOptions().listIterator());




        Thread.sleep(5000);

        driver.close();


    }
}

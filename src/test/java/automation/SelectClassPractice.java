package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectClassPractice {

    public static void main(String[] args) throws InterruptedException {
        // TODO Auto-generated method stub

        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\src\\main\\resources\\drivers\\chromedriver_win.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

//		driver.get("http://demo.guru99.com/test/newtours/register.php");
//		driver.get("https://semantic-ui.com/modules/dropdown.html");
		driver.get("https://www.tutorialspoint.com/selenium/selenium_automation_practice.htm");

//        Thread.sleep(10000);

//		Select select = new Select(driver.findElement(By.name("country")));
		Select select = new Select(driver.findElement(By.name("selenium_commands")));

//		System.out.println("Default selected : " + select.getFirstSelectedOption().getText());
//		Thread.sleep(3000);


//		select.selectByVisibleText("INDIA");
//		select.selectByVisibleText("india");
//		select.selectByVisibleText("IND");
//		System.out.println("Option selected by visible text: " + select.getFirstSelectedOption().getText());
//		Thread.sleep(3000);

//		select.selectByIndex(2);
//		select.selectByIndex(0);
//		select.selectByIndex(-2);
//		select.selectByIndex(1000);
//		System.out.println("Option selected by index: " + select.getFirstSelectedOption().getText());
//		Thread.sleep(3000);

//		select.selectByValue("ANTIGUA AND BARBUDA");
//		System.out.println("Option selected by value: " + select.getFirstSelectedOption().getText());
//		Thread.sleep(5000);

//		select.deselectByValue("ANTIGUA AND BARBUDA");
//		System.out.println("Option selected after deselect: " + select.getFirstSelectedOption().getText());
//		Thread.sleep(3000);

//		System.out.println("Is Multiple " + select.isMultiple());

//		System.out.println("Size is " + select.getOptions().size());
//		System.out.println("Options are : " );
//		for(WebElement option : select.getOptions()){
//			System.out.println(option.getText());
//		}

//		System.out.println("Default selected : " + select.getFirstSelectedOption().getText());

		select.selectByIndex(1);
        select.selectByVisibleText("Wait Commands");

        select.selectByIndex(4);
		System.out.println("Option selected by index: " + select.getFirstSelectedOption().getText());
		Thread.sleep(5000);
////
		System.out.println("Is Multiple " + select.isMultiple());

		select.deselectByIndex(1);
		select.deselectByIndex(5);
		System.out.println("Option selected by index: " + select.getFirstSelectedOption().getText());




//		Select select = new Select(driver.findElement(By.name("continents")));
//		System.out.println("Selected : " + select.getFirstSelectedOption().getText());

//		select.selectByVisibleText("Australia");
//		System.out.println("Selected : " + select.getFirstSelectedOption().getText());
////		Thread.sleep(5000);
//
//		select.selectByIndex(2);
//
//		System.out.println("Selected : " + select.getFirstSelectedOption().getText());
//
//
////		System.out.println(select.getOptions());
//		for(WebElement option:select.getOptions()){
//			System.out.println(option.getText());
//		}


//        driver.get("https://chercher.tech/practice/practice-dropdowns-selenium-webdriver");
//
//        Select select123 = new Select(driver.findElement(By.id("animals")));
//
//        System.out.println("Option Selected : " + select123.getFirstSelectedOption().getText());
//        for(WebElement options:select123.getOptions()){
//            System.out.println(options.getText());
//        }
//        Thread.sleep(2000);

//		select123.selectByVisibleText("Baby Cat");
//		System.out.println("Option Selected : " + select123.getFirstSelectedOption().getText());

//		select123.selectByVisibleText("Baby cat"); //NoSuchElementException: Cannot locate element with text: Baby cat
//		System.out.println("Option Selected : " + select123.getFirstSelectedOption().getText());

//		select123.selectByVisibleText("");  //NoSuchElementException: Cannot locate element with text: Baby cat
//		System.out.println("Option Selected : " + select123.getFirstSelectedOption().getText());

//		select123.selectByIndex(2);
//		System.out.println("Option Selected : " + select123.getFirstSelectedOption().getText());

//		select123.selectByIndex(-1);  //NoSuchElementException: Cannot locate option with index: -1
//		select123.selectByIndex(30);  //NoSuchElementException: Cannot locate option with index: 30
//		select123.selectByIndex();

//		select123.selectByValue("avatar");
//		System.out.println("Option Selected : " + select123.getFirstSelectedOption().getText());

//		select123.selectByValue("Avatar");   //NoSuchElementException: Cannot locate option with value: Avatar
//		select123.selectByValue("");  //NoSuchElementException: Cannot locate option with value:

//		select123.selectByValue();
        Thread.sleep(5000);

        driver.close();
    }

}
package automation;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPractice {

    public static void main(String[] args) throws InterruptedException {
        // TODO Auto-generated method stub
        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\src\\main\\resources\\drivers\\chromedriver_win.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

//      driver.get("https://www.seleniumeasy.com/test/javascript-alert-box-demo.html");

//		WebElement alertBoxButton = driver.findElement(By.cssSelector("button[onclick='myAlertFunction()']"));
//		Thread.sleep(2000);
//		alertBoxButton.click();
//		Thread.sleep(5000);
//
//		Alert alert1 = driver.switchTo().alert();
//		System.out.println("Text of alert is \n" + alert1.getText());
//		Thread.sleep(2000);
//		alert1.accept();
//		alert1.dismiss();
//		alert1.sendKeys("123");  //ElementNotInteractableException: element not interactable: User dialog does not have a text box input field.

//		WebElement alertConfirmationBoxButton = driver.findElement(By.cssSelector("button[onclick='myConfirmFunction()']"));
//		alertConfirmationBoxButton.click();

//		Alert alert2 = driver.switchTo().alert();
//		System.out.println("Text of Confirmation alert is \n" + alert2.getText());
//		Thread.sleep(2000);
//		alert2.accept();
//		alert2.dismiss();
//		alert2.sendKeys("123");   //ElementNotInteractableException: element not interactable: User dialog does not have a text box input field.
//		WebElement actionOfConfirmAlert = driver.findElement(By.id("confirm-demo"));
//		System.out.println("Action Performed For Confirmation alert is : \n" + actionOfConfirmAlert.getText());

//        WebElement alertPromptBoxButton = driver.findElement(By.cssSelector("button[onclick='myPromptFunction()']"));
//        alertPromptBoxButton.click();
//
//        Alert alert3 = driver.switchTo().alert();
//		System.out.println("Text of Prompt alert is \n" + alert3.getText());
//		Thread.sleep(2000);
//        alert3.accept();
//		alert3.dismiss();
//		alert3.sendKeys("123");//alert3.accept();
//		WebElement actionOfPromptAlert = driver.findElement(By.id("prompt-demo"));
//		System.out.println("Action Performed for Prompt alert is : " + actionOfPromptAlert.getText());


//        WebElement actionOfPromptAlert = driver.findElement(By.id("prompt-demo"));
//        System.out.println("Is Displayed : " + actionOfPromptAlert.isDisplayed());


//************************************************************************************************************


//        driver.get("https://chercher.tech/practice/practice-pop-ups-selenium-webdriver");
        driver.get(System.getProperty("user.dir") + "\\src\\main\\htmlCode\\alertDemo.html");

//        WebElement alertBoxButton = driver.findElement(By.cssSelector("button[onclick='alertFunction()']"));
//		Thread.sleep(2000);
//		alertBoxButton.click();
//		Thread.sleep(5000);
//
//		Alert alert1 = driver.switchTo().alert();
//		System.out.println("Text of alert is \n" + alert1.getText());
//		Thread.sleep(2000);
//		alert1.accept();
//		alert1.dismiss();
//		alert1.sendKeys("123");  //ElementNotInteractableException: element not interactable: User dialog does not have a text box input field.

		WebElement alertConfirmationBoxButton = driver.findElement(By.cssSelector("button[onclick='confirmFunction()']"));
		alertConfirmationBoxButton.click();
		Thread.sleep(2000);

		Alert alert2 = driver.switchTo().alert();
		System.out.println("Text of Confirmation alert is \n" + alert2.getText());
		Thread.sleep(2000);
//		alert2.accept();
//		alert2.dismiss();
		alert2.sendKeys("123");   //ElementNotInteractableException: element not interactable: User dialog does not have a text box input field.
//		WebElement actionOfConfirmAlert = driver.findElement(By.id("confirmdemo"));
//		System.out.println("Action Performed For Confirmation alert is : \n" + actionOfConfirmAlert.getText());

//        WebElement alertPromptBoxButton = driver.findElement(By.cssSelector("button[onclick='promptFunction()']"));
//        alertPromptBoxButton.click();
//
//        Alert alert3 = driver.switchTo().alert();
//		System.out.println("Text of Prompt alert is \n" + alert3.getText());
//		Thread.sleep(2000);
//        alert3.accept();
//		alert3.dismiss();
//		alert3.sendKeys("Qwerty");alert3.accept();
//		WebElement actionOfPromptAlert = driver.findElement(By.id("promptdemo"));
//		System.out.println("Action Performed for Prompt alert is : " + actionOfPromptAlert.getText());


//        WebElement actionOfPromptAlert = driver.findElement(By.id("prompt-demo"));
//        System.out.println("Is Displayed : " + actionOfPromptAlert.isDisplayed());


        Thread.sleep(5000);
        driver.close();
    }

}
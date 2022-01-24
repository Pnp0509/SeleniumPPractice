package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.Set;

public class MultipleWindow {

    public static void main(String[] args) throws InterruptedException {
        // TODO Auto-generated method stub
        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\src\\main\\resources\\drivers\\chromedriver_win.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("http://www.seleniumframework.com/Practiceform/");
        System.out.println("Parent Window Title is : " + driver.getTitle());

        String parentWindowHandler = driver.getWindowHandle();
        System.out.println("Windows Handler String : " + parentWindowHandler);

//        WebElement newBrowserWindowButton = driver.findElement(By.id("button1"));
//		WebElement newMessageWindowButton = driver.findElement(By.cssSelector("button[onclick='newMsgWin()']"));
        WebElement newBrowserTabButton = driver.findElement(By.cssSelector("button[onclick='newBrwTab()']"));

//        newBrowserWindowButton.click();
//        Thread.sleep(5000);
//        System.out.println("Title Before Switching is : " + driver.getTitle());
//
//        Set<String> handlers = driver.getWindowHandles();
//        Iterator<String> itr = handlers.iterator();

//        while (itr.hasNext()) {
//            String childHandle = itr.next();
//            System.out.println("Child Windows Handler String : " + childHandle);
//            if (!childHandle.equalsIgnoreCase(parentWindowHandler)) {
//                System.out.println("Switching to child window");
//                driver.switchTo().window(childHandle);
//                System.out.println("Title After Switching is : " + driver.getTitle());
//
//				System.out.println("Switching to Parent window");
//////				driver.switchTo().defaultContent();  //this will be applicable in frame / iframe
//				driver.switchTo().window(parentWindowHandler);
//				System.out.println("Title After Switching is : " + driver.getTitle());
//            } else {
//                System.out.println("Not Switching");
//            }
//		}

//		newMessageWindowButton.click();
//		Thread.sleep(5000);
//		System.out.println("Title Before Switching is : " + driver.getTitle());
////
//		Set<String> handlers = driver.getWindowHandles();
//		Iterator<String> itr = handlers.iterator();
////
//		while(itr.hasNext()){
//			String childHandle = itr.next();
//			System.out.println("Child Windows Handler String : " + childHandle);
//			if(!childHandle.equalsIgnoreCase(parentWindowHandler)){
//				System.out.println("Switching to child window");
//				driver.switchTo().window(childHandle);
//				System.out.println("Title After Switching is : " + driver.getTitle());
////
////				System.out.println("Switching to Parent window");
//////				driver.switchTo().defaultContent();
////				driver.switchTo().window(parentWindowHandler);
////				System.out.println("Title After Switching is : " + driver.getTitle());
//			}
//			else {
//				System.out.println("Not Switching");
//			}
////
//		}

        newBrowserTabButton.click();
        Thread.sleep(5000);
        System.out.println("Title Before Switching is : " + driver.getTitle());

        Set<String> handlers = driver.getWindowHandles();
        Iterator<String> itr = handlers.iterator();
//
        while(itr.hasNext()){
            String childHandle = itr.next();
            System.out.println("Child Windows Handler String : " + childHandle);
            if(!childHandle.equalsIgnoreCase(parentWindowHandler)){
                System.out.println("Switching to child window");
                driver.switchTo().window(childHandle);
                System.out.println("Title After Switching is : " + driver.getTitle());

				System.out.println("Switching to Parent window");
////				driver.switchTo().defaultContent();
				driver.switchTo().window(parentWindowHandler);
				System.out.println("Title After Switching To Parent is : " + driver.getTitle());
            }
            else {
                System.out.println("Not Switching");
            }

        }


//            driver.close();    //current
        driver.quit();
        }

    }
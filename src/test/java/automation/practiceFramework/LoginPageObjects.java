package automation.practiceFramework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPageObjects {
    @FindBy(name = "userName")
    WebElement inputUsername;

    @FindBy(name = "password")
    WebElement inputPassword;

    @FindBy(name = "submit")
    WebElement buttonSubmit;

    WebDriver driver;

    public LoginPageObjects(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    public void setTextUsername(String username){
        System.out.println("Setting username as : " + username);
        inputUsername.sendKeys(username);
        System.out.println("Username set");
    }

    public void setTextPassword(String password){
        System.out.println("Setting Password as : " + password);
        inputPassword.sendKeys(password);
        System.out.println("Password set");
    }

    public void clickSubmitButton(){
        System.out.println("Clicking Submit Button");
        buttonSubmit.click();
        System.out.println("Submit button clicked");
    }



}

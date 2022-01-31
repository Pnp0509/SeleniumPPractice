package automation.Swaglab2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPageElements {
    @FindBy(xpath = "//input[@placeholder='Username']")
    WebElement inputUserName;

    @FindBy(xpath = "//input[@placeholder='Password']")
    WebElement inputPassword;

    @FindBy(xpath = "//input[@data-test='login-button']")
    WebElement loginButton;

    WebDriver driver;

    public LoginPageElements(WebDriver driver){
        this.driver= driver;
        PageFactory.initElements(driver,this);
    }

    public void setTextUsername(String username){
        System.out.println("Setting username as : " + username);
        inputUserName.sendKeys(username);
        System.out.println("Username set");
    }

    public void setTextPassword(String password){
        System.out.println("Setting Password as : " + password);
        inputPassword.sendKeys(password);
        System.out.println("Password set");
    }

    public void clickSubmitButton(){
        System.out.println("Clicking Submit Button");
        loginButton.click();
        System.out.println("Submit button clicked");
    }
}

package Pages;

import HelpMethods.ElementMethod;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage{

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = "input[placeholder='E mail']")
    public WebElement emailEl;

    @FindBy(xpath = "//input[@placeholder='Password']")
    public WebElement passEl;

    @FindBy(id = "enterbtn")
    public WebElement submitBtnEl;

    @FindBy(id = "errormsg")
    public WebElement errorEl;

    public void loginInvalid(String email, String password, String expectedMessage){
        elementMethod.FillElement(emailEl,email);
        elementMethod.FillElement(passEl,password);
        elementMethod.ClickElement(submitBtnEl);
        elementMethod.ValidateElementMessage(errorEl,expectedMessage);
    }

}

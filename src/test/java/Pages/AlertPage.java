package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class AlertPage extends BasePage{
    public AlertPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = ".nav-stacked li a")
    public List<WebElement> alertList;

    @FindBy(css = "#OKTab button")
    public WebElement alertBtn;

    @FindBy(css = "#CancelTab button")
    public WebElement alertBtn2;

    @FindBy(css = "#Textbox button")
    public WebElement alertBtn3;

    public void acceptAlert(){
        alertList.get(0).click();
        alertBtn.click();
        alertMethod.AcceptAlert();
    }

    public void dismissAlert(){
        alertList.get(1).click();
        alertBtn2.click();
        alertMethod.DismissAlert();
    }

    public void fillAlert(String message){
        alertList.get(2).click();
        alertBtn3.click();
        alertMethod.FillAlert(message);
    }

}

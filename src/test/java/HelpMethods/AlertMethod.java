package HelpMethods;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;

public class AlertMethod {

    public WebDriver driver;

    public AlertMethod(WebDriver driver){
        this.driver = driver;
    }

    public void AcceptAlert(){
        Alert alert = driver.switchTo().alert();
        alert.accept();
    }

    public void DismissAlert(){
        Alert alert = driver.switchTo().alert();
        alert.dismiss();
    }

    public void FillAlert(String message){
        Alert alert = driver.switchTo().alert();
        alert.sendKeys(message);
        alert.accept();
    }
}

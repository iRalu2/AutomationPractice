package HelpMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FrameMethod {
    public WebDriver driver;

    public FrameMethod(WebDriver driver){
        this.driver = driver;
    }

    public void SwitchFrame(String frame){
        driver.switchTo().frame(frame);
    }

    public void SwitchFrame(WebElement element){
        driver.switchTo().frame(element);
    }

    public void SwitchToDefault(){
        driver.switchTo().defaultContent();
    }
}

package Pages;

import HelpMethods.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class BasePage {

    public WebDriver driver;
    public ElementMethod elementMethod;
    public FrameMethod frameMethod;
    public PageMethod pageMethod;
    public WindowMethod windowMethod;

    public AlertMethod alertMethod;

    public BasePage(WebDriver driver) {
        this.driver = driver;
        elementMethod = new ElementMethod(driver);
        frameMethod = new FrameMethod(driver);
        pageMethod = new PageMethod(driver);
        windowMethod = new WindowMethod(driver);
        alertMethod = new AlertMethod(driver);
        PageFactory.initElements(driver,this);
    }



}

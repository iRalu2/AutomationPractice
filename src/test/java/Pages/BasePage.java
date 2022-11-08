package Pages;

import HelpMethods.ElementMethod;
import HelpMethods.FrameMethod;
import HelpMethods.PageMethod;
import HelpMethods.WindowMethod;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class BasePage {

    public WebDriver driver;
    public ElementMethod elementMethod;
    public FrameMethod frameMethod;
    public PageMethod pageMethod;
    public WindowMethod windowMethod;

    public BasePage(WebDriver driver) {
        this.driver = driver;
        elementMethod = new ElementMethod(driver);
        frameMethod = new FrameMethod(driver);
        pageMethod = new PageMethod(driver);
        windowMethod = new WindowMethod(driver);
        PageFactory.initElements(driver,this);
    }



}

package SharedData;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.time.Duration;

public class SharedData {
    public WebDriver driver;

    //@BeforeMethod
    public void prepaireDriver() {
        //Trebuie sa setam driverul de chrome
        //System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver");
        driver = new ChromeDriver();
        //Accesam un anumit url:
        driver.get("https://demo.automationtesting.in/Index.html");
        //Facem browserul in modul maximised.
        driver.manage().window().maximize();
        //WAIT implicit
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    //@AfterMethod
    public void closeDriver(){
        driver.quit();
        //Quit inchide toate taburile din browser
        //driver.close();
        //Close inchide numai tab-ul curent
    }
}

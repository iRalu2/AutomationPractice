package Tests;

import SharedData.SharedData;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class AlertTest extends SharedData {

    @Test
    public void MetodaTest(){
        WebElement skipSignIn = driver.findElement(By.id("btn2"));
        skipSignIn.click();

        WebElement switchToElement = driver.findElement(By.xpath("//a[text()='SwitchTo']"));
        Actions actiuni = new Actions(driver);
        actiuni.moveToElement(switchToElement).perform();

        WebElement alertsElement = driver.findElement(By.xpath("//a[text()='Alerts']"));
        actiuni.moveToElement(alertsElement).perform();

        driver.navigate().to("https://demo.automationtesting.in/Alerts.html");

    }
}

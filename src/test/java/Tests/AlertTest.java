package Tests;

import HelpMethods.AlertMethod;
import SharedData.SharedData;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import java.util.List;

public class AlertTest extends SharedData {

    @Test
    public void MetodaTest(){

        AlertMethod alertMethod = new AlertMethod(driver);
        WebElement skipSignIn = driver.findElement(By.id("btn2"));
        skipSignIn.click();

        WebElement switchToElement = driver.findElement(By.xpath("//a[text()='SwitchTo']"));
        Actions actiuni = new Actions(driver);
        actiuni.moveToElement(switchToElement).perform();

        WebElement alertsElement = driver.findElement(By.xpath("//a[text()='Alerts']"));
        actiuni.moveToElement(alertsElement).perform();

        driver.navigate().to("https://demo.automationtesting.in/Alerts.html");

        List<WebElement> alertList = driver.findElements(By.cssSelector(".nav-stacked li a"));
        alertList.get(0).click();

        WebElement alertBtn = driver.findElement(By.cssSelector("#OKTab button"));
        alertBtn.click();

        alertMethod.AcceptAlert();

        alertList.get(1).click();
        WebElement alertBtn2 = driver.findElement(By.cssSelector("#CancelTab button"));
        alertBtn2.click();

        alertMethod.DismissAlert();

        alertList.get(2).click();
        WebElement alertBtn3 = driver.findElement(By.cssSelector("#Textbox button"));
        alertBtn3.click();

        alertMethod.FillAlert("Message");

    }
}

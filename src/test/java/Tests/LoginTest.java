package Tests;

import HelpMethods.ElementMethod;
import HelpMethods.PageMethod;
import Pages.IndexPage;
import Pages.LoginPage;
import SharedData.Hooks;
import SharedData.SharedData;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends Hooks {

    @Test
    public void metodaTest(){

        IndexPage indexPage = new IndexPage(driver);
        indexPage.clickSignIn();

        LoginPage loginPage = new LoginPage(driver);
        loginPage.loginInvalid(propertiesFile.getValue("email"), propertiesFile.getValue("password"), propertiesFile.getValue("loginErrorMessage"));



        //ElementMethod elementMethod = new ElementMethod(driver);
        //PageMethod pageMethod = new PageMethod(driver);

        //Identificam un element
        //WebElement signInElement = driver.findElement(By.id("btn1"));
        //elementMethod.ClickElement(signInElement);

        //Validam o anumita pagina
        //String signInTitlu = "SignIn";
        //Assert.assertTrue(driver.getTitle().equals(signInTitlu));
        //pageMethod.ValidatePageTitle(signInTitlu);

        //WebElement emailElement = driver.findElement(By.cssSelector("input[placeholder='E mail']"));
        //String emailValue = "mail@gmail.com";
        //emailElement.sendKeys(emailValue);
        //elementMethod.FillElement(emailElement,emailValue);

        //WebElement passwordElement = driver.findElement(By.xpath("//input[@placeholder='Password']"));
        //String passwordValue = "password";
        //passwordElement.sendKeys(passwordValue);
        //elementMethod.FillElement(passwordElement,passwordValue);

        //WebElement enterElement = driver.findElement(By.id("enterbtn"));
        //enterElement.click();
        //elementMethod.ClickElement(enterElement);

        //WebElement errorElement = driver.findElement(By.id("errormsg"));
        //String expectedMessage = "Invalid User Name or PassWord";
        //elementMethod.ValidateElementMessage(errorElement,expectedMessage);

        //String actualMessage = errorElement.getText();
        //Testam daca exista mesaj in pagina
        //Assert.assertEquals(actualMessage,expectedMessage,"Testul de pe element nu e corect!");

    }
}

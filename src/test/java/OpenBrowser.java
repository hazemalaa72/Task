import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.security.Key;

public class OpenBrowser {

    public static void main(String[] args) {





    }


    WebDriver driver =null;
    LoginPage login;
    @BeforeTest
    public void OpenBrowser() throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","C:\\Users\\Hazem Alaa Mostafa\\IdeaProjects\\Learning\\src\\Browsers\\chromedriver.exe");
        driver =new ChromeDriver();
        driver.navigate().to("https://the-internet.herokuapp.com/login");
        login =new LoginPage(driver);

        Thread.sleep(3000);

    }

    @Test
    public void ValidData(){
        driver.navigate().to("https://the-internet.herokuapp.com/login");
        login.LoginSteps("tomsmith","SuperSecretPassword!");
        String expectedvalue= "You logged into a secure area!";
        String actualvalue= driver.findElement(login.flashEle()).getText();
        SoftAssert soft=new SoftAssert();
        soft.assertTrue(actualvalue.contains(expectedvalue),"first Assertion");
        soft.assertTrue(driver.findElement(login.cssSelectorEle()).isDisplayed(),"second Assertion");
        soft.assertEquals(driver.getCurrentUrl(),"https://the-internet.herokuapp.com/secure","third Assertion");
        soft.assertAll();
    }
    @Test
    public void InvalidData(){
        driver.navigate().to("https://the-internet.herokuapp.com/login");
        login.LoginSteps("invalid","invald");
         

    }
    @AfterTest
    public void CloseBrowser() throws InterruptedException {
        Thread.sleep(3000);
        driver.quit();

    }


}

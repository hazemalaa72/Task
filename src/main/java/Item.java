import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Item {
    WebDriver driver;
    public Item(WebDriver driver){
        this.driver=driver;


    }
    public WebElement AddtoCartEle(){

        return  driver.findElement(By.id("add-to-cart-button"));

    }

}

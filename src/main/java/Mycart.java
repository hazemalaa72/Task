import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Mycart {
    WebDriver driver;
    public Mycart(WebDriver driver){
        this.driver=driver;


    }
    public WebElement itemEle(){

        return  driver.findElement(By.className("a-truncate-cut"));

    }

}

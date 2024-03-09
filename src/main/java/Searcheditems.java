import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Searcheditems {
    WebDriver driver;
    public Searcheditems(WebDriver driver){
        this.driver=driver;


    }
    public WebElement itemEle(){

        return  driver.findElement(By.className("a-size-base-plus"));

    }

}

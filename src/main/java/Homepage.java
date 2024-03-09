import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Homepage {
    WebDriver driver;
    public Homepage(WebDriver driver){
        this.driver=driver;


    }
    //use page factory

    public WebElement searchEle(){

        return  driver.findElement(By.id("twotabsearchtextbox"));

    }
    public WebElement MycartEle(){

        return  driver.findElement(By.id("nav-cart-count-container"));

    }
    public WebElement todaydealEle(){

        return  driver.findElement(By.cssSelector("a[href=\"/gp/goldbox?ref_=nav_cs_gb\"]"));

    }






    }




import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Todaydeal {
    WebDriver driver;
    public Todaydeal(WebDriver driver){
        this.driver=driver;


    }
    //use page factory

    public WebElement HeadohoneEle(){

        return  driver.findElement(By.cssSelector("input[data-csa-c-element-id=\"filter-department-172541\"] "));

    }
    public WebElement GroceryEle(){

        return  driver.findElement(By.cssSelector("input[data-csa-c-element-id=\"filter-department-16310101\"] "));

    }
    public WebElement DiscountEle(){

        return  driver.findElement(By.cssSelector("a[data-csa-c-element-id=\"filter-discount-10-\"] "));

    }
    public WebElement LastpageEle(){

        return  driver.findElement(By.cssSelector("li[aria-label=\"Page 2 of 2\"]> a "));

    }
    public WebElement AnyitemEle(){

        return  driver.findElement(By.cssSelector("img[src=\"https://m.media-amazon.com/images/I/31kb4LqtQ8L._AC_UF226,226_FMjpg_.jpg\"]"));

    }



}




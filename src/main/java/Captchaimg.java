import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Captchaimg {
    WebDriver driver;
    public Captchaimg(WebDriver driver){
        this.driver=driver;
    }
    public WebElement imgEle(){

        return  driver.findElement(By.cssSelector("img[src=\"https://images-na.ssl-images-amazon.com/captcha/usvmgloq/Captcha_ikxiqxgybj.jpg\"]"));

    }






    }




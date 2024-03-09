import net.sourceforge.tess4j.ITesseract;
import net.sourceforge.tess4j.TesseractException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import java.io.File;

public class Tesseract {
    WebDriver driver;
    public Tesseract(WebDriver driver){
        this.driver=driver;


    }



   public  void ImgTotext() throws TesseractException {
        Captchaimg captchaimg=new Captchaimg(driver);
        captchaimg.imgEle();
       File screenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
       ITesseract tesseract = new net.sourceforge.tess4j.Tesseract();
       String text = tesseract.doOCR(screenshot);
       System.out.println(text);
   }
}

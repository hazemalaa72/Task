import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class OpenBrowser {

    public static void main(String[] args) {}
    WebDriver driver =null;
    Homepage homepage;
    Item item;
    Mycart mycart;
    Searcheditems searcheditems;
    Todaydeal todaydeal;
    SoftAssert soft;
    @BeforeTest
    public void OpenBrowser() throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","C:\\Users\\Hazem Alaa Mostafa\\IdeaProjects\\Task1\\src\\Browsers\\chromedriver.exe");
        driver =new ChromeDriver();
        driver.navigate().to("https://www.amazon.com/");
        driver.manage().window().maximize();
        Thread.sleep(20000);
        homepage =new Homepage(driver);
        item =new Item(driver);
        mycart=new Mycart(driver);
        searcheditems=new Searcheditems(driver);
        todaydeal=new Todaydeal(driver);
        soft=new SoftAssert();
    }


    @Test
    public void ValidScenario1()  {

       homepage.searchEle().sendKeys("car accessories");
        homepage.searchEle().sendKeys(Keys.ENTER);
        searcheditems.itemEle().click();
        item.AddtoCartEle().click();
        homepage.MycartEle().click();
       String acyualvalue= mycart.itemEle().getText();
       String expectedvalue="FORTEM Car Trunk Organizer, Collapsible Multi Compartment Car Organizer, Foldable SUV Storage for Car Accessories for Women Men, Non Slip Bottom, Securing Straps, Cover 50L (Blue, Standard)";
        soft.assertTrue(acyualvalue.contains(expectedvalue),"Scenario 1 Assertion");
    }
    @Test
    public void InValidScenario1()  {
        searcheditems.itemEle().click();
        item.AddtoCartEle().click();
        homepage.MycartEle().click();
        String actualvalue= mycart.itemEle().getText();
        String expectedvalue="FORTEM Car Trunk Organizer, Collapsible Multi Compartment Car Organizer, Foldable SUV Storage for Car Accessories for Women Men, Non Slip Bottom, Securing Straps, Cover 50L (Blue, Standard)";
        soft.assertTrue(actualvalue.contains(expectedvalue),"Scenario 1 Assertion");
    }
    @Test
    public void validScenario2() throws InterruptedException {
        homepage.todaydealEle().click();
        todaydeal.HeadohoneEle().click();
        todaydeal.GroceryEle().click();
        todaydeal.DiscountEle().click();
        Thread.sleep(6000);
        todaydeal.LastpageEle().click();
        Thread.sleep(6000);
        todaydeal.AnyitemEle().click();
        item.AddtoCartEle().click();
        String acyualvalue= driver.getCurrentUrl();
        String expectedvalue="  https://www.amazon.com/BMHOLU-Bluetooth-Charging-Waterproof-Playtime/dp/B0CNM3S9JH?pf_rd_r=HZZDQ5774RYT020MHG2Y&pf_rd_t=Events&pf_rd_i=deals&pf_rd_p=2c03f004-e5df-4113-b2c9-145f7add211d&pf_rd_s=slot-14&ref=dlx_deals_gd_dcl_img_8_96e7d31b_dt_sl14_1d";
        soft.assertTrue(acyualvalue.contains(expectedvalue),"Scenario 2 Assertion");
    }
    @Test
    public void InvalidScenario2()  {
        homepage.todaydealEle().click();
        todaydeal.GroceryEle().click();
        todaydeal.DiscountEle().click();
        todaydeal.LastpageEle().click();
        todaydeal.AnyitemEle().click();
        item.AddtoCartEle().click();

    }
    @AfterTest
    public void CloseBrowser() throws InterruptedException {
        Thread.sleep(3000);
        driver.quit();

    }


}

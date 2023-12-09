package Test1;
import org.junit.Test;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Sam1 {

    @Test
    public void sample1() throws Exception {
//        String driverPath = System.getProperty("user.dir") +"\\Drivers\\chromedriver.exe";
//        System.setProperty("webdriver.chrome.driver", driverPath);
//        ChromeOptions options = new ChromeOptions();
//        options.addArguments("-remote-allow-origins=*");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com/");
        driver.manage().window().maximize();
        //try {
        Thread.sleep(3000);
        Assert.assertEquals("Gmail", driver.getTitle());
       /*}
		catch(AssertionError e)
		{
			System.out.println(e);
		}*/
        driver.quit();
    }

}

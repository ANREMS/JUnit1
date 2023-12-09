package Test1;
import org.junit.Test;
import org.junit.Assert;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

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

    @RunWith(Parameterized.class)
    public static class Sam4 {

        String BrowserChoice;
        public Sam4(String data)
        {
            BrowserChoice = data;
        }
        @Test
        public void Test1()
        {
            if (BrowserChoice.equalsIgnoreCase("Chrome"))
                System.out.println("Open Chrome");
            else if (BrowserChoice.equalsIgnoreCase("Mozilla"))
                System.out.println("Open Mozilla");
            else
                System.out.println("Wrong data");
        }
        @Parameterized.Parameters
        public static Object parameter()
        {
            Object[] data = new Object[3];
            data[0] = "Chrome";
            data[1] = "Mozilla";
            data[2] = "Safari";
            return data;
        }

    }
}

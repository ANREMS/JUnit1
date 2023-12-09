package Parameters;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class Sam4 {

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
    @Parameters
    public static Object parameter()
    {
        Object[] data = new Object[3];
        data[0] = "Chrome";
        data[1] = "Mozilla";
        data[2] = "Safari";
        return data;
    }

}

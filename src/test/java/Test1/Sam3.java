package Test1;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.AfterClass;
import org.junit.After;
import org.junit.Test;
public class Sam3 {

    @BeforeClass
    public static void Method3()
    {
        System.out.println("Before Class...");
    }
    @Before
    public void Method1()
    {
        System.out.println("Before Test...");
    }
    @Test
    public void Test1()
    {
        System.out.println("Test1...");
    }
    @After
    public void Method2()
    {
        System.out.println("After Test...");
    }
    @AfterClass
    public static void Method4()
    {
        System.out.println("After Class...");
    }

}

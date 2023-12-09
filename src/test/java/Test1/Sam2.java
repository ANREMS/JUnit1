package Test1;
import org.junit.Before;
import org.junit.Test;
import org.junit.After;
public class Sam2 {

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
    @Test
    public void Test2()
    {
        System.out.println("Test2...");
    }
    @After
    public void Method2()
    {
        System.out.println("After Test...");
    }


}

import com.campaign.App;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestClass1 {

    private App app;

    @BeforeClass
    public void init() {
        app = new App();
    }

    @Test
    public void testM1() throws InterruptedException {
        System.out.println("Test class T1");
        System.out.println("Testing M1");
        assert (app.m1());
    }

}

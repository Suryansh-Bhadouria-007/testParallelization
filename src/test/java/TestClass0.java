import com.adobe.campaign.App;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestClass0 {

    private App app;

    @BeforeClass
    public void init() {
        app = new App();
    }

    @Test
    public void testM0() throws InterruptedException {
        System.out.println("Test class T0");
        System.out.println("Testing M0");
        assert (app.m0());
    }

}

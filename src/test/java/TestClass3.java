import com.adobe.campaign.App;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestClass3 {

    private App app;

    @BeforeClass
    public void init() {
        app = new App();
    }

    @Test
    public void testM3() throws InterruptedException {
        System.out.println("Test class T3");
        System.out.println("Testing M3");
        assert (app.m3());
    }

}

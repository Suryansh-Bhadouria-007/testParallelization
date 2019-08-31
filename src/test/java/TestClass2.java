import com.adobe.campaign.App;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestClass2 {

    private App app;

    @BeforeClass
    public void init() {
        app = new App();
    }

    @Test
    public void testM2() throws InterruptedException {
        System.out.println("Test class T2");
        System.out.println("Testing M2");
        assert (app.m2());
    }

}

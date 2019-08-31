import com.campaign.App;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestClass4 {

    private App app;

    @BeforeClass
    public void init() {
        app = new App();
    }

    @Test
    public void testM4() throws InterruptedException {
        System.out.println("Test class T4");
        System.out.println("Testing M4");
        assert (app.m4());
    }

}

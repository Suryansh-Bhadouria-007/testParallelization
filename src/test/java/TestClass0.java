import com.campaign.App;
import org.testng.annotations.Test;

public class TestClass0 {

    private App app;

    @Test
    public void testM0() throws InterruptedException {
        app = new App();
        System.out.println("Test class T0; method m0");
        assert (app.m0());
    }

}

import com.campaign.App;
import org.testng.annotations.Test;

public class TestClass3 {

    private App app;

    @Test
    public void testM3() throws InterruptedException {
        app = new App();
        System.out.println("Test class T3;method m3");
        assert (app.m3());
    }

}

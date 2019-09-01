import com.campaign.App;
import org.testng.annotations.Test;

public class TestClass4 {

    private App app;

    @Test
    public void testM4() throws InterruptedException {
        app = new App();
        System.out.println("Test class T4;method m4");
        assert (app.m4());
    }

}

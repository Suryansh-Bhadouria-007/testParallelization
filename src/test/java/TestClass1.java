import com.campaign.App;
import org.testng.annotations.Test;

public class TestClass1 {

    private App app;

    @Test
    public void testM1() throws InterruptedException {
        app = new App();
        System.out.println("Test class T1;method m1");
        assert (app.m1());
    }

}

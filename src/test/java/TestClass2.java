import com.campaign.App;
import org.testng.annotations.Test;

public class TestClass2 {

    private App app;

    @Test
    public void testM2() throws InterruptedException {
        app = new App();
        System.out.println("Test class T2;method m2");
        assert (app.m2());
    }

}

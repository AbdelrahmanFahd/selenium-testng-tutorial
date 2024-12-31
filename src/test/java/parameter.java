import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class parameter {


    @Test
    @Parameters({"browser", "data Type"})
    public void sumOne(String browser, String data) {
        System.out.println(browser);
        System.out.println(data);

    }
}

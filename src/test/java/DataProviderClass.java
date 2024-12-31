import org.testng.annotations.DataProvider;

public class DataProviderClass {

    @DataProvider(name = "Sum data")
    public Object[][] data() {
        return new Object[][]{
                {10, 20, 30},
                {20, 20, 40},
                {5, 20, 25}
        };
    }

    @DataProvider(name = "User data")
    public Object[][] userData() {
        return new Object[][]{
                {"fahd", "123"},
                {"ali", "456"},
                {"ahmed", "789"}
        };
    }

}

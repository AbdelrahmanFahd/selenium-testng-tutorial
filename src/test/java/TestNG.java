import org.testng.annotations.*;

public class TestNG {

    // Annotation
    // Suite = Collection of Tests
    // Test = Collection of Classes
    // Class = Collection of Test Cases
    // Method = Test Case
    @BeforeSuite
    public void beforeSuite() {
        System.out.println("Before Suite");
    }

    @BeforeTest
    public void beforeTest() {
        System.out.println("Before Test");
    }

    @BeforeClass
    public void before() {
        System.out.println("Before Class");
    }

    @BeforeMethod
    public void setup() {
        System.out.println("Before Test Case");
    }

    @Test
    public void testOne() {
        System.out.println(1);
    }

    @Test
    public void testTwo() {
        System.out.println(2);
    }

    @Test
    public void testThree() {
        System.out.println(3);
    }

    @AfterMethod
    public void afterMethod() {
        System.out.println("After Test Case");
    }

    @AfterClass
    public void after() {
        System.out.println("After Class");
    }

    @AfterTest
    public void afterTest() {
        System.out.println("After Test");
    }

    @AfterSuite
    public void afterSuite() {
        System.out.println("After Suite");
    }


}

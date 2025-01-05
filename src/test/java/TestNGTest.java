import com.beust.ah.A;
import com.google.gson.stream.JsonToken;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.*;
import org.testng.asserts.SoftAssert;
import org.testng.internal.TestResult;

import java.util.List;

import static org.testng.Assert.assertEquals;
import static org.testng.AssertJUnit.assertTrue;

public class TestNGTest {


    @Test
    public void sumOne() {
        int x = 11;
        int y = 20;
        int sum = x + y;

        // ------- Assertion -------
        // Assert.assertEquals(Actual, Expected, Message); TestNG
        // assertEquals(Message, Expected, Actual); JUnit
//        List<String> list = List.of("Hello", "World");
//        Assert.assertEquals(sum, 50, "Sum is not correct");
//        Assert.assertTrue(true);
//        Assert.assertFalse(false);
//        Assert.assertNotEquals(10, 20, "Not Equal");
//        Assert.assertNull(null, "Null");
//        Assert.assertNotNull("Hello", "Not Null");
//        Assert.assertSame(10, 10, "Same");
//        Assert.assertTrue(list.contains("Hello"), "List contains Hello");

        // ------- Hard Assertion -------
        // If one assertion fails, the rest of the test will not run
//        Assert.assertEquals(sum, 30, "Sum is not correct");
//        Assert.assertTrue(sum >= 30);
//        Assert.assertTrue(sum >= 50);

        // ------- Soft Assertion -------
        // If one assertion fails, the rest of the test will run
//        SoftAssert softAssert = new SoftAssert();
//        softAssert.assertEquals(sum, 30, "Sum is not correct");
//        softAssert.assertTrue(sum >= 30);
//        softAssert.assertTrue(sum >= 50);
//        softAssert.assertAll();

        // ------- Fail -------
        // If this line is executed, the test will fail
//        Assert.fail("This is a fail message");

        // ------- Annotation -------
        // ------- Suite -------
        // ------- Test -------
        // ------- Class -------
        // ------- Method -------
        // ------- Before Suite -------
        // ------- Before Test -------
        // ------- Before Class -------
        // ------- Before Test Case -------
        // ------- Test Case -------
        // ------- After Test Case -------
        // ------- After Class -------
        // ------- After Test -------
        // ------- After Suite -------
        // ------- Before Method -------
        // ------- After Method -------

    }

    @Test(groups = {"smoke"})
    public void register() {
        // Register Code
        System.out.println("Register");
//        assertTrue(false);
    }

    @Test(dependsOnMethods = "register", groups = {"smoke"})
    public void login() {
        // Login Code
        System.out.println("Login");
    }

    @Test(dependsOnGroups = "smoke")
    public void logout() {
        // Logout Code
        System.out.println("Logout");
    }

    @AfterMethod
    public void afterMethod(ITestResult testResult) {
        if (ITestResult.SUCCESS == testResult.getStatus())
            System.out.println("Test Case Success");
        else
            System.out.println("Test Case Failed");
    }

    @Test(dataProviderClass = DataProviderClass.class, dataProvider = "Sum data")
    public void sumThree(int x, int y, int expected) {
        int sum = x + y;
        assertEquals(sum, expected, "Sum is not correct");
    }

}


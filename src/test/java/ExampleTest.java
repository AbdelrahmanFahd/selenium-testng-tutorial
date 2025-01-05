import Pages.HomePage;
import Pages.MyAccountPage;
import Pages.RegisterPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class ExampleTest {
    WebDriver driver;


    @BeforeTest
    public void beforeTest() {
        driver = new ChromeDriver();
    }

    @BeforeMethod
    public void beforeMethod() {
        driver.get("https://egyptlaptop.com/");

        HomePage homePage = new HomePage(driver);
        homePage.clickAccountButton();
        homePage.clickRegisterButton();
    }

    @Test
    public void testHappyScenario() {

        //  Identify Register Page
        RegisterPage registerPage = new RegisterPage(driver);

        // interact with the elements
        registerPage.enterFirstName("Abdelrahman");
        registerPage.enterLastName("Fahd");
        registerPage.enterPhone("01000000000");
        registerPage.enterEmail("abdelrahman12111111@Test.com");
        registerPage.enterPassword("123456");
        registerPage.enterConfirmPassword("123456");
        registerPage.clickRegisterButton();

        // interact with the elements
        MyAccountPage myAccountPage = new MyAccountPage(driver);
        assertEquals(myAccountPage.getSuccessMessage(), "Successfully registered");

    }

    @Test
    public void registerWithoutFirstname() {
        //  Identify Register Page
        RegisterPage registerPage = new RegisterPage(driver);

        // interact with the elements
        registerPage.enterLastName("Fahd");
        registerPage.enterPhone("01000000000");
        registerPage.enterEmail("abdelrahman1211@Test.com");
        registerPage.enterPassword("123456");
        registerPage.enterConfirmPassword("123456");
        registerPage.clickRegisterButton();

        // Assert the result
        assertEquals(registerPage.getFirstNameErrorMessage(), "The First name field is mandatory.");

    }

    @Test
    public void registerWithoutLastname() {
        //  Identify Register Page
        RegisterPage registerPage = new RegisterPage(driver);

        // interact with the elements
        registerPage.enterFirstName("Abdelrahman");
        registerPage.enterPhone("01000000000");
        registerPage.enterEmail("abdelrahman1211@Test.com");
        registerPage.enterPassword("123456");
        registerPage.enterConfirmPassword("123456");
        registerPage.clickRegisterButton();

        // Assert the result
        assertEquals(registerPage.getLastNameErrorMessage(), "The Last name field is mandatory.");

    }

    @Test
    public void registerWithoutPhone() {

        //  Identify Register Page
        RegisterPage registerPage = new RegisterPage(driver);
        // interact with the elements
        registerPage.enterFirstName("Abdelrahman");
        registerPage.enterLastName("Fahd");
        registerPage.enterEmail("abdelrahman1211@Test.com");
        registerPage.enterPassword("123456");
        registerPage.enterConfirmPassword("123456");
        registerPage.clickRegisterButton();

        // Assert the result
        assertEquals(registerPage.getPhoneErrorMessage(), "The Phone field is mandatory.");

    }

}


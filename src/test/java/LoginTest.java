import Pages.HomePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

public class LoginTest {
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
        homePage.clickLoginButton();
    }
}

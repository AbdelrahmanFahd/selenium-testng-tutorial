package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {
    WebDriver driver;

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    // Locators
    By accountButton = By.id("sw_dropdown_624");
    By registerButton = By.cssSelector("a[href=\"https://egyptlaptop.com/profiles-add-en\"]");
    By loginButton = By.cssSelector("href=\"https://egyptlaptop.com/login/?return_url=index.php\"");

    // Identify the elements

    WebElement accountButtonElement() {
        return driver.findElement(accountButton);
    }

    WebElement registerButtonElement() {
        return driver.findElement(registerButton);
    }

    WebElement loginButtonElement() {
        return driver.findElement(loginButton);
    }

    // interact with the elements

    public void clickAccountButton() {
        accountButtonElement().click();
    }

    public void clickRegisterButton() {
        registerButtonElement().click();
    }

    public void clickLoginButton() {
        loginButtonElement().click();
    }
}

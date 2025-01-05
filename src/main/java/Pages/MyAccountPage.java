package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MyAccountPage {
    WebDriver driver;

    public MyAccountPage(WebDriver driver) {
        this.driver = driver;
    }

    // Locators
    By successMessage = By.className("ty-mainbox-title");

    // Identify the elements
    WebElement successMessageElement() {
        return driver.findElement(successMessage);
    }

    // interact with the elements
    public String getSuccessMessage() {
        return successMessageElement().getText();
    }


    public void fillData(String name, String password) {
        driver.findElement(By.id("email")).sendKeys(name);
        driver.findElement(By.id("password")).sendKeys(password);
    }
}

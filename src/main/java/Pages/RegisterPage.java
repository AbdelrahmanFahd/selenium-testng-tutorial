package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RegisterPage {
    WebDriver driver;

    public RegisterPage(WebDriver driver) {
        this.driver = driver;
    }

    // Locators
    By firstName = By.id("elm_6");
    By lastName = By.id("elm_7");
    By phone = By.id("elm_9");
    By email = By.id("email");
    By password = By.id("password1");
    By confirmPassword = By.id("password2");
    By firstnameErrorMessage = By.id("elm_6_error_message");
    By lastnameErrorMessage = By.id("elm_7_error_message");
    By phoneErrorMessage = By.id("elm_9_error_message");
    // Identify the elements

    WebElement firstNameElement() {
        return driver.findElement(firstName);
    }

    WebElement lastNameElement() {
        return driver.findElement(lastName);
    }

    WebElement phoneElement() {
        return driver.findElement(phone);
    }

    WebElement emailElement() {
        return driver.findElement(email);
    }

    WebElement passwordElement() {
        return driver.findElement(password);
    }

    WebElement confirmPasswordElement() {
        return driver.findElement(confirmPassword);
    }

    WebElement registerButtonElement() {
        return driver.findElement(By.name("dispatch[profiles.update]"));
    }

    WebElement firstNameErrorMessageElement() {
        return driver.findElement(firstnameErrorMessage);
    }

    WebElement lastNameErrorMessageElement() {
        return driver.findElement(lastnameErrorMessage);
    }

    WebElement phoneErrorMessageElement() {
        return driver.findElement(phoneErrorMessage);
    }

    // interact with the elements
    public void enterFirstName(String firstName) {
        firstNameElement().sendKeys(firstName);
    }

    public void enterLastName(String lastName) {
        lastNameElement().sendKeys(lastName);
    }

    public void enterPhone(String phone) {
        phoneElement().sendKeys(phone);
    }

    public void enterEmail(String email) {
        emailElement().sendKeys(email);
    }

    public void enterPassword(String password) {
        passwordElement().sendKeys(password);
    }

    public void enterConfirmPassword(String confirmPassword) {
        confirmPasswordElement().sendKeys(confirmPassword);
    }

    public void clickRegisterButton() {
        registerButtonElement().click();
    }

    public String getFirstNameErrorMessage() {
        return driver.findElement(By.id("elm_6_error_message")).getText();
    }

    public String getLastNameErrorMessage() {
        return driver.findElement(By.id("elm_7_error_message")).getText();
    }

    public String getPhoneErrorMessage() {
        return driver.findElement(By.id("elm_9_error_message")).getText();
    }


}

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.*;

import javax.swing.*;
import java.security.Key;
import java.time.Duration;
import java.util.List;

public class Selenium {

    public static void main(String[] args) throws InterruptedException {
        // ------------ WebDriver ---------------------
        WebDriver driver = new ChromeDriver();
//        driver.get("https://the-internet.herokuapp.com/login");
//
//        driver.switchTo().newWindow(WindowType.TAB);
//        Thread.sleep(1000);
//
//        driver.manage().window().maximize();
//        driver.manage().window().maximize();
//        driver.manage().window().setSize(new Dimension(4,15));
//        driver.close();
//        driver.quit();

//         ------------ Navigation ---------------------
//        driver.navigate().to("https://the-internet.herokuapp.com/login");
//        driver.navigate().back();
//        driver.navigate().forward();
//        driver.navigate().refresh();
//
        // ------------ Page Info ---------------------
//        System.out.println(driver.getTitle());
//        System.out.println(driver.getCurrentUrl());
//        System.out.println(driver.getPageSource());

        // ------------ Locators ---------------------
//        // < tag attribute = "value" > Text </tag>
//
//        // tag[attribute = "value"]
//
//        // //tag[@attribute = "value"]
//        // /tag[@attribute = "value"]
//
//        // /html/body/div[2]/div/div/form/div[2]/div
//        // //div[3]/div/div/form/div[2]/div
//
//        // //div[@id="content"]//h2


        // ------------ Find Element ---------------------


//        WebElement username = driver.findElement(By.id("username"));
//        WebElement password = driver.findElement(By.id("password"));
//        WebElement loginButton = driver.findElement(By.cssSelector("button[type=\"submit\"]"));
//
//        username.sendKeys("tomsmith");
////        username.sendKeys(Keys.PAGE_DOWN);
////        username.sendKeys(Keys.chord(Keys.ALT, Keys.CONTROL, Keys.DELETE));
//
//        password.sendKeys("SuperSecretPassword!");
//        password.clear();
//        password.submit();
//        loginButton.click();
//
//        WebElement loginHeader = driver.findElement(By.xpath("//div[@id=\"content\"]//h2"));
//        System.out.println(loginHeader.getText());
//
//       String attribute = driver.findElement(By.cssSelector("#content")).getAttribute("class");
//      System.out.println(attribute);
//      List<WebElement> element = driver.findElements(By.xpath("//div[@id=\"content\"]/diww"));
//        System.out.println(element);

        // ------------ DropDown Button ---------------------

//        driver.get("https://the-internet.herokuapp.com/dropdown");
//
//        WebElement selectElement = driver.findElement(By.id("dropdown"));
//
//        Select select = new Select(selectElement);
//
////        select.selectByIndex(1);
//        Thread.sleep(1000);
//        select.selectByValue("2");
//        Thread.sleep(1000);
//        select.selectByVisibleText("Option 1");
//
//        select.getOptions();

        // ------------ Actions ---------------------
//        driver.get("https://the-internet.herokuapp.com/drag_and_drop");
//        driver.manage().window().maximize();

//        Actions actions = new Actions(driver);

//        actions
//                .moveToElement(driver.findElement(By.cssSelector("a[href=\"/computers\"]")))
//                .click()
//                .contextClick()
//                .dragAndDrop(driver.findElement(By.id("column-a")), driver.findElement(By.id("column-b")))
//                .perform();


        // ------------ Alerts ---------------------
//        driver.get("https://the-internet.herokuapp.com/javascript_alerts");
//        driver.manage().window().maximize();
//
//        driver.findElement(By.cssSelector("button[onclick=\"jsAlert()\"]")).click();
//
//        Thread.sleep(1000);
//        driver.switchTo().alert().accept();
//
//        driver.findElement(By.cssSelector("button[onclick=\"jsConfirm()\"]")).click();
//
//
//        Thread.sleep(1000);
//        driver.switchTo().alert().accept();
////        driver.switchTo().alert().dismiss();
//
//        driver.findElement(By.cssSelector("button[onclick=\"jsPrompt()\"]")).click();
//        driver.switchTo().alert().sendKeys("Fahd");
//        driver.switchTo().alert().dismiss();

        // --------------- Upload File ------------------

//        driver.get("https://the-internet.herokuapp.com/upload");
//        driver.manage().window().maximize();
//        WebElement uploadButton = driver.findElement(By.id("file-upload"));
//        uploadButton.sendKeys("E:\\Project\\Selenium\\pom.xml");

        // ------------- Forms -----------------

//        driver.get("https://the-internet.herokuapp.com/iframe");
//        driver.manage().window().maximize();
//
//        driver.switchTo().frame("mce_0_ifr");
//
//        WebElement element = driver.findElement(By.cssSelector("#tinymce p"));
//        element.sendKeys("Hello");
//
//       driver.switchTo().parentFrame();
//        driver.switchTo().defaultContent();

        // ------------- Wait Strategies -----------------

        // Implicit Wait
        driver.get("https://the-internet.herokuapp.com/dynamic_loading/2");
        driver.findElement(By.cssSelector("#start button")).click();

//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        // Explicit Wait
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#finish h4")));
        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.cssSelector("#loading")));
//        wait.until(ExpectedConditions.invisibilityOf(driver.findElement(By.cssSelector("#loading"))));
        System.out.println(driver.findElement(By.cssSelector("#finish h4")).getText());

        // Fluent Wait
        Wait<WebDriver> fluentWait = new FluentWait<>(driver)
                .withTimeout(Duration.ofSeconds(30))
                .pollingEvery(Duration.ofSeconds(5))
                .ignoring(NoSuchElementException.class)
                .ignoring(TimeoutException.class);
        WebElement finishElement = fluentWait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#finish h4")));

//        System.out.println(finishElement.getText());


    }
}

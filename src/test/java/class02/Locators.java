package class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {
    public static void main(String[] args) throws InterruptedException {

        // instance

        WebDriver driver = new ChromeDriver();

        // navigate to the website
        driver.get("http://35.175.58.98/input-form-locator.php");

        // Maximize window
        driver.manage().window().maximize();

        // locate the web element and we can save it in a variable which to the left of = sign,
        // and we add WebElement before the variable name "firstName"
      WebElement firstName = driver.findElement(By.id("first_name"));
      // use send key to send the data in userName
      firstName.sendKeys("Moazzam");

        // locate the WebElement last name:

        WebElement lastName = driver.findElement(By.name("last_name"));
        lastName.sendKeys("sadiq");

        // locate the WebElement Email
       WebElement email = driver.findElement(By.className("form-control-01"));
       email.sendKeys("fahim@gmail.com");

       // locate the button and click on it
        WebElement submitBtn = driver.findElement(By.tagName("button"));
        submitBtn.click();

        // locate the WebElement Link
        WebElement linkBtn = driver.findElement(By.linkText("Link"));
        linkBtn.click();
        Thread.sleep(2000);
        // locate the WebElement using partial link text
       WebElement clickHere = driver.findElement(By.partialLinkText("Here."));

    }
}
package class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookExamples {

    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
//
        driver.get("https://facebook.com");
//
        driver.manage().window().maximize();

       WebElement email = driver.findElement(By.id("email"));
       email.sendKeys("Moazzam@gmail.com");

       WebElement password = driver.findElement(By.name("pass"));
        password.sendKeys("MXZy123$");

        WebElement loginBtn = driver.findElement(By.name("login"));
        loginBtn.sendKeys("login");
        loginBtn.click();

    }
}

package class03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium03HW {
    public static void main(String[] args) throws InterruptedException {
        //instance
        WebDriver driver = new ChromeDriver();
        // goto facebook.com
        driver.get("https://demoqa.com/text-box");
        //        maximize the window
        driver.manage().window().maximize();

        WebElement FullName = driver.findElement(By.xpath("//input[@placeholder='Full Name'] "));
        Thread.sleep(2000);
        FullName.sendKeys("Fahim Khan");

        WebElement Email = driver.findElement(By.xpath("//input[@id='userEmail']"));
        Thread.sleep(2000);
        Email.sendKeys("This@gmail.com");

        WebElement Current_Address = driver.findElement(By.xpath("//textarea[@id='currentAddress']"));
        Thread.sleep(1000);
        Current_Address.sendKeys("5454 California St, San Francisco, CA 94544");

        WebElement permanent_Address = driver.findElement(By.xpath("//textarea[@id='permanentAddress']"));
        Thread.sleep(1000);
        permanent_Address.sendKeys("5454 Martin Luther King BLVD, New York, NY 74534");

        // now lets go and submit our form

        WebElement submit = driver.findElement(By.xpath("//button[@id='submit' and @type='button']"));
        submit.click();
        Thread.sleep(2000);
        driver.quit();

    }
}
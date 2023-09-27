package class0;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class launchBrowser {
    public static void main(String[] args) throws InterruptedException {
//  declare the instance of WebDriver
        WebDriver driver = new ChromeDriver();

        // use the driver.get() method
        driver.get("https://www.google.com"); // driver.get ==> it navigates u to any url of ur choice

//  maximize ur window screen command:
        driver.manage().window().maximize();

//  get the url of the website:
//    driver.getCurrentUrl(); // so we write it in full as bellow before we execute it and save in a variable before we execute and print it:
   String currentUrl = driver.getCurrentUrl();
   System.out.println("the current Url is: "+currentUrl); // to print our searched Url

// get the title of a page
   String title = driver.getTitle();
   System.out.println("the title of the page is "+title);
// after printing, we can see "the title of the page is Google" printed on our console:

    Thread.sleep(2000); // this is to add 2 seconds wait for ur open window before it shuts down by the driver.quit(); command.
                                // NOTE: once ur code is done and final, YOU should get red off the Thread.sleep command for good practice !!!
// to close the browser
    driver.quit();

    }
}

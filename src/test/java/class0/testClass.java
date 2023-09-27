package class0;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class testClass {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com");
        System.out.println(driver.getTitle());

        // go to facebook.com
        driver.navigate().to("https://www.facebook.com"); //another way of getting any Url beside the first one that we had learned above ^ !
        // this command with navigate let us go back, forward or even refresh while the other does not!
        Thread.sleep(2000);
        // add a sleep for observation purposes


        // to go back Automatic
        driver.navigate().back();
        Thread.sleep(2000);

        // to move forward Automatic
        driver.navigate().forward();

        Thread.sleep(2000);
        // to refresh Automatic
        driver.navigate().refresh();

        // to close
        driver.close();

        // Note driver.quite closes everything, while driver.close only closes ur preferred window


    }
}

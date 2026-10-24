package newjavaproject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchGoogle {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();   // opens Chrome

        driver.manage().window().maximize();
        driver.get("https://www.google.com");    // opens Google

        System.out.println("Page title: " + driver.getTitle());

        driver.quit();                           // closes the browser
    }
}
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class OpenGoogle {
    public static void main(String[] args) {

        // Selenium 4.6+ downloads the matching ChromeDriver automatically
        WebDriver driver = new ChromeDriver();

        try {
            driver.manage().window().maximize();
            driver.get("https://www.google.com");

            System.out.println("Title: " + driver.getTitle());

            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

            // Search box (Google uses name="q")
            WebElement searchBox = wait.until(
                    ExpectedConditions.elementToBeClickable(By.xpath("//textarea[@name='q']")));
            searchBox.sendKeys("Selenium Java");
            searchBox.sendKeys(Keys.ENTER);

            // Wait for the results page
            wait.until(ExpectedConditions.titleContains("Selenium Java"));
            System.out.println("Results title: " + driver.getTitle());

        } finally {
            driver.quit();   // always close the browser
        }
    }
}
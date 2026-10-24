package newjavaproject;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Seleniumintro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		ChromeDriver driver = new ChromeDriver();
		driver.findElement(By.xpath("//button[(text(),'Login']")).click();
		
	}

}

package Actionclass;
Selenuium
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Action1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath("//button class=_2KpZ6l _2doB4z")).click();
		driver.findElement(By.xpath("//div[text()='Fashion']"));
		WebElement fashion = new 
        Actions a=new Actions(driver);
        a.moveToElement(Fashion);
        a.perform();
	}
}

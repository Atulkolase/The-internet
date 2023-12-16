package TestPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Add_Remove {
	
	public static void main (String[]args) {
		
		WebDriver driver = new ChromeDriver();

		driver.get("https://the-internet.herokuapp.com/");
		
		WebElement addremoveEle = driver.findElement(By.xpath("//a[text()='Add/Remove Elements']"));
		
		addremoveEle.click();
		
		WebElement addbutton = driver.findElement(By.xpath("//button[text()='Add Element']"));
		addbutton.click();
		
		WebElement deletbutton = driver.findElement(By.xpath("//button[text()='Delete']"));
		deletbutton.click();
		
		addbutton.click();
		
//		driver.navigate().back();
		
	}
}
	

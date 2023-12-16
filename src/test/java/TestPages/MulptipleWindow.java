package TestPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MulptipleWindow {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/windows");
		
	
		WebElement element = driver.findElement(By.xpath("//a[normalize-space()='Click Here']"));
		element.click();
		 
		String mainwindowHandle = driver.getWindowHandle();
		for (String windowHandle : driver.getWindowHandles()) {
			driver.switchTo().window(windowHandle);
		}
		
		driver.switchTo().window(mainwindowHandle);
		//driver.close();
		

	}

}

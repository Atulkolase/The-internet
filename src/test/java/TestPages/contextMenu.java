package TestPages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class contextMenu {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/context_menu");
		
		WebElement contextElement = driver.findElement(By.id("hot-spot"));
		
		Actions context = new Actions(driver);
		context.contextClick(contextElement).perform();
		
		Alert alt = driver.switchTo().alert();
		
		String popup = alt.getText();
		System.out.println("popup :" + popup);
		
		alt.accept();
		
		
		
	}

}

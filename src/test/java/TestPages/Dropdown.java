package TestPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/dropdown");
		
		WebElement element = driver.findElement(By.xpath("//select[@id='dropdown']"));
				element.click();
		
		Select dropdown = new Select(element);
		dropdown.selectByValue("2");

	}

}

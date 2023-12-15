package TestPages;

import java.util.HashMap;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class FileDnldNormalWay {

	public static void main(String[] args) {

		// by using HashMap and ChromeOptions you can achieve multiple files download 
		
		String downloadDirectory = "E:\\SharadSirSeleniumBatch\\BasicPrograms\\Downloads";
		// provide the appropriate directory to download files 
		HashMap<String, Object> chromePrefs = new HashMap<String, Object>();
		chromePrefs.put("profile.default_content_settings.popups", 0);
		chromePrefs.put("download.default_directory", downloadDirectory);

		ChromeOptions options = new ChromeOptions();
		options.setExperimentalOption("prefs", chromePrefs);

		WebDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("https://admin:admin@the-internet.herokuapp.com/");
		
		WebElement fileDnldEle = driver.findElement(By.xpath("//a[text()='File Download']"));
		fileDnldEle.click();

		List<WebElement> downloadLinks = driver.findElements(By.xpath("//div[@id='content']//div/child::a"));
		System.out.println(downloadLinks.size());
		 for (WebElement downloadLink : downloadLinks) {
		downloadLink.click();
		}
		 
		 driver.quit();
	}

}

package TestPages;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UploadFile {

	public static void main(String[] args) throws AWTException {
		
//		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver(); 
		
        driver.get("https://the-internet.herokuapp.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//a[text()='File Upload']")).click();
		
	//	By using send keys
//       driver.findElement(By.xpath("//input[@id='file-upload']")).sendKeys("C:\\Users\\Atul\\Downloads\\Git flow.txt");
        
		
    //  By using robot key
        WebElement button=driver.findElement(By.xpath("//input[@id='file-upload']"));
        
//        WebDriverWait wait = new WebDriverWait(driver, 30);
//        wait.until(ExpectedConditions.elementToBeClickable(button));
        
        JavascriptExecutor js=(JavascriptExecutor)driver;
        js.executeScript("arguments[0].click();", button); //perform click action on button
        
        Robot rb= new Robot();
        rb.delay(2000);
        
        StringSelection ss =new StringSelection("C:\\Users\\Atul\\Downloads\\Git flow.txt");
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
        
        //CTRL+V
        rb.keyPress(KeyEvent.VK_CONTROL); // Press on CTRL key
        rb.keyPress(KeyEvent.VK_V); // Press on CTRL key
        rb.delay(2000);
        
        rb.keyRelease(KeyEvent.VK_CONTROL);
        rb.keyRelease(KeyEvent.VK_V);
        rb.delay(2000);
        
        //ENTER
        rb.keyPress(KeyEvent.VK_ENTER);
        rb.keyRelease(KeyEvent.VK_ENTER);
	}
}

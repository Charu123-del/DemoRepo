package SeleniumPracticePopups;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPopup {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\selenium\\chromeDriver\\chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		
		 String baseUrl = "https://mail.rediff.com/cgi-bin/login.cgi";
		 driver.get(baseUrl);
		 
		 driver.findElement(By.name("proceed")).click();
		 
		 Alert alert = driver.switchTo().alert();
		 //alert.accept();
		 
		 String text=alert.getText();
		 System.out.println("Alert text is ::" +text);
		 
		 alert.accept();
		 
		// driver.close();
	}

}

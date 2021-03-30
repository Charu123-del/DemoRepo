package SeleniumPracticePopups;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FramePopup {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\selenium\\chromeDriver\\chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		
		 String baseUrl = "http://demo.guru99.com/payment-gateway/index.php";
		 driver.get(baseUrl);
		
		//  driver.switchTo().frame("//div[@class]//ul[@class]//li[@class='dropdown']//a[text()='Insurance Project']");
		 driver.findElement(By.xpath("//div[@class]//ul[@class]//li[@class='dropdown']//a[text()='Insurance Project']")).click();;
		 
		 WebDriver size = driver.switchTo().frame(0);

	}

}

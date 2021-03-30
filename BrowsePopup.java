package SeleniumPracticePopups;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowsePopup {

	public static void main(String[] args) {
		 System.setProperty("webdriver.chrome.driver","C:\\selenium\\chromeDriver\\chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		
		 String baseUrl = "https://html.com/input-type-file/";
		 driver.get(baseUrl);
		 
		 driver.findElement(By.name("fileupload")).sendKeys("D:/Techpacks/NPI/umts-huawei-utran-v100r015c10spc156--new/all273BlocksDatanFile.txt");
	}

}

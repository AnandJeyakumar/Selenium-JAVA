import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;

public class SeleniumIntoduction {

	public static void main(String[] args) throws InterruptedException {
		
		//Invoking Browser
//	chrome --ChromeDriver --->Methods()  ,safari,firefox
//		ChromeDriver driver = new ChromeDriver();
//		ChomeDriver.exe ---- > ChromeBrowser
//		System.setProperty("webDriver.chrome.driver", "C:\\Program Files\\Python311\\Scripts\\chrome.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		String title = driver.getTitle();
		Thread.sleep(3000);
		System.out.println(title);
		String currentURL = driver.getCurrentUrl();
		System.out.println(currentURL);
		driver.quit();
		
		
		

	}

}

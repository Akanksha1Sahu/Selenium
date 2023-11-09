import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildParentTraverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\rohit\\OneDrive\\Desktop\\Akanksha\\Selenium Downloads\\chromedriver_win32\\chromedriver.exe");
		// with selenium version above 4.6.0 system.setProperty is option, selenium guys have come up with selenium Manger (Beta Phase) and this code is in build 
		//handled . Chrome browser will envoke even without having set property code statement.

		WebDriver driver = new ChromeDriver();

		// Sibling - Child to parent traverse

		//header/div/button[1]/following-sibling::button[1]

		driver.get("https://rahulshettyacademy.com/AutomationPractice/");

		System.out.println(driver.findElement(By.xpath("//header/div/button[1]/following-sibling::button[1]")).getText());



		System.out.println(driver.findElement(By.xpath("//header/div/button[1]/parent::div/button[2]")).getText());


	}

}

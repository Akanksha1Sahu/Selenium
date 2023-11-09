import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PassengerDropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\rohit\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.findElement(By.id("divpaxinfo")).click();

		Thread.sleep(2000);
		// driver.findElement(By.id("hrefIncAdt")).click();

		// if i want to add 5 adults--then need to click 4 times--we can use while loop
		// or for loop

		/*
		 * int i=1; while(i<5) { driver.findElement(By.id("hrefIncAdt")).click(); i++; }
		 */

		/*
		 * can also use for loop for(i=1, i<5, i++) { }
		 */
		System.out.println(driver.findElement(By.id("divpaxinfo")).getText());

		for (int i = 1; i < 5; i++) {
			driver.findElement(By.id("hrefIncAdt")).click();
		}
		driver.findElement(By.id("btnclosepaxoption")).click();
		System.out.println(driver.findElement(By.id("divpaxinfo")).getText());

	}

}

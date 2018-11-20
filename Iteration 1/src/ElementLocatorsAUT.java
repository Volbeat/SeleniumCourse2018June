import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ElementLocatorsAUT {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// set the property and launch the Chrome browser
		// key is the webdriver, value is the path to the webdriver
		// go to where your Chromedriver application is stored, copy/paste the value as text
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\jcastle\\Downloads\\chromedriver_win32\\chromedriver.exe");

		//create an object for Chromedriver class
		WebDriver driver = new ChromeDriver();
		
		/* Wait
		 * Implicit wait - used to set the default waiting time throughout the program
		 * Explicit wait - used to set the waiting time for a particular instance only
		 */
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		//Navigate to URL
		driver.get("http://newtours.demoaut.com");
		
		//Wait
		WebDriverWait wait = new WebDriverWait(driver,10);
		
		//Maximize screen
		driver.manage().window().maximize();
		
		//Get Element by Name
		//Into the variable called userName, pass the value of the Element where name = userName
		WebElement userName = driver.findElement(By.name("userName"));
		userName.sendKeys("admin");
			System.out.println("entered username");
			
		//Get Element by name
		//Into the variable called password, pass the value of the Element where name = password
		WebElement password = driver.findElement(By.name("password"));
		password.sendKeys("password");
			System.out.println("entered password");
			
		//Get Element by className
			// TODO	
		
		//Get Element by id
			// TODO	
			
			//Into the variable called password, pass the value of the Element where name = password
			WebElement password = driver.findElement(By.name("password"));
			password.sendKeys("password");
				System.out.println("entered password");
	}

}

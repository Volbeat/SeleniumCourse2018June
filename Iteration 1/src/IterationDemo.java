import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IterationDemo 
{

	public static void main(String[] args) throws InterruptedException
	{
		// set the property and launch the Chrome browser
		// key is the webdriver, value is the path to the webdriver
		// go to where your Chromedriver application is stored, copy/paste the value as text
		System.setProperty("webdriver.chrome.driver","C:\\Users\\jcastle\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		//create an object for Chromedriver class
		WebDriver driver = new ChromeDriver();
		
		//Launch Chrome and Open Google
		driver.get("http://google.com");
		
		//maximize the browser window
		driver.manage().window().maximize();
		
		//wait for 3000 milli-seconds
		Thread.sleep(3000);
		
		//Verify the title and print it
		System.out.println(driver.getTitle());
		
		//close the window
		driver.close();
				
	}

}

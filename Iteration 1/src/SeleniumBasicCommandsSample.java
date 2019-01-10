
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;



	public class SeleniumBasicCommandsSample {

		public static void main(String[] args) {
			// DONE Auto-generated method stub
			// set the property and launch the Chrome browser
			// key is the webdriver, value is the path to the webdriver
			// go to where your Chromedriver application is stored, copy/paste the value as text
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\jcastle\\Downloads\\chromedriver_win32\\chromedriver.exe");

			//create an object for Chromedriver class
			WebDriver driver = new ChromeDriver();
			
			driver.manage().deleteAllCookies();
				
			/* Wait
			 * Implicit wait - used to set the default waiting time throughout the program
			 * Explicit wait - used to set the waiting time for a particular instance only
			 */
			//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			
			//Navigate to URL and print expected URL to console
			driver.get("http://newtours.demoaut.com");
			//System.out.println("Expected url: " + driver.get("http://newtours.demoaut.com"));

			//Get current URL and print it to console
			driver.getCurrentUrl();
			System.out.println("Current url: " + driver.getCurrentUrl());
			
			//Wait
			WebDriverWait wait = new WebDriverWait(driver,10);
			
			//Maximize screen
			driver.manage().window().maximize();
			
			//Get window size and print it to console
			driver.manage().window().getSize();
			System.out.println("Window size is: " + driver.manage().window().getSize());
			
			//Get Title (from browser tab) and compare to expected Title
			System.out.println("\rFirst way to test for correct title:");
			String expectedTitle = "Welcome: Mercury Tours";
			String actualTitle = "";
			actualTitle = driver.getTitle();
			System.out.println("Expected Title = " + expectedTitle);
			System.out.println("Actual Title   = " + actualTitle);
			
			
			System.out.println("A better way to test for correct title is if-else:");
			if (actualTitle.contentEquals(expectedTitle)) {
				System.out.println("Test Passed!");	
			}
			else {
				System.out.println("Test Failed!");
			}
			

			
			System.out.println("To make our script robust, we could add a Java Try/Catch block around our Title if-else:");
			
			try {
				if (actualTitle.contentEquals(expectedTitle)) {
					System.out.println("Test Passed!");	
				}
				else {
					System.out.println("Test Failed!");
				}
			} catch (Exception e) {
				e.printStackTrace();
			}

			
		//Find Element by XPath, relative path
		//Navigate to a different page and verify you are there testing to find content specific to that page
			driver.navigate().to("https://www.seleniumhq.org/");
			driver.findElement(By.xpath("//a[@title='Technical references and guides']")).click();
			WebElement LangPreferenceText = driver.findElement(By.xpath("//div[@id='codeLanguagePreference']/h4"));
			System.out.println("LangPreferenceText: "  + LangPreferenceText.getText());
			
		
		//Navigate from Selenium home page back to Selenium home page (code demo only, we are already on the home page)
		driver.navigate().back();
		WebElement whatIsSeleniumText = driver.findElement(By.xpath("//*[@id='mainContent']/h2[contains(.,'What')]"));
		System.out.println("whatIsSeleniumText: "  + whatIsSeleniumText.getText());
		
		//Also could write the code using text() in place of the dot
		WebElement whatIsSeleniumText2 = driver.findElement(By.xpath("//*[@id='mainContent']/h2[contains(text(),'What')]"));
		System.out.println("whatIsSeleniumText2: "  + whatIsSeleniumText2.getText());
		 
		//Also could find the second occurrence of an element in our main content h2, but this is not a preferred method
		WebElement whatIsSeleniumText3 = driver.findElement(By.xpath("//*[@id='mainContent']/h2[contains(.,'Selenium')][2]"));
		System.out.println("whatIsSeleniumText3: "  + whatIsSeleniumText3.getText());
		
		//Also could get different attributes of the text we are selecting by replacing getText() with a dot after getText in System.out
		WebElement whatIsSeleniumText4 = driver.findElement(By.xpath("//*[@id='mainContent']/h2[contains(.,'What')]"));
		System.out.println("whatIsSeleniumText4: "  + whatIsSeleniumText4.getText());

		
			
			/*
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

*/				
				//Into the variable called password, pass the value of the Element where name = password
				// TODO unresolved Duplicate local variable password
				//WebElement password = driver.findElement(By.name("password"));
				//password.sendKeys("password");
					//System.out.println("entered password");
				
				//close the active tab
				driver.close();
				
				// exit the program explicitly
				System.exit(0);

		}
	}

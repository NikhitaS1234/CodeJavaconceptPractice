import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//Invoking browser
		//Selenium guys have created drivers for different browsers like firefox, chrome 
		//and edge 
		//when you create object like following you will be able to use all the methods in 
		//chromedriver as well as personal methods of webdriver 
		//and also you will not be able to this code in any other browser
		
		//ChromeDriver driver= new ChromeDriver();
		
		//If you want to run the same code to run in all other browser then following way used
		//only methods for chromedriver implemented in the webdriver interface will be accessed
		System.setProperty("webdriver.chrome.driver", "C:/Users/Dell/eclipse/java-2022-12/chromedriver-win64/chromedriver.exe");
		
	     ChromeOptions options=new ChromeOptions();
		
	     options.addArguments("--remote-allow-origins=*");
		
		 WebDriver driver=new ChromeDriver(options);
	     driver.get("https://google.com");
	     System.out.println(driver.getCurrentUrl());
	     System.out.println(driver.getTitle());
	     driver.close();

	
	}

}

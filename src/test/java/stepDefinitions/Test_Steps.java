package stepDefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Test_Steps {
	
	public static WebDriver driver;
	
	
	
	
	 //driver= new ChromeDriver();
	
	
	//@SuppressWarnings("deprecation")
	@Given("User is on Home page")
	public void user_is_on_Home_page() throws Throwable {
		System.setProperty("webdriver.ie.driver", "D:\\IEDriverServer.exe");
		  //driver= new ChromeDriver();
		
		//driver= new FirefoxDriver();
		
		
		  /*DesiredCapabilities capability = new DesiredCapabilities();
		  capability.setCapability("binary","C:\\Program Files (x86)\\Google\\Chrome\\Application\\chrome.exe");
		  //"C:\Program Files (x86)\Google\Chrome\Application\chrome.exe" 
		  driver = new ChromeDriver(capability);*/
		 
															
		
		  driver= new InternetExplorerDriver();
		  
		  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		  
		  driver.get("http://newtours.demoaut.com/");
		  driver.manage().window().maximize();
		 
		System.out.println("user_is_on_Home_page");
	}

	@When("^user navigate to LogIn page$")
	public void user_navigate_to_LogIn_page()throws Throwable  {
		//driver.findElement (By.xpath("//a[text()='SIGN-ON']")).click();
		System.out.println("user_navigate_to_LogIn_page");
	}

	@When("^user enters username And password$")
	public void user_enters_username_And_password()throws Throwable  {
		/*
		 * driver.findElement(By.name("userName")).sendKeys("sardarberkal");
		 * driver.findElement(By.name("password")).sendKeys("Priya@1990");
		 * 
		 * driver.findElement(By.name("login")).click();
		 */
		System.out.println("user_enters_username_And_password");
	}

	@Then("^Message displayed Login Successfully$")
	public void message_displayed_Login_Successfully()throws Throwable  {
		System.out.println("Login Successfully");
	}

	@When("^User LogOut from the Application$")
	public void user_LogOut_from_the_Application() throws Throwable {
		//driver.findElement (By.xpath("//a[text()='SIGN-OFF']")).click();
		System.out.println("user_LogOut_from_the_Application");
	}

	@Then("^Message displayed LogOut Successfully$")
	public void message_displayed_LogOut_Successfully()throws Throwable {
		System.out.println("LogOut Successfully");
		
		//driver.quit();
	}


}

package cucumberTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SeleniumTest {
	
	public static WebDriver driver=null;

	public static void main(String[] args) {

		
		System.setProperty("webdriver.chrome.driver", "D:\\2\\chromedriver_win32\\chromedriver81.exe");
		driver= new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(10,  TimeUnit.SECONDS);
		
		driver.get("http://newtours.demoaut.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.name("userName")).sendKeys("sardarberkal"); 
		driver.findElement(By.name("password")).sendKeys("Priya@1990");
		
		driver.findElement(By.name("login")).click();
		
		System.out.println("Login Successfully");
		
		driver.findElement (By.xpath("//a[text()='SIGN-OFF']")).click();
		
		System.out.println("LogOut Successfully");
		
		driver.quit();

	}

}

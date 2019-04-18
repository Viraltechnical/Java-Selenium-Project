

package Selenium_Package;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium_Demo
{
	WebDriver driver = null;

	
	@Before
	public void setUp()
	{
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\SANJAY\\Desktop\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
	}

	
	@Test
	public void testCode()
	{
		driver.get("https://www.google.com");
		driver.findElement(By.className("gLFyf")).sendKeys("www.thenalanda.com");
		driver.findElement(By.name("btnK")).submit();
		driver.findElement(By.className("iUh30")).click();
	}

	@After
	public void close()
	{
		driver.close();
	}
	
	public static void main(String[] args) 
	{
		Selenium_Demo sd = new Selenium_Demo();
		sd.testCode();
	}
}

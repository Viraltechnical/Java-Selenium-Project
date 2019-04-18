
package Selenium_Package;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Basic
{
	
    public static void main(String[] args) 
    {
    	 System.setProperty("webdriver.chrome.driver","C:\\Users\\SANJAY\\Desktop\\chromedriver_win32\\chromedriver.exe");
    	 WebDriver driver=new ChromeDriver();
         driver.get("https://www.google.com");
         driver.get("https://www.thenalanda.com");
         
        driver.findElement(By.className("gLFyf")).sendKeys("www.thenalanda.com");
        driver.findElement(By.name("btnK")).submit();
        driver.findElement(By.className("iUh30")).click();

	}
}

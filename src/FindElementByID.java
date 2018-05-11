import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FindElementByID {
	
public static void main(String args[])
	
	
	{
		System.setProperty("webdriver.gecko.driver","geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("http://www.indeed.co.in");
		driver.findElement(By.id("what")).sendKeys("Selenium");
		driver.findElement(By.id("where")).sendKeys("Chennai");
		driver.findElement(By.id("fj")).click();
		
		
	}


}

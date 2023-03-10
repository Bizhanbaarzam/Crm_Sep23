package hmwrk;

import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HmWrk {
	
WebDriver driver;
	
    @Before
	public void init(ChromeDriver WebDriver) {
    	
    	System.setProperty("webdriver.Chrome.driver", null)
		driver = new ChromeDriver();
	    
		driver.manage().deleteAllCookies();
		driver.get("https://www.techfios.com/billing/?ng=admin");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		

	}
    
    
    @Test
    public void hmrk () {
    	
    	driver.findElement(By.xpath("//input[@id='username']")).sendKeys("demo@techfios.com");
//    	driver.findElement(By.xpath(null))
    	
    	
    	
    	
    	
    	
    }
    
    
    
    
    
    
    
    
    
}

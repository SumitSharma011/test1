package Package;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Mozilla {

	
	public void Firfox() throws AWTException, InterruptedException{
	
	
	
	System.setProperty("webdriver.gecko.driver", "C:\\Users\\Selenium_paths\\geckodriver.exe");
	WebDriver driver = new FirefoxDriver();
	driver.get("https://guest:guest@testing.xataka.com");   
		
	
	Robot a = new Robot();
      a.keyPress(KeyEvent.VK_ENTER);           
      Thread.sleep(5000); 
      driver.manage().window().maximize();	
      
     Thread.sleep(10000); 
     
     
     driver.findElement(By.xpath("/html/body/div[1]/div[2]/section/div/div[2]/ul/li[1]/a")).click();
     Thread.sleep(5000);  
     driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[2]/div/section[1]/div/nav[2]/ul/div/span/li/a")).click();
     
     Thread.sleep(5000); 
     driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[2]/div/nav[3]/div/div/p/a[1]")).click();
     Thread.sleep(5000); 
     driver.findElement(By.id("email")).sendKeys("agiletest111@gmail.com");
     driver.findElement(By.id("pass")).sendKeys("amita123");  
     
     driver.findElement(By.id("loginbutton")).click();
     Thread.sleep(10000); 
     
     driver.findElement(By.xpath("/html/body/div[1]/div[2]/section/div/div[2]/ul/li[1]/a")).click();
     Thread.sleep(10000);  
     driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[2]/div/section[1]/div/nav[2]/ul/div/span/li[3]/a")).click();
   	
     driver.quit();
}
}
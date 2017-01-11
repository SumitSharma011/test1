package Package;

import java.awt.AWTException;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import junit.framework.Assert;

public class JavaExecuter {
	public void google() throws AWTException, InterruptedException{
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Selenium_paths\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://guest:guest@testing.xataka.com");   
			
		
		/*Robot a = new Robot();
	      a.keyPress(KeyEvent.VK_ENTER);           
	      Thread.sleep(7000); */
	      driver.manage().window().maximize();	
	      
	     Thread.sleep(10000); 
	     
	    // driver.findElement(By.xpath(" //*[@id=cookies-overlay]/div/a")).click();
	     driver.findElement(By.xpath("/html/body/div[1]/div[2]/section/div/div[2]/ul/li[1]/a")).click();
	    
	  
	     
	     Thread.sleep(10000); 
	
	
	     
	     driver.findElement(By.id("openLogin")).click();
	     
	     Thread.sleep(5000); 
	     driver.findElement(By.id("facebook_login")).click();
	     Thread.sleep(5000); 
	     driver.findElement(By.id("email")).sendKeys("agiletest111@gmail.com");
	     driver.findElement(By.id("pass")).sendKeys("amita123");  
	     
	     driver.findElement(By.id("loginbutton")).click();
	     Thread.sleep(10000); 
	     
	     driver.findElement(By.xpath("/html/body/div[1]/div[2]/section/div/div[2]/ul/li[1]/a")).click();
	     Thread.sleep(10000);  
	   /*  robot.keyPress(KeyEvent.VK_PAGE_DOWN);
	     robot.keyRelease(KeyEvent.VK_PAGE_DOWN);
	     Thread.sleep(5000);*/
	     driver.findElement(By.id("logout")).click();
	   	
		driver.close();
	
	String a= driver.findElement(By.id("openLogin")).getText();
	String b="isha";
	Assert.assertEquals(b, a);
	
}}

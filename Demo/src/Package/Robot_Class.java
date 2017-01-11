package Package;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

public class Robot_Class {
	
	public void Robot_Name() throws AWTException, InterruptedException{
		Robot robot=new Robot();
			
		/* robot.keyPress(KeyEvent.VK_A);
		    robot.keyPress(KeyEvent.VK_B);
		  
		   robot.keyPress(KeyEvent.VK_C);*/
		robot.keyPress(KeyEvent.VK_TAB);
		robot.keyRelease(KeyEvent.VK_TAB);
		Thread.sleep(4000);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		
	}
	
}

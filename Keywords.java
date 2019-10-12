package com.zohocrm.testscript;


import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;



public class Keywords {
	//static ChromeDriver driver;
	static FirefoxDriver driver;
	
	static FileInputStream fis;
	static Properties prop;
	static Robot robot;
	static {
		try {
			fis=new FileInputStream("E:\\SeleniumWorkspace\\SeleniumProject\\src\\com\\zohocrm\\objectrepository\\objectrepository.properties");
		prop=new Properties();
		prop.load(fis);
		
		
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void openbrowser() {
		//driver=new ChromeDriver();
		driver=new FirefoxDriver();
		
	}
	public void navigate(String Testdata) {
		driver.get(Testdata);
	}
	public void waitstatement(double Testdata) throws InterruptedException {
		Thread.sleep((long) Testdata);
	}
	public void input(String Testdata,String objectName) {
		driver.findElement(By.xpath(prop.getProperty(objectName))).sendKeys(Testdata);
			}
	public void click(String objectName) {
		driver.findElement(By.xpath(prop.getProperty(objectName))).click();
			}
	public void type(String Testdata) {
	 try {
		robot=new Robot();
	} catch (AWTException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	 if(Testdata.equals("Mr.")) {
robot.keyPress(KeyEvent.VK_M);
robot.keyPress(KeyEvent.VK_R);
robot.keyPress(KeyEvent.VK_PERIOD);
robot.keyPress(KeyEvent.VK_ENTER);
	
	 }
	 if(Testdata.equals("Mrs.")) {
		 robot.keyPress(KeyEvent.VK_M);
		 robot.keyPress(KeyEvent.VK_R);
		 robot.keyPress(KeyEvent.VK_S);
		 robot.keyPress(KeyEvent.VK_PERIOD);
		 robot.keyPress(KeyEvent.VK_ENTER);
		 	
		 	 }
	 if(Testdata.equals("Ms.")) {
		 robot.keyPress(KeyEvent.VK_M);
		 robot.keyPress(KeyEvent.VK_S);
		 robot.keyPress(KeyEvent.VK_PERIOD);
		 robot.keyPress(KeyEvent.VK_ENTER);
		 	
		 	 }
	 if(Testdata.equals("Dr.")) {
		 robot.keyPress(KeyEvent.VK_D);
		 robot.keyPress(KeyEvent.VK_R);
		 robot.keyPress(KeyEvent.VK_PERIOD);
		 robot.keyPress(KeyEvent.VK_ENTER);
		 	
		 	 }
	 if(Testdata.equals("Prof.")) {
		 robot.keyPress(KeyEvent.VK_P);
		 robot.keyPress(KeyEvent.VK_R);
		 robot.keyPress(KeyEvent.VK_O);
		 robot.keyPress(KeyEvent.VK_F);
		 robot.keyPress(KeyEvent.VK_PERIOD);
		 robot.keyPress(KeyEvent.VK_ENTER);
		 	
		 	 }
			}

}

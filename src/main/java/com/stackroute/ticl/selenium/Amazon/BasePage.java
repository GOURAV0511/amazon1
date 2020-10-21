package com.stackroute.ticl.selenium.Amazon;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

//import org.openqa.selenium.By;
//import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BasePage {
public WebDriver driver;
    
	public void browserlaunch(String browser, String URL){
		if(browser.equalsIgnoreCase("Edge")){
			System.setProperty("webdriver.edge.driver", "F:\\SELENIUM1\\chromedriver.exe");
			driver=new EdgeDriver();
		}
		else if(browser.equalsIgnoreCase("chrome")){
			System.setProperty("webdriver.chrome.driver", "F:\\SELENIUM1\\chromedriver.exe");
			driver=new ChromeDriver();
		}
		else if(browser.equalsIgnoreCase("firefox")){
			System.setProperty("webdriver.gecko.driver", "F:\\SELENIUM1\\chromedriver.exe");
			driver= new FirefoxDriver();
		}
		driver.get(URL);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}
	
	public void switchToTab(int index) {
		  ArrayList<String> tabs=new ArrayList<String>(driver.getWindowHandles());
		  driver.switchTo().window(tabs.get(index));
		 }

}

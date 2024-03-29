package com.qa.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.qa.util.Testutil;

public class TestBase
{

	public static  WebDriver driver;
	public static  Properties prop;
	
	
	public TestBase()
	{
	
		
			prop=new Properties();
			
			FileInputStream fis;
			try {
				fis = new FileInputStream("C:\\Users\\Tiu User (Rakhi)\\eclipseMaven-workspace\\ProjectForPractice\\src\\main\\java\\com\\qa\\config\\config.properties");
			
				prop.load(fis);
			
			} catch (FileNotFoundException e) {
				
				e.printStackTrace();
			}
			
		
			 catch (IOException e) 
			{
				
				e.printStackTrace();
			}
			
	}
	public static void initialization() 
	{
		
		/*String browsername =prop.getProperty("browser");
		System.out.println("Browser Name: " + browsername);
		
		if(browsername.equals("chrome"))
		{
			
			System.setProperty("webdriver.chrome.driver", "H:\\Driver2024\\chromedriver.exe");
			driver = new ChromeDriver();
		}
		else if (browsername.equals("ff"))
		{
		System.out.println("Browser Name: " + browsername);
		System.setProperty("webdriver.gecko.driver", "H:\\Driver2024\\geckodriver.exe");
		driver=new FirefoxDriver();
		
		}
		*/
		System.setProperty("webdriver.chrome.driver", "H:\\Driver2024\\chromedriver.exe");
		driver=new ChromeDriver();
	
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(Testutil.pageTime, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(Testutil.implicitWait, TimeUnit.SECONDS);
		
		driver.get(prop.getProperty("url"));
		
		
		
	}
}


package launchApp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test0 {

	public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	//Enter the URL
	driver.get("https://www.amazon.com/");
	//get the title
	System.out.println(driver.getTitle());
	//get the url
	System.out.println(driver.getCurrentUrl());
	//close the application 
	driver.close();

	}

}

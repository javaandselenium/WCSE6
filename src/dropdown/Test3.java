package dropdown;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Test3 {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/QSP/Desktop/dd.html");
	    driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);

	    WebElement dd = driver.findElement(By.id("MTR"));
	 
	    Select s=new Select(dd);
	    s.selectByIndex(0);
	    s.selectByValue("c");
	    s.selectByVisibleText("Milk");
	    
	    System.out.println(s.isMultiple());
	    
	    if(s.isMultiple()) {
	    	s.deselectAll();
	    }
	    
	    driver.close();
	}
	
	

}

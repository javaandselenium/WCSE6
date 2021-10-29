package dropdown;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Test4 {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://facebook.com/");
	    driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);


	    driver.findElement(By.xpath("//a[text()='Create New Account']")).click();
	   WebElement dd = driver.findElement(By.id("month"));
	   
	   Select s=new Select(dd);
	   s.selectByValue("4");
	   s.selectByIndex(6);
	   s.selectByVisibleText("May");
	
	   List<WebElement> option = s.getOptions();
	   System.out.println(option.size());
	   
	   ArrayList a=new ArrayList<>();
	   
	   for(WebElement ele:option) {
		   String text = ele.getText();
		   System.out.println(text);
		   a.add(text);
	   }
	   
	    Collections.sort(a);
	    
	    System.out.println("***********after sorting***********");
	    
	    for(Object elements:a) {
	    	System.out.println(elements);
	    }
	    
	    driver.close();
	  
	}
}

package dropdown;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Test0 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.ebay.com/");
	    driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);

	   WebElement ele = driver.findElement(By.id("gh-cat"));
	   Select s=new Select(ele) ;
	   s.selectByIndex(4);
	   s.selectByValue("625");
	   s.selectByVisibleText("Health & Beauty");
	   
	   Thread.sleep(3000);
	   driver.close();
	   
	}

}

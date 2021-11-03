package popups;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FileUpload {
	public static void main(String[] args) throws IOException {
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.naukri.com/");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	WebElement ele = driver.findElement(By.xpath("//label[contains(text(),'Upload CV')]"));
	ele.sendKeys("C:\\Users\\QSP\\Desktop\\appiumInterview.docx");
	
	//Runtime.getRuntime().exec("C:\\Users\\QSP\\Desktop\\Autoit\\pp.exe");
		
	}

}

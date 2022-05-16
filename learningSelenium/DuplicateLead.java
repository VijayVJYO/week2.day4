package learningSelenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DuplicateLead {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    driver.get("http://leaftaps.com/opentaps/control/main");
	    driver.manage().window().maximize();
	      
	 driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
	 driver.findElement(By.id("password")).sendKeys("crmsfa");
	 driver.findElement(By.className("decorativeSubmit")).click();
	 driver.findElement(By.linkText("CRM/SFA")).click();
	 driver.findElement(By.linkText("Leads")).click();
	 driver.findElement(By.linkText("Find Leads")).click();
	 driver.findElement(By.linkText("Email")).click();
	 driver.findElement(By.name("emailAddress")).sendKeys("vj@gmail.com");
	 driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
	 driver.findElement(By.linkText("vj")).click();
	 driver.findElement(By.linkText("Duplicate Lead")).click();
	 driver.findElement(By.name("submitButton")).click();
	 driver.close();
	 
}
}
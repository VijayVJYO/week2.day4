package learningSelenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EditLead {
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
	 driver.findElement(By.xpath("(//input[@name='firstName'])[3]")).sendKeys("vj");
	 driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
	 driver.findElement(By.linkText("vj")).click();
	 driver.findElement(By.linkText("Edit")).click();
	 driver.findElement(By.id("updateLeadForm_companyName")).clear();
	 driver.findElement(By.id("updateLeadForm_companyName")).sendKeys("TESTLEAF");
	 driver.findElement(By.xpath("//input[@class='smallSubmit']")).click();
	 driver.close();
	 
	 

}
}

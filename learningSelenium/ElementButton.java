package learningSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ElementButton {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/Button.html");
		driver.manage().window().maximize();
		
		System.out.println(driver.findElement(By.id("color")).isDisplayed());
		
		driver.navigate().to("http://www.leafground.com/pages/Edit.html");
		System.out.println(driver.findElement(By.name("username")).isEnabled());
		
		driver.navigate().to("http://www.leafground.com/pages/checkbox.html");
		System.out.println(driver.findElement(By.xpath("//input[@type='checkbox']")).isSelected());
		
		
		driver.close();
		
	}


}

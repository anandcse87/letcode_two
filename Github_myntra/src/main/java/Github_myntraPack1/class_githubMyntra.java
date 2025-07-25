package Github_myntraPack1;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class class_githubMyntra {
	@Test
	public void simple_alert() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://letcode.in/alert");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		WebElement button=driver.findElement(By.id("accept"));
		button.click();
		Alert obj1=driver.switchTo().alert();
		String text=obj1.getText();
		System.out.println(text);
		Thread.sleep(2000);
		obj1.accept();
		//Thread.sleep(2000);
		//driver.manage().window().minimize();
		//System.out.println("Letcode executed sucessfully");
	}

}

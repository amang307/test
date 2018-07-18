package update;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.server.browserlaunchers.Sleeper;

public class main {
	public static void main(String[] args) throws IOException, InterruptedException {
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.naukri.com/nlogin/login");
		// driver.findElement(By.id("login_Layer")).click();
		driver.findElement(By.id("usernameField")).sendKeys("guptaaman307@gmail.com");
		driver.findElement(By.id("passwordField")).sendKeys("aman@307");
		driver.findElement(By.xpath(".//*[@id='loginForm']/div[5]/div/button")).click();
		Thread.sleep(5000);
		Actions act = new Actions(driver);
		//act.moveToElement(driver.findElement(By.xpath("//div[contains(text(),'My Naukri')]")));
	   //driver.findElement(By.xpath("html/body/div[5]/div[5]/div[2]/form/div[3]/div/button")).click();
		 driver.findElement(By.xpath("//a[text()='UPDATE PROFILE']")).click();
		      // driver.findElement(By.xpath(".//*[@id='lazyResumeHead']/div/div/div/div[1]/span[2]")).click();
		 Thread.sleep(5000);
		 driver.findElement(By.xpath(".//*[@id='lazyKeySkills']/div/div/div/div[1]/span[2]")).click();
		 Thread.sleep(5000);
		 driver.findElement(By.xpath(".//*[@id='saveKeySkills']")).click();
		 System.out.println("SUCESSFUL UPDATION");
		 act.build().perform();
	}
}

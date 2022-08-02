package mobileWorld;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class mobile1 {
	@Test

	public void launch() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Harshitha.A\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get(" https://mobileworld.azurewebsites.net/");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.findElement(By.xpath("//a[@href='signup.html']")).click();
		driver.findElement(By.xpath("//input[@placeholder='First Name']")).sendKeys("Harshitha");
		driver.findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys("A");
		driver.findElement(By.xpath("//input[@placeholder='Enter Email']")).sendKeys("harshi123@gmail.com");
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("harshi123");
	}

}

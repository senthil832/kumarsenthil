package org.power;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Samp {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\Eclipseworkspace\\SeleniumSamp\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.facebook.com");

		/*
		 * driver.findElement(By.id("identifierId")).sendKeys("snthlkumr26" +
		 * Keys.ENTER); driver.findElement(By.xpath("//span[text()='Next']")).click();
		 * driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS); WebElement
		 * txtpasswrd = driver.findElement(By.xpath("//input[@name='password']"));
		 * txtpasswrd.sendKeys("Bangaloredays@92");
		 */
		// driver.findElement(By.xpath("//span[text()='Create account']")).click();
				// WRONG
		// WebElement dropdown1=driver.findElement(By.id("yDmH0d"));
		// Select select=new Select(dropdown1);
		// select.selectByIndex(0);
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("9095797510" + Keys.ENTER);
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("senramco05"+ Keys.ENTER);

	}
}

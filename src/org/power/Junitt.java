package org.power;

import java.util.Date;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Junitt {
	public static WebDriver driver;

	@BeforeClass
	public static void beforeclass() {
		System.setProperty("webdriver.chrome.driver", "E:\\Eclipseworkspace\\SeleniumSamp\\Driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://www.facebook.com/");
	}

	@AfterClass
	public static void afterclass() {
		driver.quit();
	}

	@Test
	public void test1() {
		String Url = driver.getCurrentUrl();
		boolean b = Url.contains("facebook");
		Assert.assertTrue("verify url", b);
		WebElement txtuser = driver.findElement(By.id("email"));
		txtuser.sendKeys("senthil@gmail.com");
		Assert.assertEquals("verify username", "senthil@gmail.com", txtuser.getAttribute("value"));
	}

	@Test
	public void test2() {
		WebElement txtpass = driver.findElement(By.id("pass"));
		txtpass.sendKeys("1234567");
		Assert.assertEquals("verify password", "1234567", txtpass.getAttribute("value"));
	}

	@Before
	public void before() {
		Date d = new Date();
		System.out.println(d);
	}

	@After
	public void after() {
		Date d = new Date();
		System.out.println(d);
	}

}

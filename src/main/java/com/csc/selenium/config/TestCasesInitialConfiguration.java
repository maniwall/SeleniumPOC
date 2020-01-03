package com.csc.selenium.config;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.aventstack.extentreports.ExtentReports;

public class TestCasesInitialConfiguration {

	static {

		String sourcePath = System.getProperty("user.dir");

		System.setProperty("webdriver.chrome.driver",
				sourcePath + "/src/main/resources/Drivers/ChromeDriver/chromedriver.exe");
	}

	public static void loginSetup(WebDriver driver) {

		driver.get("https://qclinksmpv.qa.motive.com/csc/");
		driver.findElement(By.id("j_username")).sendKeys("cvfnz_manikanta");
		driver.findElement(By.id("j_password")).sendKeys("Manikanta@123");

		driver.findElement(By.xpath("//span[text()='Log On']")).click();
		driver.findElement(By.id("subscriberid")).sendKeys("3033370006");
		driver.findElement(By.id("rxSessionId")).sendKeys("33303894");

		driver.findElement(By.xpath("//span[text()='Create Session']")).click();
	}

	public static void tearDown(ExtentReports extent, WebDriver driver) {

		extent.flush();
		driver.close();
		driver.quit();
	}

	public static WebDriver fetchDriver() {

		return new ChromeDriver();
	}

}

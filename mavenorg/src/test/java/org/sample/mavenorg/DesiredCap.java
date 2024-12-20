package org.sample.mavenorg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DesiredCap {
	@Test 
	public void OpenBrowser() {
		WebDriverManager.chromiumdriver().setup();
		DesiredCapabilities caps = new DesiredCapabilities();
		caps.acceptInsecureCerts();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("start-maximized");
		options.addArguments("disable-infobars");
		options.merge(caps);
		WebDriver driver = new ChromeDriver(options);
		
		//Code for Select Class
		
		WebElement test1 = driver.findElement(By.xpath(""));
		Select sel = new Select(test1);
		sel.selectByIndex(0);
		
		
		//Code for Actions Class
		
		WebElement test = driver.findElement(By.xpath(""));
		Actions builder = new Actions(driver);
		Action moveOverHome = builder.moveToElement(test).build();
		moveOverHome.perform();
		
		
		driver.get("https://google.com");
		driver.quit();
	}

}

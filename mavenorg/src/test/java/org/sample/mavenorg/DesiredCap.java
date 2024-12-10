package org.sample.mavenorg;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DesiredCap {
	@Test 
	public void OpenBrowser() {
		WebDriverManager.chromiumdriver().setup();
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://google.com");
	}

}

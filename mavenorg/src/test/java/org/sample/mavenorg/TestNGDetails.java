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
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Optional;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.beust.jcommander.Parameter;

import io.github.bonigarcia.wdm.WebDriverManager;
import junit.framework.Assert;

@Listeners(org.sample.mavenorg.ListenerTest.class)
public class TestNGDetails {
	
	@BeforeClass
	public void beforeClass() {
		System.out.println("Before Class Method");
	}
	@AfterClass
	public void afterClass() {
		System.out.println("After Class Method");
	}
	
	@BeforeMethod
	public void beforGroup() {
		System.out.println("Before Method");
	}
	
	@Test (description = "Method for opening browser")
	public void openBrowser() {
		SoftAssert sft = new SoftAssert();
		sft.assertFalse(true);
		sft.assertAll();
	System.out.println("Open Browser");
	}
	
	@Test (dependsOnMethods = {"openBrowser"})
	public void launchDriver(@Optional() String method) {
	//System.out.println("Launch Driver");
		Assert.assertFalse(false);
		
	}
	
	@AfterMethod
	public void afterMethod() {
		System.out.println("-- After Method --");
	}
	
	//Testing the code for pushing 

}

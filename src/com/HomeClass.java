package com;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class HomeClass {
	@Test
	public void test(){
		WebDriver driver=new FirefoxDriver();
		driver.get("http://www.baidu.com");
	}
}

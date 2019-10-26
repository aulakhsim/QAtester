package com.id.JuneWebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstWebDriver {
public static void main(String[] args) {
	
	System.setProperty("webdriver.chrome.driver","C:\\Users\\aulak\\Desktop\\chromedriver_win32 (6)\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	
	driver.get("www.yahoo.com");
	driver.manage().window().maximize();
}

}

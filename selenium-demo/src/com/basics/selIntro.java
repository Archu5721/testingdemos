package com.basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class selIntro {
	
	private static String url="http://localhost:4200/";
	public static void main(String[] args) {
		
		
		
		WebDriver webdriver = null;
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Rajini\\Downloads\\chromedriver_win32\\chromedriver.exe");
		webdriver = new ChromeDriver();
		
//		AddproductToShoppingCart(webdriver,"ecomm","Leash","1");
		
		ShowErrorMessage(webdriver,"tforms","Anthony","Anth");
		
		
		System.out.println(webdriver.getTitle());
		System.out.println(webdriver.getCurrentUrl());
//		webdriver.quit();
		}

	private static void ShowErrorMessage(WebDriver webdriver, String route, String username, String email) {
		webdriver.get(url + route);
		webdriver.findElement(By.name("username")).sendKeys(username);
		webdriver.findElement(By.name("email")).sendKeys(email);
		webdriver.findElement(By.id("forms")).click();
		System.out.println(webdriver.findElement(By.id("val_error")).getText());
		
		

	}

	private static void AddproductToShoppingCart(WebDriver webdriver, String route, String productName, String quantity) {
		webdriver.get(url + route);
		webdriver.findElement(By.name("productName")).sendKeys(productName);
		webdriver.findElement(By.name("quantity")).sendKeys(quantity);
		webdriver.findElement(By.name("addproduct")).click();

	}
}

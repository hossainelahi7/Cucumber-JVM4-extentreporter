package bdd.Page;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import webDriver.Util.Driver;

public class HomePage {
	Driver driver;
	
	public HomePage(Driver driver){
        this.driver = driver;
	}
	
	public WebElement seachBOx(){
		return driver.findElement(By.cssSelector("input[name='q']"));
	}
	
	public WebElement canvas(){
		return driver.findElement(By.cssSelector("canvas[id='hpcanvas']"));
	}
	
	public List<WebElement> searchSuggestions(){
		return driver.findElements(By.cssSelector("li[role='presentation']"));
	}
}

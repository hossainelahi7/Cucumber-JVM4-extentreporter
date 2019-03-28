package bdd.Page;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class GoogleHomePage extends Page{
	private String url = "https://www.google.com/";
	
	public GoogleHomePage(){
        super();
	}
	
	public void gotoPage(){
		driver.get(url);
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

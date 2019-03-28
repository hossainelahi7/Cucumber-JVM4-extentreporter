package bdd.Page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class CucumberHomePage extends Page{
	private String url = "https://docs.cucumber.io/";
	
	public CucumberHomePage(){
		super();
	}
	
	public void gotoPage(){
		driver.get(url);
	}

	public WebElement getIcon(){
		return driver.findElement(By.tagName("img"));
	}

}

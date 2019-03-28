package bdd.Page;

import runner.util.TestContext;
import webDriver.Util.Driver;

public class Page {
	public Driver driver;
	
	public Page(){
		this.driver = TestContext.getContext(Thread.currentThread().getId()).getDriver();
	}

}

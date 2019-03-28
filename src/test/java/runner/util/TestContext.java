package runner.util;

import java.util.HashMap;

import webDriver.Util.Driver;

public class TestContext {
	
	public static HashMap<Long, TestContext> ContextMap = new HashMap<Long, TestContext>();
	
	public static void setDriver(Long threadNumber, TestContext context){
		ContextMap.put(threadNumber, context);
	}
	
	public static TestContext getContext(Long threadNumber){
		return ContextMap.get(threadNumber);
	}
	 public static void removeContext(Long threadNumber){
		 ContextMap.remove(threadNumber);
	 }
	
	
	//Can add all the test context that need to share throughout the test scenario
	private Driver driver;
	private String Scenario;
	
	public TestContext(Driver driver, String Scenario){
		this.driver = driver;
		this.Scenario = Scenario;
	}
	
	public Driver getDriver(){
		return driver;
	}
	
	public String getScenario(){
		return Scenario;
	}

}

package main;

import java.util.Optional;
import java.util.concurrent.TimeUnit;

import org.testng.annotations.Test;
import main.PropertyManager;


public class geturl {
	
	
	public static String getURL() {
		  return Optional.ofNullable(System.getProperty("url")).orElse(PropertyManager.getInstance().getURL());
		}

}


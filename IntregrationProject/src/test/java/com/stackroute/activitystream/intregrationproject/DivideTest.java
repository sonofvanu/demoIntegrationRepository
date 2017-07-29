package com.stackroute.activitystream.intregrationproject;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

public class DivideTest {

	private static App app;
	
	@BeforeClass
	public static void callingMain() {
		app=new App();
	}
	
	@Test
	public void divideTest()
	{
		assertEquals(2,app.divide(12,6));
	}
	
	
	

}

package com.nagarro.codecoveragedemo.testcontrollers;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import com.nagarro.codecoveragedemo.controller.HomeController;

public class TestControllers {

	@Test
	@DisplayName("Test Hello name !!")
	public void testMessageMethod() {
		
		HomeController msgObj = new HomeController();
		Assertions.assertEquals("Hello Kanha!", msgObj.getMessage("Kanha"));
	}
	
	@Test
	@DisplayName("Test for the get Homepage message")
	public void testHomeMessageMethod() {
		
		HomeController msgObj = new HomeController();
		Assertions.assertEquals("Welcome to the Homepage", msgObj.getHome());
	}
	
   @Test
   @DisplayName("Testing the hello message page")
   public void testNoValueInMessageMethod() {
	   
	   HomeController myObj = new HomeController();
	   Assertions.assertEquals("Please provide a name !", myObj.getMessage(null));
   }
}

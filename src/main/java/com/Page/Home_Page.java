package com.Page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.Test.SuperClass;


public class Home_Page extends SuperClass {

	public By Drag = By.id("menu-item-140");
	
	public WebElement Draggable(WebDriver driver){
		return driver.findElement(Drag);
		}
}

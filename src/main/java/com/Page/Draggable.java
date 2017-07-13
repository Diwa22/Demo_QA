package com.Page;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Draggable {

	public By Drag_Obj = By.id("draggable");
	public By Const_movement = By.id("ui-id-2");
	public By Vertical = By.id("draggabl");
	public By Event = By.id("ui-id-4");
	public By Event_obj = By.id("dragevent");
	public By Count = By.className("count");
	
	public WebElement Draggable_Obj(WebDriver driver){
		return driver.findElement(Drag_Obj);
		}
	
	public WebElement Constrain_movement(WebDriver driver){
		return driver.findElement(Const_movement);
		}
	
	public WebElement Vertically(WebDriver driver){
		return driver.findElement(Vertical);
		}
	public WebElement Events(WebDriver driver){
		return driver.findElement(Event);
		}
	public WebElement Events_Obj(WebDriver driver){
		return driver.findElement(Event_obj);
		}
	
	public List<WebElement> counts(WebDriver driver){
		return driver.findElements(Count);
		}
	
	
}

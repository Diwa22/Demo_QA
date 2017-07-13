package com.Test;

import java.io.File;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import com.Page.Draggable;
import com.Page.Home_Page;

import junit.framework.Assert;


public class Demo_QA extends SuperClass{

	Home_Page HP = new Home_Page();
	Draggable Drag = new Draggable();
	
	@Test
	public void Drag() throws InterruptedException
	{
		HP.Draggable(driver).click();
		Thread.sleep(5000);
		Actions act = new Actions(driver);
		act.dragAndDropBy(Drag.Draggable_Obj(driver), 33, 44).perform();

	}

	@Test
	public void Vertically() throws InterruptedException
	{
		HP.Draggable(driver).click();
		Drag.Constrain_movement(driver).click();
		Thread.sleep(5000);
		Point point = Drag.Constrain_movement(driver).getLocation();
		int ycord = point.getY();
		System.out.println(ycord);
		Actions act = new Actions(driver);
		act.dragAndDropBy(Drag.Vertically(driver), 126, 300).perform();

		int ycord_New = point.getY();
		System.out.println(ycord_New);
		Assert.assertEquals(ycord, ycord_New);
	}

	@Test
	public void Horizontally() throws InterruptedException
	{
		HP.Draggable(driver).click();
		Drag.Constrain_movement(driver).click();
		Thread.sleep(5000);
		Point point = Drag.Constrain_movement(driver).getLocation();
		int xcord = point.getX();
		System.out.println(xcord);
		Actions act = new Actions(driver);
		act.dragAndDropBy(Drag.Vertically(driver), 126, 300).perform();
		int xcord_New = point.getX();
		System.out.println(xcord_New);
		Assert.assertEquals(xcord, xcord_New);
	}
	
	@Test
	public void Events() throws InterruptedException
	{
		int i;
		HP.Draggable(driver).click();
		Drag.Events(driver).click();
		Actions act = new Actions(driver);
		WebElement TxtBoxContent = Drag.counts(driver).get(0);
		System.out.println(TxtBoxContent.getText());
		String s= TxtBoxContent.getText();
		int result = Integer.parseInt(s);
		
		for(i=result; i<10; i++)
		{
		act.dragAndDropBy(Drag.Events_Obj(driver), 250, 300).perform();
		}
		
	}
	
	
	
}

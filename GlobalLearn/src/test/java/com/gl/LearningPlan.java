package com.gl;

import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

import com.glbase.BaseClass;

public class LearningPlan extends BaseClass{
       
	@Test
	public static void t1() throws IOException, InterruptedException {
		//launch the browser
		browserLaunch("https://lms-stg-globallearn2.trialinteractive.com/");
		//maximize the browser
		maximize();
		//wait for all script
		time();
		
	    //Enter the login credentials
		GLHomePage t = new GLHomePage();
		inputText(t.getUser(), stringData(10, 0));
		buttonClick(t.getLoginUser());
		
		inputText(t.getPass(), stringData(10, 1));
		buttonClick(t.getLogin());
		insleep();
		
		GLDashboardPage d = new GLDashboardPage();
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView(true)", d.getCD());
		try {
			waitUntilElementVisible(driver, d.getCD());
		    buttonClick(d.getCD());
		}catch(Exception e) {

		}
		
		lowsleep();
		buttonClick(d.getLearn());
		buttonClick(d.getCreateLearn());
		inputText(d.getFullname(), "eSign");
		inputText(d.getShortname(), "111");
		
		dropDownText(d.getStatus(), "Active");
		lowsleep();
		try {
		buttonClick(d.getIcon());}
		catch(Exception e) {}
		
		inputText(d.getId(), "3333");
		inputText(d.getArea(), "site");
		inputText(d.getCredits(), "1");
		inputText(d.getCode(), "12345");
		lowsleep();
		js.executeScript("arguments[0].scrollIntoView(true)", d.getDue());
		buttonClick(d.getDue());
		lowsleep();
		buttonClick(d.getPic());

		buttonClick(d.getSave());
		insleep();
		takeScreenShot();
		
		System.out.print("The Manage Learning plan was created successfully");
		
	}
}

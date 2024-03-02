package com.gl;

import java.awt.AWTException;
import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

import com.glbase.BaseClass;

public class Transcript extends BaseClass{
	@Test
	public void test() throws IOException, InterruptedException, AWTException {
		//launch the browser
		browserLaunch("https://lms-stg-globallearn2.trialinteractive.com/");
		//maximize the browser
		maximize();
		//wait for all script
		time();
		
	    //Enter the login credentials
		GLHomePage t = new GLHomePage();
		inputText(t.getUser(), stringData(3, 0));
		buttonClick(t.getLoginUser());
		
		inputText(t.getPass(), stringData(3, 1));
		buttonClick(t.getLogin());
		insleep();
		
		GLDashboardPage d = new GLDashboardPage();
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView(true)", d.getTranscript());
		try {
		
//		waitUntilElementVisible(driver, d.getTranscript());
		buttonClick(d.getTranscript());
		}
		catch(Exception e) {
//			waitUntilElementVisible(driver, d.getTranscript());
			buttonClick(d.getTranscript());
		}
		js.executeScript("arguments[0].scrollIntoView(true)", d.getMDR());
		insleep();
		try {
			
			waitUntilElementVisible(driver,  d.getMDR());
			buttonClick( d.getMDR());
			}
			catch(Exception e) {
				waitUntilElementVisible(driver,  d.getMDR());
				buttonClick( d.getMDR());
			}
		
	}
}

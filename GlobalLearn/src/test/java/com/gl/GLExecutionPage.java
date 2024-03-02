package com.gl;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import com.glbase.BaseClass;

public class GLExecutionPage extends BaseClass {
	@Test
	public void test1() throws IOException, InterruptedException, AWTException {
		// launch the browser
		browserLaunch("https://lms-stg-globallearn2.trialinteractive.com/");
		// maximize the browser
		maximize();
		// wait for all script
		time();

		// Enter the login credentials
		GLHomePage t = new GLHomePage();
		inputText(t.getUser(), stringData(10, 0));
		buttonClick(t.getLoginUser());

		inputText(t.getPass(), stringData(10, 1));
		buttonClick(t.getLogin());
		insleep();

		GLDashboardPage d = new GLDashboardPage();

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true)", d.getCD());
		try {

			waitUntilElementVisible(driver, d.getCD());
			buttonClick(d.getCD());
		} catch (Exception e) {
			waitUntilElementVisible(driver, d.getCD());
			buttonClick(d.getCD());
		}

		GLContentLibraryPage c = new GLContentLibraryPage();

		buttonClick(c.getCL());
		insleep();
		buttonClick(c.getClUpload());
		lowsleep();
		buttonClick(c.getButton());
		lowsleep();

		Robot r = new Robot();
		r.delay(2000);

		// Copy the path
		StringSelection s = new StringSelection("C:\\Users\\santhiya.palanisamy\\Downloads\\Text file.txt");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(s, null);

		// paste the path
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_V);

		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_V);
		// Enter the path
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);

		r.delay(2000);
		
		buttonClick(c.getClose());
		insleep();
        
		buttonClick(c.getBox());
		buttonClick(c.getDown());
		buttonClick(c.getCreate());
		buttonClick(c.getCourse());
		buttonClick(c.getNext());
		inputText(c.getFname(), "content2");
		inputText(c.getShortname(), "cl2");
		buttonClick(c.getCat());
		dropDownText(c.getType(), "Standard");
		buttonClick(c.getDue());
		buttonClick(c.geteSignBox());
		dropDownText(c.getOption(), "Show in Catalog");
		
		js.executeScript("arguments[0].scrollIntoView(true)", c.getCertificate());
		dropDownText(c.getCertificate(), "Yes");
		js.executeScript("arguments[0].scrollIntoView(true)", c.getSave());
		buttonClick(c.getSave());
		lowsleep();
		takeScreenShot();
		r.delay(3000);
		buttonClick(c.getClose());
		buttonClick(c.getBox());
		buttonClick(c.getDown());
		buttonClick(c.getTags());
		inputText(c.getAddTag(), "R&A");
		buttonClick(c.getSubmit());
		
		buttonClick(c.getClose());
	}

}

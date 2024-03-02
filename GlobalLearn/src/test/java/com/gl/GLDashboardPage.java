package com.gl;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.glbase.BaseClass;

public class GLDashboardPage extends BaseClass{
	public GLDashboardPage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//*[text()='Company Dashboard']")
	private WebElement CD;
	
	@FindBy(xpath="//*[@class='tree_item branch']")
	private WebElement transcript;
	
	@FindBy(xpath="//*[@class='tree_item hasicon active_tree_node']")
	private WebElement mDR;
	
	@FindBy(xpath="//*[text()='Manage Learning Plans']")
	private WebElement learn;
	
	@FindBy(xpath="//*[@id='createNewLearningPlan']")
	private WebElement createLearn;
	
	@FindBy(xpath="//*[@id='fullname']")
	private WebElement fullname;
	
	@FindBy(xpath="//*[@id='shortname']")
	private WebElement shortname;
	
	@FindBy(xpath="//*[@id='status']")
	private WebElement status;
	
	@FindBy(xpath="//*[@class='slider round']")
	private WebElement icon;
	
	@FindBy(xpath="//*[@id='idnumber']")
	private WebElement id;
	
	@FindBy(xpath="//*[@id='trainingarea']")
	private WebElement area;
	
	@FindBy(xpath="//*[@id='credits']")
	private WebElement credits;
	
	@FindBy(xpath="//*[@id='lpcode']")
	private WebElement code;
	
	@FindBy(xpath="//*[@id='duecondition_1']")
	private WebElement due;
	
	@FindBy(xpath="(//*[@id='lp-library-pic'])[6]")
	private WebElement pic;
	
	@FindBy(xpath="//*[@type='submit']")
	private WebElement save;
	
	
	public WebElement getTranscript() {
		return transcript;
	}
	public WebElement getMDR() {
		return mDR;
	}
	
	public WebElement getCD() {
		return CD;
	}
	
	public WebElement getLearn() {
		return learn;
	}
	
	public WebElement getCreateLearn() {
		return createLearn;
	}

	public WebElement getFullname() {
		return fullname;
	}

	public WebElement getShortname() {
		return shortname;
	}

	public WebElement getStatus() {
		return status;
	}

	public WebElement getIcon() {
		return icon;
	}

	public WebElement getId() {
		return id;
	}

	public WebElement getArea() {
		return area;
	}

	public WebElement getCredits() {
		return credits;
	}

	public WebElement getCode() {
		return code;
	}

	public WebElement getDue() {
		return due;
	}

	public WebElement getPic() {
		return pic;
	}

	public WebElement getSave() {
		return save;
	}
	

}

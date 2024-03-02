package com.gl;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.glbase.BaseClass;

public class GLContentLibraryPage extends BaseClass {
	public GLContentLibraryPage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//div[h3='Content Library']")
	private WebElement CL;

	@FindBy(xpath = "//div[@class='content_library_local_upload']")
	private WebElement cLUpload;

	@FindBy(xpath = "//input[@type='button']")
	private WebElement button;

	@FindBy(xpath = "//*[@type='button']")
	private WebElement close;

	@FindBy(xpath = "(//*[@type='checkbox'])[2]")
	private WebElement box;

	@FindBy(xpath = "//*[@class='fa fa-angle-down']")
	private WebElement down;

	@FindBy(xpath = "//*[@id='createsinglecourse']")
	private WebElement create;
	
	@FindBy(xpath = "//*[text()='Manage Tags']")
	private WebElement tags;
	
	@FindBy(xpath = "//*[@id='newtagname']")
	private WebElement addTag;
	
	@FindBy(xpath = "//*[text()='Save']")
	private WebElement submit;
	
	@FindBy(xpath = "//*[text()='Read & Acknowledge']")
	private WebElement course;

	@FindBy(xpath = "//*[@id='createcourse']")
	private WebElement next;

	@FindBy(xpath = "//*[@id='fullname']")
	private WebElement fname;

	@FindBy(xpath = "//*[@id='shortname']")
	private WebElement shortname;

	@FindBy(xpath = "//*[text()='Z-catalog']")
	private WebElement cat;

	@FindBy(xpath = "//*[@id='id_ctypes']")
	private WebElement type;

	@FindBy(xpath = "//*[@id='duecondition_1']")
	private WebElement due;

	@FindBy(xpath = "//*[@name='maxdays']")
	private WebElement max;

	@FindBy(xpath="(//select[@class='form-control column'])[2]")
    private WebElement certificate;
	
	@FindBy(xpath="//*[@class='esignature-checkmark']")
	private WebElement eSignBox;
	
	@FindBy(xpath="//*[@id='id_catalogoptions']")
	private WebElement option;
	
	@FindBy(xpath="//*[@type='submit']")
	private WebElement save;
	
	
	

	public WebElement getCL() {
		return CL;
	}

	public WebElement getClUpload() {
		return cLUpload;
	}

	public WebElement getButton() {
		return button;
	}

	public WebElement getClose() {
		return close;
	}

	public WebElement getcLUpload() {
		return cLUpload;
	}

	public WebElement getBox() {
		return box;
	}

	public WebElement getDown() {
		return down;
	}

	public WebElement getCreate() {
		return create;
	}

	public WebElement getTags() {
		return tags;
	}

	public WebElement getAddTag() {
		return addTag;
	}

	public WebElement getSubmit() {
		return submit;
	}

	public WebElement getCourse() {
		return course;
	}

	public WebElement getNext() {
		return next;
	}

	public WebElement getFname() {
		return fname;
	}

	public WebElement getShortname() {
		return shortname;
	}

	public WebElement getCat() {
		return cat;
	}

	public WebElement getType() {
		return type;
	}

	public WebElement getDue() {
		return due;
	}

	public WebElement getMax() {
		return max;
	}
	public WebElement getCertificate() {
		return certificate;
	}

	public WebElement geteSignBox() {
		return eSignBox;
	}

	public WebElement getOption() {
		return option;
	}

	public WebElement getSave() {
		return save;
	}

	
}

package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import wdMethods.ProjectMethods;

public class FindLeads extends ProjectMethods{

	public FindLeads() {		
		PageFactory.initElements(driver,this);
	}	

	@FindBy(how=How.XPATH,using="//label[text()='Lead ID:']/../div/input")
	private WebElement eleTypeLeadId;

	public FindLeads TypeLeadID(String LeadId) {
		type(eleTypeLeadId, LeadId);
		return this;		
	}

	@FindBy(how=How.XPATH,using="//button[text()='Find Leads']")

	private WebElement eleClickFindLeads;

	public FindLeads clickFindLeads() {
		click(eleClickFindLeads);
		return this;

	}

	@FindBy(how=How.LINK_TEXT,using="10022")

	private WebElement eleClickLead;

	public ViewLead clickLead() {
		click(eleClickLead);
		return new ViewLead();

	}



}

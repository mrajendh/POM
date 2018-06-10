package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.en.And;
import wdMethods.ProjectMethods;

public class MyLeads extends ProjectMethods{

	public MyLeads() {		
		PageFactory.initElements(driver,this);
	}	

	@FindBy(how=How.LINK_TEXT,using="Create Lead")
	private WebElement eleclickCreateLead;
	@And("Click CreateLead Tab")
	public createlead clickCreateLead() {
		//WebElement eleLogin = locateElement("class","decorativeSubmit");
		click(eleclickCreateLead);
		return new createlead();		
	}

	@FindBy(how=How.LINK_TEXT,using="Find Leads")
	private WebElement eleclickFindLead;

	public FindLeads clickFindLead() {
		click(eleclickFindLead);
		return new FindLeads();		
	}

	@FindBy(how=How.LINK_TEXT,using="Merge Leads")
	private WebElement eleclickMergeLead;

	public MyLeads clickMergeLead() {
		click(eleclickMergeLead);
		return this;		
	}


}

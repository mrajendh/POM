package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import wdMethods.ProjectMethods;

public class myhome extends ProjectMethods{
	
	public myhome() {		
		PageFactory.initElements(driver,this);
	}	
	
	@FindBy(how=How.LINK_TEXT,using="Leads")
	private WebElement eleclickleads;
	
	public MyLeads clickLeads() {
		//WebElement eleLogin = locateElement("class","decorativeSubmit");
		click(eleclickleads);
		return new MyLeads();	
	}
	
	
	
}

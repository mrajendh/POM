package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.en.And;
import wdMethods.ProjectMethods;

public class createlead extends ProjectMethods{

	public createlead() {		
		PageFactory.initElements(driver,this);
	}	

	@FindBy(how=How.ID,using="createLeadForm_firstName")
	private WebElement eleTypeFirstname;
	@And("Capture FirstName1 as (.*)")
	public createlead typeFirstName(String FirstName) {
		type(eleTypeFirstname, FirstName);
		return this;		
	}
	@FindBy(how=How.ID,using="createLeadForm_lastName")
	private WebElement eleTypelastname;
	@And("Capture LastName1 as (.*)")
	public createlead typeLastName(String LastName) {
		type(eleTypelastname, LastName);
		return this;		
	}
	@FindBy(how=How.ID,using="createLeadForm_companyName")
	private WebElement eleTypeCompanyName;
	@And("Capture CompanyName1 as(.*)")
	public createlead typeCompanyName(String CompayName) {
		type(eleTypeCompanyName, CompayName);
		return this;		
	}
	@FindBy(how=How.CLASS_NAME,using="smallSubmit")
	private WebElement eleSubmitCreateLead;
	@And("Click CreateLead1")
	public ViewLead submitCreateLead() {
		click(eleSubmitCreateLead);
		return new ViewLead();
	}
}

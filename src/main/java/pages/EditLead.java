package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import wdMethods.ProjectMethods;

public class EditLead extends ProjectMethods{

	public EditLead() {		
		PageFactory.initElements(driver,this);
	}	
	
	@FindBy(how=How.ID,using="updateLeadForm_firstName")
	private WebElement eleEditFirstName;

	public EditLead editFirstName(String FirstName) {
		
	type(eleEditFirstName, FirstName);
	
	return this;
		
	}
	
	
	
}

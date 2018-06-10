package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.LoginPage;
import wdMethods.ProjectMethods;

public class TC004_EditLeadFlow2 extends ProjectMethods{

	@BeforeTest
	public void setData() {
		testCaseName="TC004_EditLeadF";
		testDescription="Edit a Lead";
		testNodes="Leads";
		category="Smoke";
		authors="Sarath";
		browserName="chrome";
		dataSheetName="TC004";
	}	

	@Test(dataProvider="fetchData")
	public void createLeadFlow(String uName,String pwd,String LeadId,String FirstName) {
		new LoginPage()
		.enterUserName(uName)
		.enterPassword(pwd)
		.clickLogIn()
		.clickCrmfa()
		.clickLeads()
		.clickFindLead()
		.TypeLeadID(LeadId)
		.clickFindLeads()
		.clickLead()
		.clickEditLead()
		.editFirstName(FirstName);
		

	}

}

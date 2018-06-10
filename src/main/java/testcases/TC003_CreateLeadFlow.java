package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.LoginPage;
import wdMethods.ProjectMethods;

public class TC003_CreateLeadFlow extends ProjectMethods{

	@BeforeTest
	public void setData() {
		testCaseName="TC003_CreateLeadF";
		testDescription="Create a New Lead";
		testNodes="Leads";
		category="Smoke";
		authors="Sarath";
		browserName="chrome";
		dataSheetName="TC003";
	}	

	@Test(dataProvider="fetchData")
	public void createLeadFlow(String uName,String pwd,String FirstName,String LastName,String CompayName) {
		new LoginPage()
		.enterUserName(uName)
		.enterPassword(pwd)
		.clickLogIn()
		.clickCrmfa()
		.clickLeads()
		.clickCreateLead()
		.typeFirstName(FirstName)
		.typeLastName(LastName)
		.typeCompanyName(CompayName)
		.submitCreateLead()
		.verifyFirstName();
		

	}

}

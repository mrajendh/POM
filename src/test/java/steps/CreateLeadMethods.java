package steps;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CreateLeadMethods {

	RemoteWebDriver driver;

	@Given("Launch Browser")

	public void launchBrowser()
	{
		System. setProperty("webdriver.chrome.driver", "./drivers\\chromedriver.exe");

		driver=new ChromeDriver();


		driver.manage().window().maximize();

	}


	@And("navigate to LeafTapsLink")

	public void leafTapsLink()

	{

		driver.get("http://leaftaps.com/opentaps/");	
	}



	@And("Enter UserName/Password and Login as (.*) as (.*)")

	public void enterCredentials(String UsrName,String pwd)
	{


		driver.findElementById("username").sendKeys(UsrName);

		//Enter Password
		driver.findElementById("password").sendKeys(pwd);
		//Click on Submit

		driver.findElementByClassName("decorativeSubmit").click();
	}

	@And("Click on CRM/SFC")

	public void clickCRMSFC()
	{

		driver.findElementByLinkText("CRM/SFA").click();
	}

	@And("Click on CreateLead")

	public void clickCreateLead()
	{

		driver.findElementByLinkText("Create Lead").click();
	}


	@And("Capture FirstName as (.*)")

	public void captureFirstName(String FirstName)
	{


		driver.findElementById("createLeadForm_firstName").sendKeys(FirstName);

	}


	@And("Capture LastName as (.*)")

	public void captureLastName(String LastName)
	{


		driver.findElementById("createLeadForm_lastName").sendKeys(LastName);

	}


	@And("Capture CompanyName as (.*)")

	public void captureCompanyName(String companyName)
	{

		driver.findElementById("createLeadForm_companyName").sendKeys(companyName);


	}




	@When("Click on Create Lead1")

	public void clickCreateLead1()
	{

		driver.findElementByName("submitButton").click();
	}

	@Then("Lead is Created")

	public void verifyCreateLead()
	{

		System.out.println("Lead is created");
	}





}

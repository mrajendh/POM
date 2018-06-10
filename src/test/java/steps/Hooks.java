package steps;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import wdMethods.SeMethods;

public class Hooks extends SeMethods {

	@Before
	public void BeforeScenario(Scenario sc)
	{ startResult();
	startTestModule(sc.getName(), sc.getId());	
	test=startTestCase(sc.getName());
	test.assignCategory("smoke");
	test.assignAuthor("Mani");
	startApp("chrome");

	System.out.println(sc.getId());

	System.out.println(sc.getName());

	}


	@After

	public void AfterScenario(Scenario sc)

	{

		System.out.println(sc.getStatus());

		System.out.println(sc.isFailed());
		closeAllBrowsers();
		endResult();

	}


}

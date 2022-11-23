package stepdefinition;

import base.Base;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import page.KidoodleWebStepImpl;
import utilities.*;

public class KidoodleWebStep extends Base {

	private final KidoodleWebStepImpl KidoodleWebStepImpl = new KidoodleWebStepImpl();

	@Given("Open Kidoodle login page")
	public void openLoginPage() throws Throwable {
		System.out.println("Open Kidoodle login page");
		ScreenShotUtil.resetNoOfSteps();

		KidoodleWebStepImpl.loginKidoodleWeb();
	}

	@Then("User is on {string} page")
	public void userIsOnPage(String page) throws Throwable {
		switch (page) {
			case "Kidoodle home":
				KidoodleWebStepImpl.checkPage(page);
				break;
		}
		System.out.println("User is on " + page + " page.");
	}

	@And("User inputs {string}")
	public void userInputs(String field) throws Throwable {
		switch (field) {
			case "Email Address":
			case "Password":
				KidoodleWebStepImpl.userInputs(field);
				break;
		}
		System.out.println("User inputs " + field);
	}

	@And("User clicks {string}")
	public void userClicks(String button) throws Throwable {
		switch (button) {
			case "Sign In":
			case "Register":
			case "SIGN IN":
			case "Avatar 1":
				KidoodleWebStepImpl.userClicks(button);
				break;
		}
		System.out.println("User clicks " + button);
	}

	@Then("User can see {string}")
	public void userCanSee(String message) throws Throwable {
		switch (message) {
			case "Who's watching?":
			case "Page with logged in icon":
				KidoodleWebStepImpl.userCanSee(message);
				break;
		}
		System.out.println("User can see " + message);
	}
}
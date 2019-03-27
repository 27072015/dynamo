package com.cg.conferenceregistration.stepdefinations;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import com.cg.conferenceregistration.pagebeans.ConferenceRegistrationPageBean;

import cucumber.api.PendingException;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ConferencePaymentStepDefination {
	private static  WebDriver driver;

	private ConferenceRegistrationPageBean pageBean;
	
	@Before
	public static void setUpStepEnv() {
		System.setProperty("webdriver.chrome.driver", "D:\\Software_backup\\chromedriver.exe");
		driver=new ChromeDriver();
	}
	
	@Given("^user is on the payment page$")
	public void user_is_on_the_payment_page() throws Throwable {
	    driver.get("D:\\Set B\\PaymentDetails.html");
		pageBean=PageFactory.initElements(driver, ConferenceRegistrationPageBean.class);
	}

	@Then("^check the title of the payment page$")
	public void check_the_title_of_the_payment_page() throws Throwable {
		String expectedAlertMessage=driver.getTitle();
		String actualAlertMessage ="Payment Details";
		Assert.assertEquals(expectedAlertMessage, actualAlertMessage);
	}

	@When("^user leaves CardHolder Name blank and clicks on Make Payment$")
	public void user_leaves_CardHolder_Name_blank_and_clicks_on_Make_Payment() throws Throwable {
	    pageBean.makePayment();
	}

	@Then("^display alert box with CardHolder Name empty message$")
	public void display_alert_box_with_CardHolder_Name_empty_message() throws Throwable {
		String expectedAlertMessage="Please fill the Card holder name";
		String actualAlertMessage =driver.switchTo().alert().getText();
		Assert.assertEquals(expectedAlertMessage, actualAlertMessage);
	}

	@When("^user leaves DebitCard Number blank and clicks on Make Payment$")
	public void user_leaves_DebitCard_Number_blank_and_clicks_on_Make_Payment() throws Throwable {
	    pageBean.setCardHolderName("abcd");
	}

	@Then("^display alert box with DebitCard Number empty message$")
	public void display_alert_box_with_DebitCard_Number_empty_message() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@When("^user leaves Expiration Month blank and clicks on Make Payment$")
	public void user_leaves_Expiration_Month_blank_and_clicks_on_Make_Payment() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@Then("^display alert box with Expiration Month empty message$")
	public void display_alert_box_with_Expiration_Month_empty_message() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@When("^user leaves Expiration Year blank and clicks on Make Payment$")
	public void user_leaves_Expiration_Year_blank_and_clicks_on_Make_Payment() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@Then("^display alert box with Expiration Year empty message$")
	public void display_alert_box_with_Expiration_Year_empty_message() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@When("^user enters valid details and clicks on Make Payment$")
	public void user_enters_valid_details_and_clicks_on_Make_Payment() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@Then("^display alert box with payment success message$")
	public void display_alert_box_with_payment_success_message() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}
	
	@After
	public void tearDownStepEnv() {
		driver.switchTo().alert().dismiss();
		driver.close();
	}
	
}

package com.cg.conferenceregistration.stepdefinations;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import com.cg.conferenceregistration.pagebeans.ConferenceRegistrationPageBean;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ConferenceRegistrationStepDefination {
	private static  WebDriver driver;
	
	private ConferenceRegistrationPageBean pageBean;
	@Before
	public static void setUpStepEnv() {
		System.setProperty("webdriver.chrome.driver", "D:\\Software_backup\\chromedriver.exe");
		driver=new ChromeDriver();
	}
	
	@Given("^user is on the conferenceregisteration page$")
	public void user_is_on_the_conferenceregisteration_page() throws Throwable {
	    
		driver.get("D:\\Set B\\ConferenceRegistartion.html");
		pageBean=PageFactory.initElements(driver, ConferenceRegistrationPageBean.class);
	}

	@Then("^check the title of the conferenceregistration page$")
	public void check_the_title_of_the_conferenceregistration_page() throws Throwable {
		String expectedAlertMessage=driver.getTitle();
		String actualAlertMessage ="Conference Registartion";
		Assert.assertEquals(expectedAlertMessage, actualAlertMessage);
	}

	@When("^user leaves First Name blank and submits$")
	public void user_leaves_First_Name_blank_and_submits() throws Throwable {
		driver.switchTo().alert().dismiss();
		pageBean.clickSignUp();
	}

	@Then("^'first name empty' alert message should display$")
	public void first_name_empty_alert_message_should_display() throws Throwable {
		 String expectedAlertMessage="Please fill the First Name";
			String actualAlertMessage =driver.switchTo().alert().getText();
			Assert.assertEquals(expectedAlertMessage, actualAlertMessage);
	}

	@When("^user leaves Last Name blank and submits$")
	public void user_leaves_Last_Name_blank_and_submits() throws Throwable {
		driver.switchTo().alert().dismiss();
		pageBean.setFirstName("abcd");
	    pageBean.clickSignUp();
	}

	@Then("^'last name empty' alert message should display$")
	public void last_name_empty_alert_message_should_display() throws Throwable {
		String expectedAlertMessage="Please fill the Last Name";
		String actualAlertMessage =driver.switchTo().alert().getText();
		Assert.assertEquals(expectedAlertMessage, actualAlertMessage);
	}

	@When("^user leaves email blank and submits$")
	public void user_leaves_email_blank_and_submits() throws Throwable {
		driver.switchTo().alert().dismiss();
	    pageBean.setLastName("dsf");
	   pageBean.clickSignUp();
	}

	@Then("^'email empty' alert message should display$")
	public void email_empty_alert_message_should_display() throws Throwable {
		String expectedAlertMessage="Please fill the Email";
		String actualAlertMessage =driver.switchTo().alert().getText();
		Assert.assertEquals(expectedAlertMessage, actualAlertMessage);
	}

	@When("^user enters wrong email format and submits$")
	public void user_enters_wrong_email_format_and_submits() throws Throwable {
		driver.switchTo().alert().dismiss();	
		pageBean.setEmailID("abcgmail");
		   pageBean.clickSignUp();
	}

	@Then("^'wrong email' alert message should display$")
	public void wrong_email_alert_message_should_display() throws Throwable {
		String expectedAlertMessage="Please enter valid Email Id.";
		String actualAlertMessage =driver.switchTo().alert().getText();
		Assert.assertEquals(expectedAlertMessage, actualAlertMessage);
	}

	@When("^user leaves contact no blank and submits$")
	public void user_leaves_contact_no_blank_and_submits() throws Throwable {
		driver.switchTo().alert().dismiss();
		pageBean.setEmailID("abc@gmail.com");
		   pageBean.clickSignUp();
	}

	@Then("^'contact no empty' alert message should display$")
	public void contact_no_empty_alert_message_should_display() throws Throwable {
		String expectedAlertMessage="Please fill the Contact No.";
		String actualAlertMessage =driver.switchTo().alert().getText();
		Assert.assertEquals(expectedAlertMessage, actualAlertMessage);
	}

	@When("^user enters wrong contact no format and submits$")
	public void user_enters_wrong_contact_no_format_and_submits() throws Throwable {
		driver.switchTo().alert().dismiss();
		pageBean.setContactNo("543");
		   pageBean.clickSignUp();
	}

	@Then("^'wrong contact no format' alert message should display$")
	public void wrong_contact_no_format_alert_message_should_display() throws Throwable {
		String expectedAlertMessage="Please enter valid Contact no.";
		String actualAlertMessage =driver.switchTo().alert().getText();
		Assert.assertEquals(expectedAlertMessage, actualAlertMessage);
	}

	@When("^user leaves number of people attending blank and submits$")
	public void user_leaves_number_of_people_attending_blank_and_submits() throws Throwable {
		driver.switchTo().alert().dismiss();
		pageBean.setContactNo("9876543272");
	    pageBean.clickSignUp();
	}

	@Then("^'empty number of people attending' alert message should display$")
	public void empty_number_of_people_attending_alert_message_should_display() throws Throwable {
		String expectedAlertMessage="Please fill the Number of people attendinge";
		String actualAlertMessage =driver.switchTo().alert().getText();
		Assert.assertEquals(expectedAlertMessage, actualAlertMessage);
	}

	@When("^user leaves building and room no blank and submits$")
	public void user_leaves_building_and_room_no_blank_and_submits() throws Throwable {
		driver.switchTo().alert().dismiss();
		pageBean.setNoOfPeopleAttenting("2");
	    pageBean.clickSignUp();
	}

	@Then("^'empty building and room no' alert message should display$")
	public void empty_building_and_room_no_alert_message_should_display() throws Throwable {
		String expectedAlertMessage="Please fill the Building & Room No";
		String actualAlertMessage =driver.switchTo().alert().getText();
		Assert.assertEquals(expectedAlertMessage, actualAlertMessage);
	}

	@When("^user leaves area name blank and submits$")
	public void user_leaves_area_name_blank_and_submits() throws Throwable {
		driver.switchTo().alert().dismiss(); 
		pageBean.setBuildNameRoomNo("qwerty");
		    pageBean.clickSignUp();
	}

	@Then("^'empty area name' alert message should display$")
	public void empty_area_name_alert_message_should_display() throws Throwable {
		String expectedAlertMessage="Please fill the Area name";
		String actualAlertMessage =driver.switchTo().alert().getText();
		Assert.assertEquals(expectedAlertMessage, actualAlertMessage);
	}

	@When("^user leaves city name blank and submits$")
	public void user_leaves_city_name_blank_and_submits() throws Throwable {
		driver.switchTo().alert().dismiss();
		pageBean.setAreaName("fds");
	    pageBean.clickSignUp();
	}

	@Then("^'empty city name' alert message should display$")
	public void empty_city_name_alert_message_should_display() throws Throwable {
		String expectedAlertMessage="Please select city";
		String actualAlertMessage =driver.switchTo().alert().getText();
		Assert.assertEquals(expectedAlertMessage, actualAlertMessage);
	}

	@When("^user leaves state column blank and submits$")
	public void user_leaves_state_column_blank_and_submits() throws Throwable {
		driver.switchTo().alert().dismiss();
		pageBean.setCity("Pune");
	    pageBean.clickSignUp();
	}

	@Then("^'empty state column' alert message should display$")
	public void empty_state_column_alert_message_should_display() throws Throwable {
		String expectedAlertMessage="Please select state";
		String actualAlertMessage =driver.switchTo().alert().getText();
		Assert.assertEquals(expectedAlertMessage, actualAlertMessage);
	}

	@When("^user leaves membership status blank and submits$")
	public void user_leaves_membership_status_blank_and_submits() throws Throwable {
		driver.switchTo().alert().dismiss();
		pageBean.setState("Maharashtra");
	    pageBean.clickSignUp();
	}

	@Then("^'empty membership status' alert message should display$")
	public void empty_membership_status_alert_message_should_display() throws Throwable {
		String expectedAlertMessage="Please Select MemeberShip status";
		String actualAlertMessage =driver.switchTo().alert().getText();
		Assert.assertEquals(expectedAlertMessage, actualAlertMessage);
	}

	@When("^user enters  valid data and submit$")
	public void user_enters_valid_data_and_submit() throws Throwable {
		driver.switchTo().alert().dismiss();
		pageBean.setmemberStatus("member");
		pageBean.clickSignUp();
	    
	}

	@Then("^display success message$")
	public void display_success_message() throws Throwable {
		String expectedAlertMessage="Personal details are validated.";
		String actualAlertMessage =driver.switchTo().alert().getText();
		Assert.assertEquals(expectedAlertMessage, actualAlertMessage);
	}

	@After
	public void tearDownStepEnv() {
		driver.switchTo().alert().dismiss();
		driver.close();
	}
}

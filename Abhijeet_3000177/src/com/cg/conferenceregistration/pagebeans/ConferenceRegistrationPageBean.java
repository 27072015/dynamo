package com.cg.conferenceregistration.pagebeans;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;

public class ConferenceRegistrationPageBean {
	@FindBy(how=How.NAME,name="txtFN")
	private WebElement firstName;
	
	@FindBy(how=How.NAME,name="txtLN")
	private WebElement lastName;
	
	@FindBy(how=How.NAME,name="Email")
	private WebElement emailID;
	
	@FindBy(how=How.NAME,name="Phone")
	private WebElement contactNo;
	
	@FindBy(how=How.NAME,name="size")
	private WebElement noOfPeopleAttenting;
	
	@FindBy(how=How.NAME,name="Address")
	private WebElement buildNameRoomNo;
	
	@FindBy(how=How.NAME,name="Address2")
	private WebElement areaName;
	
	@FindBy(how=How.NAME,name="city")
	private WebElement city;
	
	@FindBy(how=How.NAME,name="state")
	private WebElement state;
	
	@FindBy(how=How.NAME,name="memberStatus")
	private List<WebElement> memberStatus;
	
	@FindBy(how=How.NAME,name="txtFN")
	private WebElement submitBtn;
	
	@FindBy(how=How.ID,id="txtCardholderName")
	private WebElement cardHolderName;
	
	@FindBy(how=How.NAME,name="debit")
	private WebElement cardNumber;
	
	@FindBy(how=How.NAME,name="txtCvv")
	private WebElement cvv;
	
	@FindBy(how=How.NAME,name="txtMonth")
	private WebElement expMonth;
	
	@FindBy(how=How.NAME,name="txtYear")
	private WebElement expYear;
	
	@FindBy(how=How.ID,id="btnPayment")
	private WebElement makePayment;
		//<<Getter And Setter>>
	public String getFirstName() {
		return firstName.getAttribute("value");
	}

	public void setFirstName(String firstName) {
		this.firstName .sendKeys(firstName);
	}

	public String getLastName() {
		return lastName.getAttribute("value");
	}

	public void setLastName(String lastName) {
		this.lastName.sendKeys(lastName);
	}

	public String getEmailID() {
		return emailID.getAttribute("value");
	}

	public void setEmailID(String emailID) {
		this.emailID.clear();
		this.emailID.sendKeys(emailID);
	}

	public String getContactNo() {
		return contactNo.getAttribute("value");
	}

	public void setContactNo(String contactNo) {
		this.contactNo.clear();
		this.contactNo.sendKeys(contactNo);
	}

	public String getNoOfPeopleAttenting() {
		return noOfPeopleAttenting.getAttribute("value");
	}

	public void setNoOfPeopleAttenting(String noOfPeopleAttenting) {
		this.noOfPeopleAttenting.sendKeys(noOfPeopleAttenting);
	}

	public String getBuildNameRoomNo() {
		return buildNameRoomNo.getAttribute("value");
	}

	public void setBuildNameRoomNo(String buildNameRoomNo) {
		this.buildNameRoomNo.sendKeys(buildNameRoomNo);;
	}

	public String getAreaName() {
		return areaName.getAttribute("value");
	}

	public void setAreaName(String areaName) {
		this.areaName.sendKeys(areaName);
	}

	public String getCity() {
		return new Select(this.city).getFirstSelectedOption().getText();   
	}

	public void setCity(String city) {
		Select select=new Select(this.city);
		select.selectByVisibleText(city);
	}

	public String getState() {
		return new Select(this.state).getFirstSelectedOption().getText();
	}

	public void setState(String state) {
		Select select=new Select(this.state);
		select.selectByVisibleText(state);
	}

	public String getmemberStatus() {
		for(WebElement webElement:memberStatus)
			if(webElement.isSelected())
				return webElement.getAttribute("value");
		return null;
	}

	public void setmemberStatus(String memberStatus) {
		if(memberStatus.equalsIgnoreCase("member"))
			this.memberStatus.get(0).click();
		else
			this.memberStatus.get(1).click();
	}

	public void clickSignUp() {
		submitBtn.submit();
	}

	public String getCardHolderName() {
		return cardHolderName.getAttribute("value");
	}

	public void setCardHolderName(String cardHolderName) {
		this.cardHolderName.sendKeys(cardHolderName);
	}

	public String getCardNumber() {
		return cardNumber.getAttribute("value");
	}

	public void setCardNumber(String cardNumber) {
		this.cardNumber.sendKeys(cardNumber);
	}

	public String getCvv() {
		return cvv.getAttribute("value");
	}

	public void setCvv(String cvv) {
		this.cvv.sendKeys(cvv);
	}

	public String getExpMonth() {
		return expMonth.getAttribute("value");
	}

	public void setExpMonth(String expMonth) {
		this.expMonth.sendKeys(expMonth);
	}

	public String getExpYear() {
		return expYear.getAttribute("value");
	}

	public void setExpYear(String expYear) {
		this.expYear.sendKeys(expYear);
	}

	public void makePayment() {
		makePayment.submit();
	}
	
}

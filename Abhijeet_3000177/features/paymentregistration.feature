
Feature: ConferencePayment for registration

Scenario: check the title of the payment page
Given user is on the payment page
Then check the title of the payment page


When user leaves CardHolder Name blank and clicks on Make Payment
Then display alert box with CardHolder Name empty message


When user leaves DebitCard Number blank and clicks on Make Payment
Then display alert box with DebitCard Number empty message


When user leaves Expiration Month blank and clicks on Make Payment
Then display alert box with Expiration Month empty message


When user leaves Expiration Year blank and clicks on Make Payment
Then display alert box with Expiration Year empty message

Scenario: check whether alert box is coming for successful payment
Given user is on the payment page
When user enters valid details and clicks on Make Payment
Then display alert box with payment success message
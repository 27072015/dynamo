Feature: ConferenceRegisteration 
  this feature helps to register for conference

Scenario: user is trying to submit with invalid set of data
Given user is on the conferenceregisteration page
Then check the title of the conferenceregistration page


When user leaves First Name blank and submits
Then 'first name empty' alert message should display


When user leaves Last Name blank and submits
Then 'last name empty' alert message should display


When user leaves email blank and submits
Then 'email empty' alert message should display


When user enters wrong email format and submits
Then 'wrong email' alert message should display


When user leaves contact no blank and submits
Then 'contact no empty' alert message should display


When user enters wrong contact no format and submits
Then 'wrong contact no format' alert message should display


When user leaves number of people attending blank and submits
Then 'empty number of people attending' alert message should display


When user leaves building and room no blank and submits
Then 'empty building and room no' alert message should display


When user leaves area name blank and submits
Then 'empty area name' alert message should display


When user leaves city name blank and submits
Then 'empty city name' alert message should display


When user leaves state column blank and submits
Then 'empty state column' alert message should display


When user leaves membership status blank and submits
Then 'empty membership status' alert message should display

Scenario: check whether alert box is coming for valid data
Given user is on the conferenceregisteration page
When user enters  valid data and submit
Then display success message

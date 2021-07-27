
Feature: Title of your feature



Scenario: Lanch
Given Launch the url
When click on the account 
And enter the details for register
Then click on register



Scenario: Login 
Given Launch the browser
When enter the username and password
Then click on continue



Scenario: Navigate
Given Launch the chrome
When enter username and password for navigate
And click on ok
Then enter the product 



Scenario: InvalidZip
Given Launch the website for invalid zip
When enter the username and password for invalid zip
And enter the product details
And the product is added to cart
Then enter the cart details



Scenario: Logout
Given Launch the website
When enter uname and password for logout
Then click on myaccount and logout





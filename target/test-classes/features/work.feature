Feature: user booking the room


Background:
Given user launch the url

Scenario: user go to logion page
When user fill the username and password
|username|suryajoo|
|  password |Sharma@45|
#|santhosh   |jdsdj|
#|udhayakumar|jbdjsbajd|
Then user click the login button 

Scenario: user go to logion page
When user fill the username and password
|username|santhosh|
|  password |Sharma|
#|santhosh   |jdsdj|
#|udhayakumar|jbdjsbajd|
Then user click the login button 
Then user throw the message"Invalid Login details or Your Password might have expired. Click here to reset your password"

 
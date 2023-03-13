Feature: Application Login
@Login
Scenario: Login with valid credentials
Given Open any Browser
When Navigate to Login page
And User enters username as "endurance_osemwonta@gmail.com" and password as "Second@122" into the fields
And User clicks on Login button
Then Verify user is able to successfully login



@Register
Scenario: Registering new account
Given I open the browser
When I navigate to register account page
And I enter the below details
    |firstname|Endurance											|
		|lastname |Osemwonta									    |
		|email		|CharaEddzz207@gmail.com          |
		|telephone|12345678									      |
		|password	|Second@123                     |
And I check i have read and agree to the privacy policy
And I click continue button
Then I am successfully registered



@Smoke
Scenario Outline: property search
Given I navigate to home page
When I enter "<location>" into location
And I click  for sale
And I select "<distance>" as search radious
And I select "<minPrice>" as minimum price
And I select "<maxPrice>" as maximum price
And I select "<minBed>" as minimum bed
And I select "<maxBed>" as maximum bed
And I select "<types>" as property type
And I select "<time>" as added on site
And I click on search button
Then I am on search result page

Examples: 
|location  |distance       |minPrice        |maxPrice         |minBed       |maxBed          |types                   |time           |
|Manchester|Within 5 miles |200,000         |300,000          |3            |3               |Houses                  |Last 14 days   |
#|London    |Within 5 miles |200,000				  |300,000         	|3            |3               |Houses                  |Last 14 days |

@Mike
Scenario: navigate to yahoo home page via google
Given I navigate to google home page
When I enter yahoo into the google search field and i click
And I sign in
And I enter username as "endurance_osemwonta@yahoo.com" into email field
And I enter "Second@123" into password field
And User clicks on Sign in button
Then Am able to successefully sign in

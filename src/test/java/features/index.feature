Feature: opencart 

@TC01_Registration_and_AddtoCart
Scenario: Add members in to pandarasamaj protal
	Given The user launch Chrome browser.
	When The user click on my account link.
	Then The user click on register button.
	When The user sing up with following details.
	|kumar||badatya||kumartum1234@gmail.com||8845966251||12345678||12345678|
	And The user click on continue button.
	Then The user verify account create success message and click on contact us button.
	And The user enter enqury details and click on submit button.
	Then The user verify contact us header and click on continue button.
	When The user click on tablet tab and select the product image.
	Then The user click on riview link fill the review comment and click continue button.
	Then The user verify the product details from wish list page.
	Then The user click on add to cart button and verify success message.
	And The user click on remove button and verify success message.
	Then The user click on logout button form my account list.
	
@TC02_Product_Comparison
Scenario: Add members in to pandarasamaj protal
	Given The user launch Chrome browser.
	When The user enter the user name "kumartum1234@gmail.com" password and "12345678" click on login button.
	Then The user enter product name from search bar and click enter.
	And The user select on monitor poduct from dropdown compornent list.
	Then The user select on phone PDAs tab and compire thr three products.
	Then The user click on add to cart button from select product page.
	And The user click on total cart button from home page.
	Then The user click on check out button.
	When The user cselect order history form my account dropdown list.
	Then The user click on news letter link from home page.
	Then The user click on logout button form my account list.
	
	
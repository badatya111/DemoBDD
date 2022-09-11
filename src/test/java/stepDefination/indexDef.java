package stepDefination;

import org.openqa.selenium.WebDriver;

import com.opencart.page.AppLaunch;
import com.opencart.page.Home;
import com.opencart.page.Index;
import com.opencart.page.Login;
import com.opencart.page.RegisterAccount;
import com.opencart.page.YourStore;

import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class indexDef {
	
	AppLaunch appLaunch=new AppLaunch();
	Index index=new Index();
	RegisterAccount registerAccount=new RegisterAccount();
	YourStore yourStore=new YourStore();
	Login login=new Login();
	
	public static WebDriver driver;
	
	
	@Given("^The user launch Chrome browser.$")
	 public void launchApp() throws Throwable {
		appLaunch.launchApp();
	 }
	
	@When("^The user search the product.$")
	 public void clickOnMyAccount() throws Throwable {
		index.searchProduct();
	 }
	
	@Then("^The user close browser and quite it.$")
	 public void clickOnRegstrationButton() throws Throwable {
		appLaunch.exitDriver();
	 }
	
	@When("^The user sing up with following details.$")
	 public void enterUserDetails(DataTable dataTable) throws Throwable {
		registerAccount.enterUserDetails(dataTable);
	 }
	
	@And("^The user click on continue button.$")
	 public void clcikContinueButton() throws Throwable {
		registerAccount.clcikContinueButton();
	 }
	
	@Then("^The user verify account create success message and click on contact us button.$")
	 public void acCreatSuccessMsg() throws Throwable {
		yourStore.acCreatSuccessMsg();
	 }
	
	@And("^The user enter enqury details and click on submit button.$")
	 public void contactDetails() throws Throwable {
		yourStore.contactDetails();
	 }
	
	@Then("^The user verify contact us header and click on continue button.$")
	 public void verifyContackUsMsg() throws Throwable {
		yourStore.verifyContackUsMsg();
	 }
	
	@When("^The user click on tablet tab and select the product image.$")
	 public void clickOnTabletsTab() throws Throwable {
		yourStore.clickOnTabletsTab();
	 }
	
	@Then("^The user click on riview link fill the review comment and click continue button.$")
	 public void review() throws Throwable {
		yourStore.review();
	 }
	
	@Then("^The user verify the product details from wish list page.$")
	 public void verifyProductDetails() throws Throwable {
		yourStore.verifyProductDetails();
	 }
	
	@Then("^The user click on add to cart button and verify success message.$")
	 public void addtoCartFromWishList() throws Throwable {
		yourStore.addtoCartFromWishList();
	 }
	
	@And("^The user click on remove button and verify success message.$")
	 public void removeItemFromWishList() throws Throwable {
		yourStore.removeItemFromWishList();
	 }
	
	@When("^The user enter the user name \"([^\"]*)\" password and \"([^\"]*)\" click on login button.$")
	public void enterUserNamePassword(String userName,String password) throws Throwable {
		login.enterUserNamePassword(userName,password);
	}
	
	@Then("^The user enter product name from search bar and click enter.$")
	public void searchItems() throws Throwable {
	}
	
	@And("^The user select on monitor poduct from dropdown compornent list.$")
	public void monitorPoductSelect() throws Throwable {
	}
	
	@Then("^The user select on phone PDAs tab and compire thr three products.$")
	public void selectAndCompireProduct() throws Throwable {
	}
	
	@Then("^The user click on add to cart button from select product page.$")
	public void clickAdtoCart() throws Throwable {
	}
	
	@And("^The user click on total cart button from home page.$")
	public void clickTotalCartButton() throws Throwable {
	}
	
	@Then("^The user click on check out button.$")
	public void clickCheckOutBtn() throws Throwable {
	}
	
	@When("^The user cselect order history form my account dropdown list.$")
	public void selectOrderHistory() throws Throwable {
	}
	
	@Then("^The user click on news letter link from home page.$")
	public void clickNewsLitter() throws Throwable {
	}
	
	@Then("^The user click on logout button form my account list.$")
	public void clickOnLogoutButton() throws Throwable {
	}
	
	
	

	
	
	
	
	
	
	
	
	
	
	
	
	
}

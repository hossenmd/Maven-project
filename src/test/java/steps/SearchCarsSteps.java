package steps;

import java.util.List;

import cucumber.api.DataTable;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.actions.CarsGuideHomepageActions;
import pages.actions.CarsSearchPageActions;
import utils.SeleniumDriver;

public class SearchCarsSteps {
	CarsGuideHomepageActions carsGuideHomepageActions = new CarsGuideHomepageActions();
	CarsSearchPageActions carsSearchPageActions = new CarsSearchPageActions();
	
	
	@Given("^I am on the homepage \"([^\"]*)\" of Carsguid website$")
	public void i_am_on_the_homepage_of_Carsguid_website(String websiteUrl) throws Throwable {
	   SeleniumDriver.openPage(websiteUrl);
	}

	@When("^i move to the manu$")
	public void i_move_to_the_manu(List<String>list) throws Throwable {
		String menu = list.get(1);
		System.out.println("amar baal");
		carsGuideHomepageActions.moveToBuyPlusSellMenu();
	}

	@And("^click on \"([^\"]*)\" link$")
	public void click_on_link(String arg1) throws Throwable {
		carsGuideHomepageActions.ClickOnSearchCarsMenu();
	}

	@And("^select carbrand as \"([^\"]*)\" from anymake dropdown$")
	public void select_carbrand_as_from_anymake_dropdown(String carbrand) throws Throwable {
		carsSearchPageActions.selectCarMake(carbrand);
	}

	@And("^select carmodel as \"([^\"]*)\" from selectModel dropdown$")
	public void select_carmodel_as_from_selectModel_dropdown(String carmodel) throws Throwable {
		carsSearchPageActions.selectCarModel(carmodel);
	}

	@And("^select location as \"([^\"]*)\" from Selactlocation dropdown$")
	public void select_location_as_from_Selactlocation_dropdown(String carlocation) throws Throwable {
		carsSearchPageActions.selectCarLocation(carlocation);
	}

	@And("^select price as \"([^\"]*)\" from price dropdown$")
	public void select_price_as_from_price_dropdown(String carPrice) throws Throwable {
		carsSearchPageActions.selectCarPrice(carPrice);
	}

	@And("^click on find _my_next car button$")
	public void click_on_find__my_next_car_button() throws Throwable {
	   carsSearchPageActions.ClickOnCarBtn();
	}

	@Then("^I should see list of search cars$")
	public void i_should_see_list_of_search_cars() throws Throwable {
	   
	}

	@Then("^the page title should be \"([^\"]*)\"$")
	public void the_page_title_should_be(String arg1) throws Throwable {
	   
	}



}

package pages.actions;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import pages.locators.CarsSearchpageLocators;
import utils.SeleniumDriver;

public class CarsSearchPageActions {
	CarsSearchpageLocators carsSearchpageLocators = null;
	public CarsSearchPageActions() {
		this.carsSearchpageLocators =new CarsSearchpageLocators();
		PageFactory.initElements(SeleniumDriver.getDriver(), carsSearchpageLocators);
	}
	
	public void selectCarMake(String carbrand) {
		Select selectCarmaker = new Select(carsSearchpageLocators.CarMakeDropDown);
		selectCarmaker.selectByVisibleText("BMW");
	}
	
	public void selectCarModel(String carModel) {
		Select selectCarmaker = new Select(carsSearchpageLocators.SelectModelDropDown);
		selectCarmaker.selectByVisibleText("1 SERIES");
	}
	
	public void selectCarLocation (String carLocation) {
		Select selectCarmaker = new Select(carsSearchpageLocators.SelectLocationDropDown);
		selectCarmaker.selectByVisibleText("Australia");
	}
	
	public void selectCarPrice(String carPrice) {
		Select selectCarmaker = new Select(carsSearchpageLocators.PriceDropDown);
		selectCarmaker.selectByVisibleText("$1,000");
	}
	public void ClickOnCarBtn() {
		carsSearchpageLocators.FindMyNextCarBtn.click();
		
	}
	
	
	

}

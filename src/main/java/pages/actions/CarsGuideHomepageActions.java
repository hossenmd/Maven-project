package pages.actions;

import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

import pages.locators.CarsGuidHomepageLocators;
import utils.SeleniumDriver;

public class CarsGuideHomepageActions {

	
	CarsGuidHomepageLocators carsGuidHomepageLocators =null;
	
	public CarsGuideHomepageActions() {
		this.carsGuidHomepageLocators = new CarsGuidHomepageLocators();
		
		PageFactory.initElements(SeleniumDriver.getDriver(), carsGuidHomepageLocators);
}
	
	public void moveToBuyPlusSellMenu() {
		Actions action = new Actions(SeleniumDriver.getDriver());
		action.moveToElement(carsGuidHomepageLocators.Buyplussale).perform();
	}
	public void ClickOnSearchCarsMenu() {
		carsGuidHomepageLocators.SearchCarsLink.click();
		
	}
    public void ClickOnUsedCarsMenu() {
    	carsGuidHomepageLocators.Usedlink.click();
		
	}
    
    public void MoveToReviewsMenu() {
    	Actions action = new Actions(SeleniumDriver.getDriver());
		action.moveToElement(carsGuidHomepageLocators.Reviewslink).perform();
    	
		
	}
    public void MoveTonews() {
    	Actions action = new Actions(SeleniumDriver.getDriver());
		action.moveToElement(carsGuidHomepageLocators.Newslink).perform();
    	
	
    }
	
}

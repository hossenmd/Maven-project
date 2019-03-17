package pages.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class CarsSearchpageLocators {
	@FindBy (how = How.XPATH,using="//*[@id=\"makes\"]")
	public WebElement CarMakeDropDown;
	
	
	@FindBy (how = How.XPATH,using="//*[@id=\"locations\"]")
	public WebElement SelectLocationDropDown;
	
	
	
	@FindBy (how = How.XPATH,using="//*[@id=\"price-max\"]")
	public WebElement PriceDropDown;
	
	@FindBy (how = How.XPATH,using="//*[@id=\"models\"]")
	public WebElement SelectModelDropDown;
	
	
	@FindBy (how = How.XPATH,using="//*[@id=\"search-submit\"]")
	public WebElement FindMyNextCarBtn;
	
}

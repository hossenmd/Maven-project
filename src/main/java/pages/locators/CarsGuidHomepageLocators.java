package pages.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class CarsGuidHomepageLocators {

	@FindBy (how = How.LINK_TEXT,using="buy + sell")
	public WebElement Buyplussale;
	
	@FindBy (how = How.LINK_TEXT,using="News")
	public WebElement Newslink;

	@FindBy (how = How.LINK_TEXT,using="Reviews")
	public WebElement Reviewslink;

	@FindBy (how = How.LINK_TEXT,using="Search Cars")
	public WebElement SearchCarsLink;

	@FindBy (how = How.LINK_TEXT,using="Used")
	public WebElement Usedlink;
}




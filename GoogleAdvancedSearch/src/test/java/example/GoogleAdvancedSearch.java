package example;

import org.testng.Assert;

public class GoogleAdvancedSearch {
	
	public void accessSite(){
		Initialize.initialize(CommonConstant.GOOGLE_ADVANCED_SEARCH);
	}
	
	public void allTheseWordsField(String xpath, String text){
		CommonFunction.typeText(xpath, text);
	}
	
	public void language(String xpath, String languageChoosen){
		CommonFunction.clickElement(xpath);
		CommonFunction.clickElement(languageChoosen);
	}
	
	public void lastUpdateField(String xpath, String lastUpdateChoosen){
		CommonFunction.clickElement(xpath);
		CommonFunction.clickElement(lastUpdateChoosen);
	}
	
	public void clickAdvancedSearchButton(){
		CommonFunction.clickElement(CommonConstant.ADVANCED_SEARCH_BUTTON_XPATH);
	}
	
	public void checkFirstContentResultPage(String xpath, String contentToCompare){
		Assert.assertTrue(CommonFunction.getTextFromElement(xpath).contains(contentToCompare));
	}
}

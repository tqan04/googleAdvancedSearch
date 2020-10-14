package example;		

import org.testng.Assert;		
import org.testng.annotations.Test;

import org.testng.annotations.BeforeTest;	
import org.testng.annotations.AfterTest;		
public class Main {			
		@Test				
		public void mainCase() {	
			
		//Access Google Advanced Search
			Initialize.initialize(CommonConstant.GOOGLE_ADVANCED_SEARCH);
			
		//Input fields and search
			CommonFunction.typeText(CommonConstant.ALL_THESE_WORDS_XPATH, CommonConstant.ALL_THESE_WORDS_TEXT);
			
			CommonFunction.clickElement(CommonConstant.LANGUAGE_LIST_XPATH);
			CommonFunction.clickElement(CommonConstant.VIETNAMESE_LANGUAGE_XPATH);
			
			CommonFunction.clickElement(CommonConstant.LAST_UPDATE_LIST_XPATH);
			CommonFunction.clickElement(CommonConstant.PAST_24HOURS_XPATH);
			
			CommonFunction.clickElement(CommonConstant.ADVANCED_SEARCH_BUTTON_XPATH);
			
		//Check result	
			Assert.assertTrue(CommonFunction.getTextFromElement(CommonConstant.FIRST_LINK_RESULT_XPATH).contains("COVID-19")); 	
		}	
		
		@BeforeTest
		public void beforeTest() {
		}		
		
		@AfterTest
		public void afterTest() {
			Initialize.quitDriver();	
		}		
		

		
}	
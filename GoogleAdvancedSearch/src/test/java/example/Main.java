package example;		
	
import org.testng.annotations.Test;

import org.testng.annotations.BeforeTest;	
import org.testng.annotations.AfterTest;		
public class Main {			
	    static GoogleAdvancedSearch googleAdvanced = new GoogleAdvancedSearch();
	    
		@Test				
		public void mainCase() {	
			
		//Access Google Advanced Search
			googleAdvanced.accessSite();
			
		//Input fields and search
			googleAdvanced.allTheseWordsField(CommonConstant.ALL_THESE_WORDS_XPATH, CommonConstant.ALL_THESE_WORDS_TEXT);
			googleAdvanced.language(CommonConstant.LANGUAGE_LIST_XPATH,CommonConstant.VIETNAMESE_LANGUAGE_XPATH);
			googleAdvanced.lastUpdateField(CommonConstant.LAST_UPDATE_LIST_XPATH, CommonConstant.PAST_24HOURS_XPATH);
			googleAdvanced.clickAdvancedSearchButton();
			
		//Check result	
			googleAdvanced.checkFirstContentResultPage(CommonConstant.FIRST_LINK_RESULT_XPATH,"COVID-19"); 	
		}	
		
		@BeforeTest
		public void beforeTest() {
		}		
		
		@AfterTest
		public void afterTest() {
			Initialize.quitDriver();	
		}		
		

		
}	
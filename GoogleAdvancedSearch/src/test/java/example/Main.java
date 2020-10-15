package example;		
	
import org.testng.annotations.Test;
import java.io.IOException;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;	
import org.testng.annotations.DataProvider;

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
		
		@DataProvider
	    public static Object[][] url() {
	    	System.out.println("DataProvider:url");
	        return new Object[][] {{"http://www.google.com", "Google"}, {"http://www.bing.com", "Bing"}};
	    }

	    @DataProvider
	    public static Object[][] dataFromExcel() throws IOException{
	    	System.out.println("DataProvider:dataFromExcel");
	    	return ReadExcel.readDataFromExcel("data\\url.xls", "Sheet1");
	    }
	    
		@Test(groups={"_group1"},dataProvider="url")				
		public void testDataProvider(String url, String ExpectedTitle) {	
			System.out.println("Test:testDataProvider");
			CommonFunction.checkTitle(url, ExpectedTitle);
		}
		
		@Test(groups={"group1"},dataProvider="dataFromExcel")				
		public void testDataProviderExcel(String url, String ExpectedTitle) {	
			System.out.println("Test:testDataProviderExcel");
			CommonFunction.checkTitle(url, ExpectedTitle);
		}		
		
		
		@BeforeTest(groups={"group1"})
		public void beforeTest() {
			Initialize.initialize();
		}		
		
		@AfterTest(groups={"group1"})
		public void afterTest() {
			Initialize.quitDriver();	
		}		
		

		
}	
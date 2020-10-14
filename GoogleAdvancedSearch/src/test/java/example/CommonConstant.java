package example;

public class CommonConstant {
	public static final int WAITING_TIME = 10;
	public static final String GOOGLE_ADVANCED_SEARCH = "https://www.google.com/advanced_search?hl=vi&fg=1";
	
	public static final String ALL_THESE_WORDS_XPATH = "//*[@name='as_q']";
	public static final String ALL_THESE_WORDS_TEXT = "COVID-19";
	
	public static final String LANGUAGE_LIST_XPATH = "//*[@action = '/search']//div[text()='any language' or text()='bất kỳ ngôn ngữ']";
	public static final String VIETNAMESE_LANGUAGE_XPATH = "//*[@class = 'goog-menuitem' and @value = 'lang_vi']";
	
	public static final String LAST_UPDATE_LIST_XPATH = "//*[@action = '/search']//div[text()='anytime' or text()='bất kỳ lúc nào']";
	public static final String PAST_24HOURS_XPATH = "//*[@class = 'goog-menuitem' and @value = 'd']";
	
	public static final String ADVANCED_SEARCH_BUTTON_XPATH = "//*[@value = 'Advanced Search' or @value='Tìm kiếm nâng cao']";
	
	public static final String FIRST_LINK_RESULT_XPATH = "//*[@id='rso']//h3[1]";
	
}

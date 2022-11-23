package constant;

public class Xpath_Locator_Kidoodle_Web {
	public static final String mainPageURL = "https://www.kidoodle.tv/";
	public static final String kidoodleHomeHeader ="//h1[text()='Kidoodle']";
	public static final String signInBtn = "//*[@title='Sign In']";
	public static final String emailInputField = "//input[@id='user-email' and @type='email']";
	public static final String pwInputField = "//input[@type='password']";
	public static final String registerBtn = "//*[@title='Register']";
	public static final String SIGNINBtn = "//a[contains(@class,'font-bold uppercase text-white active:shadow-inner group-hover:mb-0 group-hover:cursor-pointer') or contains(text(),'Sign In')]";
	public static final String whosWatchingText ="//*[contains(text(),\"Who's watching?\")]";
	public static final String fiveProfilesText ="//*[contains(text(),'You can create up to 5 profiles.')]";
	public static final String avatar1Btn ="//*[@alt='avatar_1']";
	public static final String avatar1Icon ="//*[@class='rounded-full']";
}

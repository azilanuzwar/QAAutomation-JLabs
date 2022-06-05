package cobaqaautomation.cobamay2022;

import org.testng.annotations.Test;
import cobaqaautomation.cobamay2022.pages.CobaCommonPage;
import cobaqaautomation.cobamay2022.utils.CobaTestUtility;

public class CobaCommonTest extends CobaBaseWebTest {

	CobaCommonPage commonPage = new CobaCommonPage (driver,explicitWait);
		
	@Test
	public void testSwitching() {
		commonPage.openNewTab();
		commonPage.switchWindow(1);
		commonPage.openUrl("https://web.facebook.com");
		commonPage.openNewWindow();
		commonPage.switchWindow(2);
		commonPage.openUrl("https://twitter.com");
		CobaTestUtility.hardWait(3);

	}
	
}


package cobaqaautomation.cobamay2022.yopmail;

import org.testng.annotations.Test;
import cobaqaautomation.cobamay2022.utils.CobaTestUtility;
import cobaqaautomation.cobamay2022.yopmailpages.YopmailCommonPage;

public class CommonTest extends BaseWebTest {

	YopmailCommonPage commonPage = new YopmailCommonPage (driver,explicitWait);
	
	@Test
	public void testSwitching () {
		
		commonPage.openNewTab();
		commonPage.switchFrame("ifmail");
		CobaTestUtility.hardWait(3);

	//public void switchFrame(String frameName) {
	//driver.get().switchTo().frame(frameName);
	}
}
package cobaqaautomation.cobamay2022.utils;

public class CobaTestUtility {

	
	public static void hardWait (int second) {
		try {
			Thread.sleep(1000*second);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block				e.printStackTrace();
			}
		}
}
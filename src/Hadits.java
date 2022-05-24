import java.net.MalformedURLException;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class Hadits extends base{

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub
		AndroidDriver<AndroidElement> driver =capabilities();
		
		//flow serba-serbi->hadist
		driver.findElementById("com.pbm.ramadhanberkahrevisi1:id/cv_serba_serbi").click();
		driver.findElementByXPath("//android.widget.FrameLayout[1]").click();
		//scroll
		driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Tiga Orang yang Dibolehkan meminta-minta\"));");
		
	}

}

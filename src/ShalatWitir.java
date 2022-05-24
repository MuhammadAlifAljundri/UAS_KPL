import java.net.MalformedURLException;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class ShalatWitir extends base{

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub

		AndroidDriver<AndroidElement> driver =capabilities();
		//flow shalat->witir
		driver.findElementById("com.pbm.ramadhanberkahrevisi1:id/cv_shalat").click();
		driver.findElementByXPath("//android.widget.FrameLayout[3]").click();
	}

}

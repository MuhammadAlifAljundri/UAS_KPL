import java.net.MalformedURLException;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class Kuis extends base{

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub
		
		AndroidDriver<AndroidElement> driver =capabilities();
		
		//flow serba-serbi->kuis
		driver.findElementById("com.pbm.ramadhanberkahrevisi1:id/cv_serba_serbi").click();
		driver.findElementByXPath("//android.widget.FrameLayout[3]").click();
		driver.findElementByXPath("//android.widget.Button[@text='FAJAR SHADIQ']").click();
//		driver.findElementByXPath("//android.widget.Button[@text='BERHADAST']").click();

	}

}

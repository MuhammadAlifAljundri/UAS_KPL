import java.net.MalformedURLException;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class Kisah extends base{

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub
		AndroidDriver<AndroidElement> driver =capabilities();
		
		//flow serba-serbi->ngabuburit->kisah
		driver.findElementById("com.pbm.ramadhanberkahrevisi1:id/cv_serba_serbi").click();
		driver.findElementByXPath("//android.widget.FrameLayout[2]").click();
		driver.findElementByXPath("//android.widget.FrameLayout[1]").click();
	
	}

}

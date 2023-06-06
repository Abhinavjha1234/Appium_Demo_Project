package tests;

import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class BaseClass {
	AppiumDriver driver;
	
	@BeforeTest
	public void setup() {
		try {
		 DesiredCapabilities caps = new DesiredCapabilities();
		 //caps.setCapability("platformName", "ANDROID");
		 caps.setCapability(MobileCapabilityType.PLATFORM_NAME, "ANDROID");
		 caps.setCapability(MobileCapabilityType.PLATFORM_VERSION, "12 SKQ1.211103.001");
		 caps.setCapability(MobileCapabilityType.DEVICE_NAME, "Redmi Note 11");
		 caps.setCapability(MobileCapabilityType.UDID, "4e6a1134");
		 caps.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, 60);
		 //caps.setCapability(MobileCapabilityType.APP, "C:\\Users\\itsup\\Downloads\\ramagya-mart.apk");
		 //caps.setCapability(MobileCapabilityType.BROWSER_NAME, "Chrome");
		 URL url = new URL("http://127.0.0.1:4723");
		 driver=new AppiumDriver(url, caps);
		 //driver=new AndroidDriver(url,caps);
		 //driver=new IOSDriver(url,caps);
		}
		catch(Exception exp) {
		System.out.println("cause is:"+exp.getCause());
		System.out.println("Message is:"+exp.getMessage());
		exp.printStackTrace();
		}
		 
	}
	@Test
	public void sampleTest() {
		System.out.println("I am inside sample Test");
	}
	@AfterTest
	public void teardown() {
	
	}

}

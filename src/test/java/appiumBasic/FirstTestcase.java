package appiumBasic;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

public class FirstTestcase {

    @Test
    public void OpenEmulator() throws MalformedURLException {
        DesiredCapabilities caps = new DesiredCapabilities();
        //caps.setCapability("browserName","chrome");
        //caps.setCapability("platformName","Wagih");
        caps.setCapability(MobileCapabilityType.BROWSER_NAME,"chrome");
        caps.setCapability(MobileCapabilityType.DEVICE_NAME,"Wagih");

        WebDriverManager.chromedriver().setup();
        caps.setCapability("chromedriverExecutable",WebDriverManager.chromedriver().getBrowserPath());

        AndroidDriver driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"),caps);

    }
}

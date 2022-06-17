package utilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class Driver {
    private Driver() {
    }
    private static AndroidDriver<AndroidElement> driver;
    public static String userName = "oguzhan_vLR7XP";
    public static String accessKey = "CLW7GLMCFZZsq1xkvuNy";
    public static String bs="bs://dc4488e5368a595d9014528d81051c5ba0c37950";
    public static AndroidDriver<AndroidElement> get(){
        if (driver==null){
            String platform = ConfigurationReader.get("platform");
            DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
            switch (platform){
                case "android":

                    desiredCapabilities.setCapability("platformName", "Android");
                    desiredCapabilities.setCapability("platformVersion", "12.0");
                    desiredCapabilities.setCapability("deviceName", "Nexus 5");
                    desiredCapabilities.setCapability("automationName", "UiAutomator2");
                    desiredCapabilities.setCapability("app", "C:\\Users\\omerf\\Desktop\\com.ApidemosCucumber\\hepsiburada-5-4-5.apk");
                    try {
                        driver = new AndroidDriver<>(new URL("http://localhost:4723/wd/hub"), desiredCapabilities);
                        Driver.get().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
                    }catch (MalformedURLException e){
                        e.printStackTrace();
                    }
                    break;
                case "browserstack":


                    desiredCapabilities.setCapability("platformName", "android");
                    desiredCapabilities.setCapability("platformVersion", "9.0");
                    desiredCapabilities.setCapability("deviceName", "Google Pixel 3");
                    desiredCapabilities.setCapability("app", bs);
                    try {
                        driver = new AndroidDriver<AndroidElement>(new URL("https://"+userName+":"+accessKey+"@hub-cloud.browserstack.com/wd/hub"), desiredCapabilities);
                        Driver.get().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
                    }catch (MalformedURLException e){
                        e.printStackTrace();
                    }
                    break;
                default:

            }
        }
        return driver;
    }

    public static void closeDriver() {
        if (driver!=null){
            driver.quit();
            driver=null;
        }
    }
}

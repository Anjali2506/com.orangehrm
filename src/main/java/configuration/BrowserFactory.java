package TestBase;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.Browser;
import utils.YamlUtils;

import java.io.File;

public class BrowserFactory {

  public WebDriver createBrowserInstance(String browser){
      WebDriver driver = null;
      if(browser.equalsIgnoreCase("chrome")){
          WebDriverManager.chromedriver().setup();
          ChromeOptions chromeOptions = new ChromeOptions();
          driver=new ChromeDriver();
          
      } else if (browser.equalsIgnoreCase("firefox")) {
          WebDriverManager.firefoxdriver().setup();
          driver = new FirefoxDriver();
          
      } else if (browser.equalsIgnoreCase("ie")) {
          WebDriverManager.iedriver().setup();
          driver = new InternetExplorerDriver();
      }
      return driver;
  }


}

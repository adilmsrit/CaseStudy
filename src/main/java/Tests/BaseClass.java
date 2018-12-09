package Tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public abstract class BaseClass {

  public static WebDriver driver;

  void setup() {
    System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\SeleniumJars\\chromedriver.exe");
    driver = new ChromeDriver( );

    driver.manage( ).deleteAllCookies( );
    driver.manage( ).window( ).maximize( );


  }
}

package StepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CommonFunctions {

    public static WebDriver driver;


    /*Generic method to work with explicit wait for elements*/
    public static WebElement waitForElement(By locator, int timeoutInSeconds){
        WebElement element = null;
        try {
            System.out.println("Waiting for max::" +timeoutInSeconds+ " seconds for element to be available.");
            WebDriverWait wait = new WebDriverWait(driver, timeoutInSeconds);
            element= wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
            System.out.println("'" + locator + "'" + ", Element appread on the page.");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return element;
    }
}

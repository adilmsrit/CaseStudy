package StepDefinitions;

import cucumber.api.java.en.*;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.security.Key;
import java.util.List;

import static StepDefinitions.CommonFunctions.waitForElement;

public class StepDefnition extends CommonFunctions {


    @Given("^that Bill has decided to check available flights$")
    public void that_Bill_has_decided_to_check_available_flights() {

        System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\SeleniumJars\\chromedriver.exe");
        driver = new ChromeDriver();

      /*  System.setProperty("webdriver.gecko.driver", "D:\\Selenium\\SeleniumJars\\Firefox and Gecko\\geckodriver.exe");
        driver = new FirefoxDriver();*/

        String baseURL = "https://www.emirates.com/ae/english/";

        driver.manage().deleteAllCookies();
        driver.manage().window().maximize();
        //driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        driver.get(baseURL);

    }

    @When("^he looks at a return trip from DXB to LHR leaving one week from now$")
    public void he_looks_at_a_return_trip_from_DXB_to_LHR_leaving_one_week_from_now() throws InterruptedException {

        String searchingText = "London Heathrow Airport (LHR), London, United Kingdom";
        String partialText = "LHR";

        WebElement text = waitForElement(By.name("Arrival airport"), 20);
        text.clear();

        text.sendKeys("LHR");
        Thread.sleep(3000);
        WebElement element =driver.findElement(By.xpath("//ol[@class='location__list']"));

        List<WebElement> results = element.findElements(By.tagName("li"));

        for (WebElement result : results) {
            if (result.getText().equals(searchingText)) {
                result.click();
                System.out.println("Selected: " + result.getText());
                break;
            }
        }

        //Click on Calendar
        waitForElement(By.xpath(".//*[@id='search-flight-date-picker--depart']"), 20).click();

        //Select Date using below field.
        waitForElement(By.xpath("(//eol-calendar[@title='Please choose your departure date']//table[@class='ek-datepicker__table']//td[@class='ek-datepicker__day ek-datepicker__day--start ek-datepicker__today']"), 20).click();
        //Select return date using below
        waitForElement(By.xpath(".//*[@id='panel0']/div/div/div/div[2]/section/div[4]/div[1]/div[3]/eol-datefield/eol-calendar/div/div/div[2]/table/tbody/tr[3]/td[7]/a"), 20).click();
        //Click on submit using below.
        waitForElement(By.xpath(".//*[@id='panel0']/div/div/div/div[2]/section/div[4]/div[2]/div[3]/form/button"), 20).click();


        System.out.println("Arrival Airport set to LHR");


    }

    @Then("^he should be shown the cheapest return ticket from DXB to LHR$")
    public void he_should_be_shown_the_cheapest_return_ticket_from_DXB_to_LHR() {
        // Write code here goes to next page and fetches the price for the tickets shown.

        waitForElement(By.xpath(".//*[@id='panel0']/div/div/div/div[2]/section/div[4]/div[2]/div[3]/form/button"), 20).click();

        String price = waitForElement(By.xpath("//span[@class='carrier-imposed-curr carrier-imposed-span']"), 20).getText();

        System.out.println("Price : " + price);


    }

}

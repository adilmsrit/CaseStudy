package StepDefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
<<<<<<< HEAD
=======
import org.openqa.selenium.chrome.ChromeDriver;
>>>>>>> d6f77908bccc13de7c3e90aa36cf4fa3ea60060e

public class StepDefnition extends CommonFunctions {


<<<<<<< HEAD
  @Given("^that Bill has decided to check available flights$")
  public void that_Bill_has_decided_to_check_available_flights() {
    String baseURL = "https://www.emirates.com/ae/english/";
    driver.get(baseURL);

  }

  @When("^he looks at a return trip from DXB to LHR leaving one week from now$")
  public void he_looks_at_a_return_trip_from_DXB_to_LHR_leaving_one_week_from_now() throws InterruptedException {

    String partialText = "LHR";

    WebElement text = waitForElement(By.xpath("//div[@class='widget__panel js-widget-panel panel-active']//input[@name='Arrival airport']"), 20);
    text.sendKeys("LHR");
=======
    @Given("^that Bill has decided to check available flights$")
    public void that_Bill_has_decided_to_check_available_flights() {

        System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\SeleniumJars\\chromedriver.exe");
        driver = new ChromeDriver();

        String baseURL = "https://www.emirates.com/ae/english/";

        driver.manage().deleteAllCookies();
        driver.manage().window().maximize();

        driver.get(baseURL);

    }

    @When("^he looks at a return trip from DXB to LHR leaving one week from now$")
    public void he_looks_at_a_return_trip_from_DXB_to_LHR_leaving_one_week_from_now() throws InterruptedException {

        String partialText = "LHR";

        WebElement text = waitForElement(By.xpath("//div[@class='widget__panel js-widget-panel panel-active']//input[@name='Arrival airport']"), 20);
        text.sendKeys("LHR");

        Thread.sleep(5000);

        WebElement firstElement = driver.findElement(By.xpath("//div[@class='widget__panel js-widget-panel panel-active']//p[@class='location__airport__acronym to-highlight']"));
        firstElement.click();

       //Select Departing Date using below field.
        waitForElement(By.xpath("//div[@class='widget__panel js-widget-panel panel-active']//eol-calendar[@title='Please choose your departure date']//td[@class='ek-datepicker__day ek-datepicker__today ek-datepicker__day--notselected']"), 20).click();
        //Select return date using below
        waitForElement(By.xpath("//div[@class='widget__panel js-widget-panel panel-active']//eol-calendar[@title='Please choose your departure date']//tbody//td[@data-string='1882018']"), 20).click();
        //Click on submit using below.
        waitForElement(By.xpath("//div[@class='widget__panel js-widget-panel panel-active']//button[@type='submit']//span[text()='Search flights']"), 20).click();
>>>>>>> d6f77908bccc13de7c3e90aa36cf4fa3ea60060e

    Thread.sleep(5000);

<<<<<<< HEAD
    WebElement firstElement = driver.findElement(By.xpath("//div[@class='widget__panel js-widget-panel panel-active']//p[@class='location__airport__acronym to-highlight']"));
    firstElement.click( );

    //Select Departing Date using below field.
    waitForElement(By.xpath("//div[@class='widget__panel js-widget-panel panel-active']//eol-calendar[@title='Please choose your departure date']//td[@class='ek-datepicker__day ek-datepicker__today ek-datepicker__day--notselected']"), 20).click( );
    //Select return date using below
    waitForElement(By.xpath("//div[@class='widget__panel js-widget-panel panel-active']//eol-calendar[@title='Please choose your departure date']//tbody//td[@data-string='1882018']"), 20).click( );
    //Click on submit using below.
    waitForElement(By.xpath("//div[@class='widget__panel js-widget-panel panel-active']//button[@type='submit']//span[text()='Search flights']"), 20).click( );
=======
    }
>>>>>>> d6f77908bccc13de7c3e90aa36cf4fa3ea60060e

    System.out.println("Arrival Airport set to LHR");

<<<<<<< HEAD
  }

  @Then("^he should be shown the cheapest return ticket from DXB to LHR$")
  public void he_should_be_shown_the_cheapest_return_ticket_from_DXB_to_LHR() {
    // Write code here goes to next page and fetches the price for the tickets shown.

    String price = waitForElement(By.xpath("//div[@id='LowestPriceContainer']//span[@class='summary-curr-only']//span[@class='carrier-imposed-curr carrier-imposed-span']"), 20).getText( );

    System.out.println("Price : " + price);

  }
=======
        String price = waitForElement(By.xpath("//div[@id='LowestPriceContainer']//span[@class='summary-curr-only']//span[@class='carrier-imposed-curr carrier-imposed-span']"), 20).getText();

        System.out.println("Price : " + price);
        
    }
>>>>>>> d6f77908bccc13de7c3e90aa36cf4fa3ea60060e

}
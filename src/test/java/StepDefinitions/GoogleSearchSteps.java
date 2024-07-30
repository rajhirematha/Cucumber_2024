package StepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.concurrent.TimeUnit;

public class GoogleSearchSteps {
    WebDriver driver;

    @Given("browser is open")
    public void browser_is_open() {
        System.out.println("Inside step - browser is open");

        ChromeOptions co = new ChromeOptions();
        driver=new ChromeDriver(co);
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
    }

    @And("user is on google search page")
    public void user_is_on_google_search_page() {
        System.out.println("Inside step - user is on google search box");
        driver.get("https://www.google.com");
    }

    @When("user enters a text in the search box")
    public void user_enters_a_text_in_the_search_box() {
        System.out.println("Inside step - User enters text in search box");
        driver.findElement(By.xpath("//*[@id=\"APjFqb\"]")).sendKeys("Seleniumhq");
    }

    @And("hits enter")
    public void hits_enter() {
        System.out.println("Inside step - User hits enter");
driver.findElement(By.xpath("//*[@id=\"APjFqb\"]")).sendKeys(Keys.ENTER);
    }

    @Then("user is navigated to search results")
    public void user_is_navigated_to_search_results() {
        System.out.println("Inside step - User is navigated to search box");
        String title = driver.getTitle();
        System.out.println(title);
        driver.close();
    }

}

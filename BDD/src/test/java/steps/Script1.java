package steps;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Script1 {
	
	
	WebDriver div1;
	@Given("Open chrome browser and url of the application")
	public void open_chrome_browser_and_url_of_the_application() {
	    // Write code here that turns the phrase above into concrete actions
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Harish Reddy\\Downloads\\chromedriver_win32\\chromedriver.exe");
		div1=new ChromeDriver();
		div1.get("https://ksrtc.in/oprs-web/login/show.do");
		div1.manage().window().maximize();
	    System.out.println("Given done");
	}

	@When("Enter Username , password and click on login button")
	public void enter_username_password_and_click_on_login_button() {
	    // Write code here that turns the phrase above into concrete actions
		div1.findElement(By.id("userName")).sendKeys("harishreddy6991@gmail.com");
		div1.findElement(By.id("password")).sendKeys("Harish@778899");
		div1.findElement(By.id("submitBtn")).click();
		div1.close();
	    System.out.println("When done");
	}

	@Then("Success in login")
	public void success_in_login() {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("Then done");
	}
	    
	
	@Given("Open chrome browser and url of the application1")
	public void open_chrome_browser_and_url_of_the_application1() {
	    // Write code here that turns the phrase above into concrete actions
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Harish Reddy\\Downloads\\chromedriver_win32\\chromedriver.exe");
		div1=new ChromeDriver();
		div1.get("https://m.ksrtc.in/oprs-mobile/user/add.do");
		div1.manage().window().maximize();
	    System.out.println("Given done");
	}

	@When("Enter Email , fullname , mobilenumber and click on add button")
	public void enter_email_fullname_mobilenumber_and_click_on_add_button() {
	    // Write code here that turns the phrase above into concrete actions
		div1.findElement(By.id("email")).sendKeys("harishreddy6991@gmail.com");
		div1.findElement(By.id("fullName")).sendKeys("Harishreddy");
		div1.findElement(By.id("mobileNo")).sendKeys("8328641347");
		div1.findElement(By.name("SaveBtn")).click();
		div1.close();
	    System.out.println("When done");
	}

	@Then("Success in add")
	public void success_in_add() {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("Then done");
	} 
	
	
	@Given("Open chrome browser and url of the application2")
	public void open_chrome_browser_and_url_of_the_application2() {
	    // Write code here that turns the phrase above into concrete actions
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Harish Reddy\\Downloads\\chromedriver_win32\\chromedriver.exe");
		div1=new ChromeDriver();
		div1.get("https://ksrtc.in/oprs-web/");
		div1.manage().window().maximize();
	    System.out.println("Given done");
	}

	@When("Enter From , to , departure , return1 and click on search button")
	public void enter_from_to_departure_return1_and_click_on_search_button() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		
		div1.findElement(By.id("fromPlaceName")).sendKeys("Tirup");
		Thread.sleep(1500);
		List<WebElement> list1 = div1.findElements(By.xpath("/html/body/ul[1]/li[1]/a"));
		for(WebElement ele1:list1) {
		if(ele1.getText().equalsIgnoreCase("Tirupathi")){
		ele1.click();
		break;
		}
		}
		div1.findElement(By.id("toPlaceName")).sendKeys("Ane");
		Thread.sleep(1500);
		List<WebElement> list2 =div1.findElements(By.xpath("/html/body/ul[2]/li/a"));
		for(WebElement ele2:list2) {
		if(ele2.getText().equalsIgnoreCase("Anekal")){
		ele2.click();
		break;
		}
		}
		JavascriptExecutor jse1=(JavascriptExecutor) div1;
		jse1.executeScript("document.getElementById('txtJourneyDate').value='21/01/2022'");
		JavascriptExecutor jse2=(JavascriptExecutor) div1;
		jse2.executeScript("document.getElementById('txtReturnJourneyDate').value='25/01/2022'");
		div1.findElement(By.xpath("/html/body/main/form/div[1]/div/div[2]/div[3]/button")).click();
		
		
		JavascriptExecutor jse3=(JavascriptExecutor) div1;
		jse3.executeScript("scroll(0,550)");
	    System.out.println("When done");
	}

	@Then("Success in search")
	public void success_in_search() {
	    // Write code here that turns the phrase above into concrete actions
	   System.out.println("Then done");
	}
}

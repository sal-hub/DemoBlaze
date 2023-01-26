package DemoblezStepDep;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDep_Demoblez {
  static WebDriver driver;
  static String URL = "https://demoblaze.com/";
	
	@Given("^User lunch demoblaze url$")
	public void user_lunch_demoblaze_url()  {
		
		System.setProperty("webdriver.chrome.driver","C://Program Files//eclipse//chromedriver_win32//chromedriver.exe");
	   driver= new ChromeDriver();
	   driver.get(URL);
	   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	   driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
	   driver.manage().window().maximize();
	   driver.manage().deleteAllCookies();
	   
	   System.out.println("This is the window id :" + driver.getWindowHandle());
	   
	   System.out.println("This is the  title of the window :" + driver.getTitle());
	   
	   System.out.println("This is the current url  :" + driver.getCurrentUrl());
	   
	}

	@When("^User clicks on phone and adds to the cart and back to the homepage$")
	public void user_clicks_on_phone_and_adds_to_the_cart_and_back_to_the_homepage() throws Exception  {
		
		WebElement categoryPhone = driver.findElement(By.linkText("Phones"));
		categoryPhone.click();
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		js.executeScript("scroll(0,500)");
		
		WebElement item1 = driver.findElement(By.linkText("Iphone 6 32gb"));
		item1.click();
		
		Thread.sleep(2000);
		
		WebElement addBtn= driver.findElement(By.linkText("Add to cart"));
		addBtn.click();
		Thread.sleep(2000);
		
		driver.switchTo().alert().accept();
		
		WebElement home = driver.findElement(By.xpath("//li[@class='nav-item active']"));
		
		home.click();
		
	   
	}

	@When("^User clicks on laptops category and  adds a laptop to the cart then back to the homepage$")
	public void user_clicks_on_laptops_category_and_adds_a_laptop_to_the_cart_then_back_to_the_homepage() throws Exception  {
		
		WebElement laptopsCategory = driver.findElement(By.linkText("Laptops"));
		laptopsCategory.click();
      JavascriptExecutor js = (JavascriptExecutor)driver;
		
		js.executeScript("scroll(0,600)");
		
		WebElement item2 = driver.findElement(By.xpath("//a[text()='MacBook Pro']"));
		item2.click();
		
      Thread.sleep(2000);
		
		WebElement addBtn= driver.findElement(By.linkText("Add to cart"));
		addBtn.click();
		Thread.sleep(2000);
		
		driver.switchTo().alert().accept();
		
		WebElement home = driver.findElement(By.xpath("//li[@class='nav-item active']"));
		
		home.click();
		
	}

	@When("^User clicks on the monitor category and adds  a monitor to the cart then clicks on the cart link$")
	public void user_clicks_on_the_monitor_category_and_adds_a_monitor_to_the_cart_then_clicks_on_the_cart_link() throws Exception {
		
     JavascriptExecutor js = (JavascriptExecutor)driver;
		
		js.executeScript("scroll(0,500)");
		
		WebElement monitorsCategory = driver.findElement(By.linkText("Monitors"));
		monitorsCategory.click();
		
	   WebElement item3 = driver.findElement(By.linkText("ASUS Full HD"));
	   item3.click();
	   
	   Thread.sleep(2000);
		
		WebElement addBtn= driver.findElement(By.linkText("Add to cart"));
		addBtn.click();
		Thread.sleep(2000);
		
		driver.switchTo().alert().accept();
		
		Thread.sleep(2000);
		
		WebElement cartLink = driver.findElement(By.id("cartur"));
		cartLink.click();
	}

	@Then("^User clicks on place order button and fills up the necessary info and click on the purchase button$")
	public void user_clicks_on_place_order_button_and_fills_up_the_necessary_info_and_click_on_the_purchase_button() throws Exception {
		
		WebElement placeOrderBtn = driver.findElement(By.xpath("//button[@data-target='#orderModal']"));
		placeOrderBtn.click();
		
		WebElement nameField = driver.findElement(By.xpath("//*[@id=\"name\"]"));
		nameField.sendKeys("Nuri");
		
		WebElement countryField = driver.findElement(By.xpath("//*[@id='country']"));
		countryField.sendKeys("Swiss");
		
		WebElement cityField = driver.findElement(By.xpath("//*[@id='city']"));
		cityField.sendKeys("Bale");
		
		
		WebElement creditCardField = driver.findElement(By.xpath("//*[@id='card']"));
		creditCardField.sendKeys("MasterCard");
		
		WebElement monthField = driver.findElement(By.xpath("//*[@id='month']"));
		monthField.sendKeys("November");
		
		WebElement yearField = driver.findElement(By.xpath("//*[@id='year']"));
		yearField.sendKeys("2022");
		
		Thread.sleep(2000);
		
		WebElement purchaseBtn = driver.findElement(By.xpath("//*[text()='Purchase']"));
		purchaseBtn.click();
		
		Thread.sleep(2000);
		
		
	}

	@Then("^User gets a thank you message and clicks on the ok button$")
	public void user_gets_a_thank_you_message_and_clicks_on_the_ok_button() throws Exception {
		
	   WebElement verify =driver.findElement(By.xpath("//h2[text()='Thank you for your purchase!']"));
	   
	   System.out.println(verify.getText());
	   
	   Thread.sleep(2000);
	   
	  WebElement okBtn = driver.findElement(By.xpath("//button[text()='OK']"));
	  okBtn.click();
	}

	@Then("^User closes the URL$")
	public void user_closes_the_URL()  {
		driver.quit();
	   
	}
}

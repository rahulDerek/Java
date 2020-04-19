package interviewQuestionsAndAnswers;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Test678 {
	WebDriver driver;
	
	@BeforeMethod
	public void setUp(){
		
		driver =new FirefoxDriver();
	}
	
	@AfterMethod
	public void tearDown(){
		
		driver.close();
	
		driver.quit();
	}
	
	@Test(priority=0)
	public void amazonT()throws Exception
	
	{
		WebDriverWait wait =new WebDriverWait(driver,20);
			
		driver.get("http://www.amazon.com");
		
		driver.manage().window().maximize();
		Thread.sleep(3000);
	
		String searchBoxXp="//input[@id='twotabsearchtextbox']";
				
		WebElement searchBox =wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(searchBoxXp)));
		
		
		//Clear the Search text box
		searchBox.clear();
	
		searchBox.sendKeys("book");

		searchBox.sendKeys(Keys.RETURN);
		
		Thread.sleep(2000);
		
		/*String button12="//input[@class='nav-input' @type='submit']";
		
		WebElement clickButton =driver.findElement(By.xpath(button12));
		
		clickButton.click();
		*/
		
		//Verify the title of the page
		
		String title =driver.getTitle();
		
		System.out.println(title);
		
		Assert.assertTrue(driver.getTitle().contains("Amazon.com: book:"));
		
		
		//Click the first Element on the product listings page
				
		String firstEleXpath="//h2[contains(@class,'a-size-medium')]";
		
		WebElement firstEle=wait.until(ExpectedConditions.elementToBeClickable(By.xpath(firstEleXpath)));
		
		String bookSelect = firstEle.getText();
	
		firstEle.click();
		Thread.sleep(1000);
		
		//on the product details page verify the title of the book selected on PLP
		
		String productTitleXpath="//span[@id='productTitle']";
		
		WebElement productTitlePDP =wait.until(ExpectedConditions.elementToBeClickable(By.xpath(productTitleXpath)));
		
		Assert.assertTrue(productTitlePDP.getText().equals(bookSelect));
		
	}
	
	
}

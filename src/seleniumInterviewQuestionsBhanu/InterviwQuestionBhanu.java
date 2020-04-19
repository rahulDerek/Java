package seleniumInterviewQuestionsBhanu;

import java.io.File;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Point;
//import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import com.gargoylesoftware.htmlunit.javascript.background.JavaScriptExecutor;

public class InterviwQuestionBhanu {
	
	private static final int OutputType = 0;
	WebDriver driver;
	
	public boolean isAlertPresent(){
		
		try{
			driver.switchTo().alert();
			return true;
			
			
		}
		catch(Exception e){
			return false;
			
			
		}
	}
	
	@Test
	public void allSeleniumInterviewQuestion()
	{
		driver =new FirefoxDriver();
		
		driver.switchTo().alert().accept();
		driver.switchTo().alert().dismiss();
		
		
	Alert text = driver.switchTo().alert();
	System.out.println(text.getText());
	
	System.out.println("-------------------------------------");
	
	//how to select a frame
	driver.switchTo().frame(0);
	driver.switchTo().frame("frame");
	driver.switchTo().frame(driver.findElement(By.xpath("")));
	
	System.out.println("=======================================");
	//window handles
	   String pwindow = driver.getWindowHandle();
	   
	    Set<String> allwindows = driver.getWindowHandles();
	    Iterator<String> allwindow =allwindows.iterator();
	    
		String ParentWindow =allwindow.next();
		driver.switchTo().window(ParentWindow);
		String childWindow =allwindow.next();
		driver.switchTo().window(childWindow);
		driver.switchTo().defaultContent();
		System.out.println("-----------------------------------");
		
		//Wait statements
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		//Explicitly wait
		//pop up appears
		
		WebDriverWait wait =new WebDriverWait(driver,30);
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("xpathExpression")));
		
		System.out.println("-----------------------------------------");
		
		//Mouse over
		
		Actions act =new Actions(driver);
		act.moveToElement(driver.findElement(By.xpath("xpathExpression"))).build().perform();
		System.out.println("-------------------------------");
		
		//Drop down
		
		Select sel =new Select(driver.findElement(By.xpath("xpathExpression")));
		
		sel.selectByIndex(8);
		
		sel.selectByValue("value");
		sel.selectByVisibleText("text");
		
		//how to select all the options
		
	     List<WebElement> options=sel.getOptions();
	     
	     System.out.println("------------------------------------------");
	     
	     //Drag and drop
	     
	     Actions act1 =new Actions(driver);
	     
	     act1.dragAndDrop(driver.findElement(By.xpath("xpathExpression")), driver.findElement(By.xpath("xpathExpression")));
	     
	     System.out.println("-----------------------------------------------------");
	     
	     //Screenshot
	     
	 /*  File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	   
	   File srcFile;
	   File  destFile=new File("C:\\test\\screenshot\\fail.png");
	   FileUtils.copyFile(srcFile, destFile);*/
	   
	     //x and y coordinates
	   driver.manage().window().getPosition().getX();
	   driver.manage().window().getPosition().getY();
	   
	   //one more way
	   Point positiont = driver.manage().window().getPosition();
	   positiont.getX();
	   positiont.getY();
	   
	   System.out.println("----------------------------------------------");
	   
	   //forward and backward
	   
	   driver.navigate().forward();
	   driver.navigate().back();
	   
	   System.out.println("-----------------------------------------------");
	   
	   //current url and get title
	   
	   String currentURL=driver.getCurrentUrl();
	   
	   driver.getTitle();
	   
	   System.out.println("-----------------------------");
	   
	   //how to find similar objects in size
	   
	   int size =driver.findElements(By.xpath(currentURL)).size();
		
		System.out.println("----------------------------------------------");
		
		//to find out the elements following
		
		driver.findElements(By.xpath("@id[@name='Test']/following-sibling::td[2]"));
		
		driver.findElements(By.xpath("@id[@name='Test']/preceding-sibling::td[2]"));
		
		driver.findElements(By.xpath("@id[@name='Test']/child::td[2]"));
		
		System.out.println("------------------------------");
		
		//you have similar elements present in the UI.Select the 5 the element
		
		driver.findElements(By.xpath("xpathExpression")).get(5);
		
		System.out.println("-----------------------------------");
		
		driver.findElement(By.xpath("xpathexpression")).isSelected();
		driver.findElement(By.xpath("xpathexpression")).isDisplayed();
		
		driver.findElement(By.xpath("xpathexpression")).isEnabled();
		
		System.out.println("------------------------------");
		//How to execute javascript executor 
		
		JavaScriptExecutor JavascriptExecutor = (JavaScriptExecutor)driver;
		//JavaScriptExecutor.executeScript("return window.length");
		
		System.out.println("=============================");
		
		driver.manage().window().maximize();
		driver.get("");
		
		System.out.println("---------------------");
		
		// /
		
		System.out.println(driver.findElement(By.xpath("xpathExpression")).getAttribute("name"));
		
		driver.findElement(By.xpath("xpathExpression")).sendKeys(Keys.ENTER);
		
		
	}

}

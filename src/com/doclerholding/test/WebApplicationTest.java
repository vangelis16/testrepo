package com.doclerholding.test;

import java.util.List;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.doclerholding.test.messages.DoclerHoldingTestMessages;

/**
 * From "Sign in" tab fill the fields "E-mail address", "Password" and press "Sign in" button.
 * 
 * @author Angel
 *
 */
public class WebApplicationTest extends DoclerHoldingTest { 
	

	public static final String TEST_WELCOME_EMAIL = "Welcome to the Docler Holding QA Department";
	public static final String TEST_ERROR_CODE = "404 Error: File not found :-(";
	
	/** 
	 *  Test Home page - click on "Home" button, check the welcome message and check logo 
	 * 
	 * @throws InterruptedException
	 */
	@Test
	public void  testHomePage() throws Exception {
		openBrowser();
		//click on Home button
		driver.findElement(By.id("home")).click();
		//check for welcome message is displayed
		List<WebElement> listItems1 = driver.findElements(By.tagName("h1"));
		for (int i = 0; i < listItems1.size(); i++) {
			WebElement elem = listItems1.get(i);
			String text = elem.getText();
			if (text.indexOf(TEST_WELCOME_EMAIL) != -1) {
				writeMessage(DoclerHoldingTestMessages.TEST_WELCOME_EMAIL);
				break;
			}
		}
		//check second message is displayed 
		WebElement elem1 = driver.findElement(By.className("lead"));
		if (elem1.isDisplayed()) {
			writeMessage(DoclerHoldingTestMessages.TEST_SECOND_MESSAGE);
		}
		//check logo is visible
		WebElement elem2 = driver.findElement(By.id("dh_logo"));
		if (elem2.isEnabled()) {
			writeMessage(DoclerHoldingTestMessages.TEST_LOGO);
		}
		Thread.sleep(3000);
		closeBrowser();
		
	}
	/**
	 *  Test Form page - click on Form button, populate the field, submit the form and check the text messages  
	 *  
	 * @throws Exception
	 */
	@Test
	public void testFormPage () throws Exception {
		openBrowser();
		//click on form button
		driver.findElement(By.id("form")).click();
		// check that user is on Form page
		String currentURL = driver.getCurrentUrl(); 
		if (currentURL.indexOf("form.html") != -1) { 
			writeMessage(DoclerHoldingTestMessages.TEST_FORM_BUTTON);
		}
		// find and populate input field with first name
		driver.findElement(By.id("hello-input")).sendKeys("John");
		// press Go button 
		driver.findElement(By.id("hello-submit")).click();
		// check that user is on Hello page
		String currentURL1 = driver.getCurrentUrl(); 
		if (currentURL1.indexOf("hello.html") != -1) { 
			writeMessage(DoclerHoldingTestMessages.TEST_HELLO_PAGE);
		}
		// check the text
		WebElement elem1 = driver.findElement(By.id("hello-text"));
		if (elem1.isDisplayed()) {
			writeMessage(DoclerHoldingTestMessages.TEST_TEXT_1);
		}
		Thread.sleep(2000);
		// go to form page
		driver.get("http://uitest.duodecadits.com/form.html");
		// find and populate input field with second name
		driver.findElement(By.id("hello-input")).sendKeys("Sophia");
		// press Go button 
		driver.findElement(By.id("hello-submit")).click();
		// check the text
		WebElement elem2 = driver.findElement(By.id("hello-text"));
		if (elem2.isDisplayed()) {
			writeMessage(DoclerHoldingTestMessages.TEST_TEXT_2);
		}
		Thread.sleep(2000);
		// go to form page
		driver.get("http://uitest.duodecadits.com/form.html");
		// find and populate input field with third name
		driver.findElement(By.id("hello-input")).sendKeys("Charlie");
		// press Go button 
		driver.findElement(By.id("hello-submit")).click();
		// check the text
		WebElement elem3 = driver.findElement(By.id("hello-text"));
		if (elem3.isDisplayed()) {
			writeMessage(DoclerHoldingTestMessages.TEST_TEXT_3);
		}
		Thread.sleep(2000);
		// go to form page
		driver.get("http://uitest.duodecadits.com/form.html");
		// find and populate input field with fourth name
		driver.findElement(By.id("hello-input")).sendKeys("Emily");
		// press Go button 
		driver.findElement(By.id("hello-submit")).click();
		// check the text
		WebElement elem4 = driver.findElement(By.id("hello-text"));
		if (elem4.isDisplayed()) {
			writeMessage(DoclerHoldingTestMessages.TEST_TEXT_4);
		}
		Thread.sleep(3000);
		closeBrowser();
	}
	/**
	 *  Test Error page - click on "Error" button and check error message
	 * 
	 * @throws Exception
	 */
	@Test
	public void testErrorPage() throws Exception {
		openBrowser();
		//press Error button
		driver.findElement(By.id("error")).click();
		//check  404 HTTP response code
		List<WebElement> listItems1 = driver.findElements(By.tagName("h1"));
		for (int i = 0; i < listItems1.size(); i++) {
			WebElement elem = listItems1.get(i);
			String text = elem.getText();
			if (text.indexOf(TEST_ERROR_CODE) != -1) {
				writeMessage(DoclerHoldingTestMessages.TEST_ERROR_MESSAGE);
				break;
			}
		}
		Thread.sleep(3000);
		closeBrowser();
	}
}




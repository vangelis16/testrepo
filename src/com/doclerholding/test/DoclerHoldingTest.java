package com.doclerholding.test;

import java.io.File;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;

import com.doclerholding.test.messages.DoclerHoldingTestConstants;
import com.doclerholding.writer.DoclerHoldingMessageWriter;

/** 
 * open new Firefox browser 
 * 
 * @author Angel
 *
 */
public class DoclerHoldingTest {

	public WebDriver driver = null;
	public DoclerHoldingMessageWriter doclerholdingMessageWriter;
	
	public DoclerHoldingTest() {
		doclerholdingMessageWriter = new DoclerHoldingMessageWriter(DoclerHoldingMessageWriter.DOCLERHOLDING_CONSOLE_MODE);
	}
	
	public void writeMessage(String message) throws Exception {
		doclerholdingMessageWriter.writeMessage(message);
	}
	
	public void openBrowser() {
		FirefoxProfile profile = new FirefoxProfile();
		FirefoxBinary binary = new FirefoxBinary(new File("C://Program Files (x86)//Mozilla Firefox//firefox.exe"));
		driver = new FirefoxDriver(binary,profile);   
		driver.manage().window().maximize();
		driver.get(DoclerHoldingTestConstants.SERVER_URL);
	}	
	
	public void closeBrowser() {
		driver.quit();
	}
	
}


package com.doclerholding.test;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
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
		doclerholdingMessageWriter = new DoclerHoldingMessageWriter(null, DoclerHoldingMessageWriter.DOCLERHOLDING_CONSOLE_MODE);
	}
	
	public void setMessageWriter(DoclerHoldingMessageWriter doclerholdingMessageWriter) {
		this.doclerholdingMessageWriter = doclerholdingMessageWriter;
	}
	
	public void writeMessage(String message) throws Exception {
		doclerholdingMessageWriter.writeMessage(message);
	}
	
	public void openBrowser() {
		FirefoxProfile profile = new FirefoxProfile();
		FirefoxBinary binary = new FirefoxBinary(new File("C://Program Files//Mozilla Firefox//firefox.exe"));
		driver = new FirefoxDriver(binary,profile);   
		driver.manage().window().maximize();
		driver.get(DoclerHoldingTestConstants.SERVER_URL);
	}	
	
	public void closeBrowser() {
		driver.quit();
	}
	
}


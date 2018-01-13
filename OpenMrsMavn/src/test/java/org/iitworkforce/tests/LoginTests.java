package org.iitworkforce.tests;

import java.io.IOException;

import org.iitworkforce.util.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

/***
 * 
 * 
 * Objective
 * Test Steps
 * 1. 
 * method1: name 
 * 
 *
 */
public class LoginTests 
{
	static ChromeDriver driver;

	@BeforeClass
	public void loadConfiguration() throws IOException
	{
		Utility.readPropertyFile();
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://demo.openmrs.org/openmrs/htmlformentryui/htmlform/enterHtmlFormWithSimpleUi.page?patientId=070f0120-0283-4858-885d-a20d967729cf&visitId=e6c1842d-a4d6-4081-9982-eae4b60d9134&definitionUiResource=referenceapplication:htmlforms/vitals.xml&returnUrl=%2Fopenmrs%2Fcoreapps%2Fclinicianfacing%2Fpatient.page%3FpatientId%3D57%26");
		driver.manage().window().fullscreen();

	}
	@Test
	public static void login() throws InterruptedException {


		//Enter username
		driver.findElement(By.id(Utility.pro.getProperty("uname_id"))).sendKeys("Admin");

		//Enter password
		driver.findElement(By.id("password")).sendKeys("Admin123");

		//Click inpatientWard
		driver.findElement(By.id("Inpatient Ward")).click();

		driver.findElement(By.id("loginButton")).submit();


		Thread.sleep(5000);

		driver.findElement(By.linkText("Logout")).click();

		//		HashMap<String,Double> vitalMapData = new HashMap<String,Double>();
		//		vitalMapData.put("Height (cm)", 7.5);
		//		 
		//		//fillVitalInfo(vitalMapData);
		//		
		//		List<WebElement> patientInfo = driver.findElements(By.xpath(".//*[@id='formBreadcrumb']/li[1]/ul/li/span"));
		//		for(int i=0;i<1;i++)
		//		{
		//			patientInfo.get(i).click();
		//			Thread.sleep(2000);
		//			System.out.println(patientInfo.get(i).getText());
		//			System.out.println(vitalMapData.get(patientInfo.get(i).getText()));
		//			
		//		}
		//		
		//		
		//		
		//		
		//		
		String actual = driver.findElement(By.cssSelector("#home-container>h4")).getText();

		String expected= "Logged in as Super User () at Inpatient Ward.";

		int actualLength = actual.length();

		int expectedLength =expected.length();


		System.out.println(actual +"--" + actualLength);
		System.out.println(expected+"--"+expectedLength);

		if(actual.equals(expected))
		{
			System.out.println("TC Pass");
		}
		else
		{
			System.out.println("TC fails");
		}
		////		//Updating the General Medicine
		////		String name="General Medicine";
		////		String updatedName="General Medicine Symptom";
		////		List<WebElement> tdList = driver.findElements(By.xpath(".//*[@id='appointmentTypesTable']/tbody/tr/td[1]"));
		////		for(int i =0 ; i< tdList.size();i++)
		////		{
		////			if(tdList.get(i).getText().contains("General Medicine"))
		////			{
		////				driver.findElement(By.id("appointmentschedulingui-edit-"+name)).click();
		////				Thread.sleep(5000);
		////				driver.findElement(By.id("name-field")).clear();
		////				driver.findElement(By.id("name-field")).sendKeys(updatedName);
		////				driver.findElement(By.id("description-field")).clear();
		////				driver.findElement(By.id("description-field")).sendKeys(updatedName);
		////				driver.findElement(By.id("save-button")).click();
		////				Thread.sleep(5000);
		////				driver.findElement(By.id("appointmentschedulingui-edit-"+updatedName)).click();
		////				break;
		////			}
		////		}
		//		
		////		
		////		List<WebElement> tdList = driver.findElements(By.xpath("//table//tr/td[4]"));
		////		
		////		for(int i = 0 ; i<tdList.size();i++)
		////		{
		////			 
		////			if(tdList.get(i).getText().trim().length()>0 && tdList.get(i).getText().trim().contains("Nov"))
		////			{
		////				driver.findElement(By.xpath("//table//tr["+i+"]/td[2]")).click();
		////			}
		////		}
		////		
		////		driver.findElement(By.id("coreapps-activeVisitsHomepageLink-coreapps-activeVisitsHomepageLink-extension")).click();
		////		//driver.close();
		////		
		//	}
		//	public static void fillVitalInfo(HashMap<String,Double> map)
		//	{
		//		List<WebElement >vitalsList = driver.findElements(By.xpath(".//*[@id='formBreadcrumb']/li[1]/ul/li/span"));
		//		for(int i =0;i<vitalsList.size();i++)
		//		{
		//			System.out.println("Vital Info :: " + vitalsList.get(i).getText());
		//			System.out.println("//h3[text()='"+vitalsList.get(i).getText()+"']/parent::fieldset/child::p//input");
		//			System.out.println("map data:::" + map.get(vitalsList.get(i).getText()).toString());
		//			driver.findElement(By.
		//					xpath("//h3[text()='"+vitalsList.get(i).getText()+"']/parent::fieldset/child::p//input")).
		//			         sendKeys(map.get(vitalsList.get(i).getText()).toString());
		//		}
	}

}

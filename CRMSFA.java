package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CRMSFA {

	public static void main(String[] args) {
WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/control/main");
	WebElement elementUsername=driver.findElement(By.id("username"));
	elementUsername.sendKeys("Demosalesmanager");
	WebElement elementPassword = driver.findElement(By.id("password"));
	elementPassword.sendKeys("crmsfa");
	WebElement elementLoginButton = driver.findElement(By.className("decorativeSubmit"));
	elementLoginButton.click();
 WebElement elementCRMSFA = driver.findElement(By.linkText("CRM/SFA"));
 elementCRMSFA.click();
 WebElement elementLeads = driver.findElement(By.linkText("Leads"));
 elementLeads.click();
 WebElement elementCreateLead = driver.findElement(By.linkText("Create Lead"));
 elementCreateLead.click();
 WebElement elementCompanyName = driver.findElement(By.id("createLeadForm_companyName"));
 elementCompanyName.sendKeys("ivanti");
 WebElement elementFirstName = driver.findElement(By.id("createLeadForm_firstName"));
 elementFirstName.sendKeys("prithivee");
 WebElement elementLastName = driver.findElement(By.id("createLeadForm_lastName"));
 elementLastName.sendKeys("raj");
 WebElement elementDropDown = driver.findElement(By.id("createLeadForm_dataSourceId"));
 Select dd= new Select(elementDropDown);
 dd.selectByVisibleText("Employee");
 driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("prithivee");
 driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("Automation");
 driver.findElement(By.id("createLeadForm_description")).sendKeys("New to Automation");
 driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("Prithivee2498@gmail.com");
 WebElement elementDrop = driver.findElement(By.id("createLeadForm_generalCountryGeoId"));
 Select Drop=new Select(elementDrop);
 Drop.selectByVisibleText("India");
 System.out.println("Title of the page is"+driver.getTitle());
 
 WebElement elementCreate = driver.findElement(By.className("smallSubmit"));
 elementCreate.click();
 System.out.println("Title of the page is"+driver.getTitle());
 
	}

}

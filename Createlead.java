package week2assignment;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Createlead {
public static void main(String[] args) throws InterruptedException {
		

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps");
		driver.manage().window().maximize();
		driver.findElementById("username").sendKeys("Demosalesmanager");
		driver.findElementById("password").sendKeys("crmsfa");
		driver.findElementByClassName("decorativeSubmit").click();
	    driver.findElementByLinkText("CRM/SFA").click();
		driver.findElementByLinkText("Leads").click();
		driver.findElementByLinkText("Create Lead").click();
		driver.findElementByXPath("//input[@id='createLeadForm_companyName']").sendKeys("zzyyxx");
		driver.findElementByXPath("//input[@id='createLeadForm_firstName']").sendKeys("pooja");
		driver.findElementByXPath("//input[@id='createLeadForm_lastName']").sendKeys("v");
		WebElement no1 = driver.findElementById("createLeadForm_dataSourceId");
		Select option1 =new Select (no1);
		option1.selectByValue("LEAD_EMPLOYEE");
		driver.findElementByXPath("//input[@id='createLeadForm_annualRevenue']").sendKeys("100000");
		WebElement no2 = driver.findElementById("createLeadForm_industryEnumId");
		Select option2 = new Select(no2);
		option2.selectByIndex(3);
		WebElement no3 = driver.findElementById("createLeadForm_ownershipEnumId");
		Select option3 =new Select(no3);
		option3.selectByVisibleText("S-Corporation");
		driver.findElementById("createLeadForm_description").sendKeys("Selenium Automation Tester");
		WebElement no4 = driver.findElementById("createLeadForm_marketingCampaignId");
		Select option4 = new Select( no4);
		option4.selectByIndex(6);
		WebElement no5 = driver.findElementById("createLeadForm_generalStateProvinceGeoId");
		Select option5 = new Select(no5);
		option5.selectByValue("TX"); 
		driver.findElementById("createLeadForm_primaryEmail").sendKeys("xxyyzz@email.com");
		driver.findElementById("createLeadForm_primaryPhoneNumber").sendKeys("4899498775487");
		driver.findElementByXPath("//input[@class='smallSubmit']").click();
		driver.close();
			}
}

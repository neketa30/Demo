package JavaPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dynamic_Dropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.getProperty("webdrvier.chrome.driver","D:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//driver.get("https://www.spicejet.com/");
		/*driver.findElement(By.id("divpaxinfo")).click();
		Thread.sleep(2000);
		for(int i=0;i<4;i++)
		{
		driver.findElement(By.id("hrefIncAdt")).click();
		}
		//Thread.sleep(2000);
		driver.findElement(By.id("btnclosepaxoption")).click();
		System.out.println(driver.findElement(By.className("paxinfo")).getText());*/
	/*	
		driver
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		driver.findElement(By.xpath("//a[@value='BLR']")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("ctl00_mainContent_ddl_destinationStation1_CTXT")).click();
		driver.findElement(By.xpath("(//a[@value='MAA'])[2]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@id='ctl00_mainContent_ddl_originStation1_CTNR']//a[@value='BLR']")).click();
		Thread.sleep(2000);*/
		//Auto suggestive dropdown
		driver.get("https://www.makemytrip.com/");
		Thread.sleep(2000);
		driver.findElement(By.id("fromCity")).clear();
		//.clear();
		//driver.findElement(By.className("react-autosuggest__input react-autosuggest__input--open")).sendKeys("BLR");
		//driver.findElement(By.className("react-autosuggest__input react-autosuggest__input--open")).sendKeys(Keys.ENTER);	
		
		
	}

}

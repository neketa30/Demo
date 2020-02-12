package JavaPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.spicejet.com/");
		Select s= new Select(driver.findElement(By.name("ctl00$mainContent$DropDownListCurrency")));
		
s.selectByValue("INR");
Thread.sleep(2000);
s.selectByVisibleText("Select");
Thread.sleep(2000);
s.selectByIndex(3);

		

	}

}

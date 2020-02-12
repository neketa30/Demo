package JavaPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Radiobutton_practice {

	public static void main(String[] args) {

System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
WebDriver driver = new ChromeDriver();

driver.get("https://www.spicejet.com/");
int count=driver.findElements(By.xpath("//table[@id='ctl00_mainContent_rbtnl_Trip']//tbody//tr")).size();
System.out.println(count);
	

	}

}

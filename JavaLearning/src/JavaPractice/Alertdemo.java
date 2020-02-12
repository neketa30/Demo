package JavaPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alertdemo {

	public static void main(String[] args) throws InterruptedException {

System.setProperty("webdriver.chrome.driver","D://chromedriver.exe");
WebDriver driver = new ChromeDriver();
driver.get("http://www.tizag.com/javascriptT/javascriptalert.php");
driver.findElement(By.xpath("//div[@class='display']//form//input")).click();
Thread.sleep(2000);
/*driver.switchTo().alert().accept();

//driver.switchTo().alert().dismiss();
System.out.println(driver.switchTo().alert().getText());
*/

	}

}

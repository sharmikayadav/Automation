package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseActions {

	public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new EdgeDriver();
	driver.get("https://demo.guru99.com/test/simple_context_menu.html");
	 // Context click
	Actions Act=new Actions(driver);
	/*WebElement Right=driver.findElement(By.xpath("//*[@id=\"authentication\"]/span"));
	Act.contextClick(Right).perform();
	Thread.sleep(2000);
    driver.findElement(By.xpath("//*[@id=\"authentication\"]/u1/li[3]/span")).click();
	Thread.sleep(4000);
	driver.switchTo().alert().accept(); */

	
	WebElement Double=driver.findElement(By.xpath("//*[@id=\"authentication\"]/button"));
	Act.doubleClick(Double).perform();
	Thread.sleep(3000);
	driver.switchTo().alert().accept();
	
	
	
	}

}

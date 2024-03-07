package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Login {

   public static void main (String[] args) {
   WebDriver driver=new EdgeDriver();
   driver.get("http://demo.guru99.com/v4/");
   driver.findElement(By.name("uid")).sendKeys("mngr26593");
   driver.findElement(By.name("password")).sendKeys("123456!");
   driver.findElement(By.name("btnLogin")).click();
   

  
   }






}




 
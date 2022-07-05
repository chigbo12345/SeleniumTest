package seleniumTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hello {

    public static void main(String[] args)

    {
//     setting up driver properties
      System.setProperty("webdriver.chrome.driver","/Users/chigbo/Downloads/chromedriver");
        WebDriver driver = new ChromeDriver();

        //navigate to mai.google.com
        driver.navigate().to("https://accounts.google.com/");

        //enter email id
        driver.findElement(By.cssSelector("#identifierId")).sendKeys("ctechinnovationss");

        //Click on the next button
        driver.findElement(By.cssSelector("#identifierNext")).click();



    }
}

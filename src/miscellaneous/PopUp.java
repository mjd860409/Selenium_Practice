package miscellaneous;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PopUp {

    public static void main(String[] args) throws InterruptedException{
            System.setProperty("webdriver.chrome.driver", "C:\\Users\\Asus\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
            WebDriver driver = new ChromeDriver();
            driver.get("https://mail.rediff.com/cgi-bin/login.cgi");

            Thread.sleep(4000);

            driver.findElement(By.xpath("//input[@type='submit']")).click();
            Thread.sleep(3000);
            Alert ae = driver.switchTo().alert();

            System.out.println("Text is::"+ae.getText());

            ae.dismiss();


    }
}

package miscellaneous;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class DynamicCheckBoxes {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Asus\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://seleniumpractise.blogspot.com/2016/08/how-to-automate-radio-button-in.html");

        List<WebElement> checkBox = driver.findElements(By.xpath("//input[text()='checkbox']"));

        for (int i = 0; i< checkBox.size(); i++)
        {
          WebElement ele = checkBox.get(i);
          String newEle = ele.getAttribute("id");

          if (newEle.equalsIgnoreCase("code"))
          {
              ele.click();

          }
        }

    }


}

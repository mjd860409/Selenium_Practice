package miscellaneous;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class SpiceJetCheckBoxes {

    public static void main(String[] args) {


        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Asus\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.spicejet.com/");
        driver.manage().window().maximize();
        List<WebElement> list = driver.findElements(By.xpath("//input[@type='checkbox']"));

        System.out.println(list.size());

        for (int i =0; i< list.size(); i++)
        {
           WebElement list1 = list.get(i);

           String newEle = list1.getAttribute("_IndArm");

           if (newEle.equalsIgnoreCase("ctl00_mainContent_chk_IndArm"))
           {
               list1.click();
           }
        }



    }
}

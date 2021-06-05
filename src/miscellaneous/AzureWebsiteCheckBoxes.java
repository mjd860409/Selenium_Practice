package miscellaneous;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class AzureWebsiteCheckBoxes {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Asus\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://itera-qa.azurewebsites.net/home/automation");

        List<WebElement> checkBoxes = driver.findElements(By.xpath("//input[@type='checkbox' and contains(@id,'day')]"));

//        for (int i = 0; i<checkBoxes.size(); i++ )
//        {
//            checkBoxes.get(i).click();
//        }

//        for (WebElement ele:checkBoxes) {
//            String fewCheck = ele.getAttribute("id");
//            if (fewCheck.equals("monday"))
//            {
//                ele.click();
//
//            }


        }

        }





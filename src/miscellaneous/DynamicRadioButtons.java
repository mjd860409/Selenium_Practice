package miscellaneous;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class DynamicRadioButtons {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Asus\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://seleniumpractise.blogspot.com/2016/08/how-to-automate-radio-button-in.html");
        driver.manage().window().maximize();
        List<WebElement> radioButtons = driver.findElements(By.xpath("//input[@name='lang' and @type='radio']"));

        for (int i = 0; i< radioButtons.size(); i++)
        {
            WebElement element = radioButtons.get(i);
            String localRadio = element.getAttribute("value");

            System.out.println("Values from radio buttons are::"+localRadio);

            if (localRadio.equalsIgnoreCase("Java"))
            {
                element.click();
            }
        }


    }
}

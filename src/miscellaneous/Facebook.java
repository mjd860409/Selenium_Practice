package miscellaneous;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class Facebook {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Asus\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("https://www.facebook.com/");
        //Thread.sleep(5000);
        driver.findElement(By.xpath("//div[@class='_6ltg'][2]")).click();

        Select se = new Select(driver.findElement(By.id("month")));
        List<WebElement> dropDowns = se.getOptions();

        for (WebElement element:dropDowns) {
            String text = element.getText();
            System.out.println(text);

        }

        }

    }

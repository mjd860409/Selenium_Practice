import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class MultiSelectDropDown {

    public static void main(String[] args) throws InterruptedException{
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Asus\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml_select_multiple");
        driver.switchTo().frame("iframeResult");
        WebElement cars = driver.findElement(By.id("cars"));
        Select se = new Select(cars);
        se.selectByIndex(1);
        se.selectByValue("volvo");
        se.selectByVisibleText("audi");
        Thread.sleep(3000);
        List<WebElement> selCars = se.getAllSelectedOptions();
        for (WebElement webElement : selCars)
              {
                  System.out.println(webElement.getText());
        }
    }

}

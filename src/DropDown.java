import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Asus\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
        driver.manage().window().maximize();
        WebElement dropDown = driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
        Select select = new Select(dropDown);
        //select.selectByVisibleText("AED");
       // select.selectByIndex(0);
        select.getFirstSelectedOption().getText();
    }
}

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CustomXpath {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "driver.getPageSource()");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.ebay.com/");
        driver.manage().window().maximize();
        //driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Laptops");
        //driver.findElement(By.xpath("//input[contains(@type,'text')]")).sendKeys("Laptops");

//        dynamic id : input

        // starts-with
//        id = test_123
//        id = test_334
//        id = test_567
          // id = test_test_567_test

        /*ends-with
        id = 123_test_t
                id = 4567_test_t*/


        /*driver.findElement(By.xpath("//input[contains,(@id, 'test_')]")).sendKeys("Test");
        driver.findElement(By.xpath("//input[starts-with(@id, 'test')]")).sendKeys("Test");
        driver.findElement(By.xpath("//input[ends-with(@id, ''test)]")).sendKeys("test");

        // xpath for links
*/
        driver.findElement(By.xpath("//a[contains(text(),' Help & Contact')]")).click();
        driver.close();

    }
}

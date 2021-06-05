import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class GetLinkText {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Asus\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");        WebDriver driver = new ChromeDriver();
        driver.get("https://www.ebay.com/");
        List<WebElement> linkList =  driver.findElements(By.tagName("a"));
        System.out.println("Number of links present is:::"+linkList);

        for (int i = 0; i<linkList.size(); i++){
          String linkText = linkList.get(i).getText();
            System.out.println("Texts available in the webpage are::"+linkText);
        }
    }
}

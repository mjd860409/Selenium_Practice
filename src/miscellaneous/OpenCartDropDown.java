package miscellaneous;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class OpenCartDropDown {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Asus\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.opencart.com/index.php?route=account/register&__cf_chl_jschl_tk__=c32a35f85ff2df0c62e5409cda27db46d3d8c99c-1617171427-0-AWAn8Nct2rb9LEpcddxmClDnIBWFTtkfjeTAXb6F-PtQ4_Uw6uOZ1pxD0JlD0otZjGPqxFGLkOIe_z0P-zFomBG9yXfx4uurQFiFLkTzVjEGxRSucWpBENd8U3cnz7F7bjKNdf2jdxJNUJZwHQkXXI7e5pCgykAnLkSHBTGeMZqGi_JgyIh9gvnlx4129jP0iWnJiEHfWoscuD8ZG8MYV0uDLqAO3B7ZWXCSgmG0_fmEp0IAvuUPzD7IXs_OwztTG4wlc-N5CM7i-3GzYAHMNX-Su7yUDnTERZSWDU6PS4xXC5nFlD4F6GDGAlYg67eoI92PYD2berpuLL0Zjl1IWJeZV4ySPRIGVAZ9ozY2FFSN_0phQIi5qwBh47et51JXcorO7-6MJ08TVZKe5Q8AHh_cJxpXiK_8g-OHVkTiCBDjseBIPD30iQXpQ-E_HpqlIQs48AbDM9rg-_uz27MZrU8_Jb8vkOKrJUn0IAih6Dna");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        Select se = new Select(driver.findElement(By.id("input-country")));
        List<WebElement> options = se.getOptions();

        for (WebElement option:options)
        {
         if (option.getText().equals("Argentina"))
         {
             option.click();
         }
        }

    }

}

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPopUp {

    public static void main(String[] args)throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Asus\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
        driver.findElement(By.name("proceed")).click();
        Thread.sleep(3000);
        Alert alert = driver.switchTo().alert();
        System.out.println(alert.getText());
        String text = alert.getText();
        if (text.equals("Please enter a valid user name"))
        {
            System.out.println("alert message is correct");
        }
        else {
            System.out.println("alert message is incorrect");
        }
        alert.accept();
        driver.quit();

    }
}

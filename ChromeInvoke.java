import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeInvoke {
public static void main(String[] args) throws InterruptedException {
	
	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
	
	WebDriver driver  = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demo.guru99.com/");
	
	driver.findElement(By.name("emailid")).sendKeys("abc@gmail.com");
	driver.findElement(By.name("btnLogin")).click();
	Thread.sleep(5000);
	driver.close();
}
}

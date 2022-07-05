import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumConfig {

    public static void main(String[] args){

        System.setProperty("webdriver.chrome.driver","D:\\Code_projects\\drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        String url = "https://www.wikipedia.org/";
/*        // Locate by class
        // The whole class name is : "pure-button pure-button-primary-progressive"
        driver.get("https://www.wikipedia.org/");
        driver.findElement(By.className("pure-button-primary-progressive")).click();
*/
/*        // Locate by id
       driverGet(driver,url);
       driver.findElement(By.id("js-link-box-en")).click();
*/




    }
    protected static void driverGet(WebDriver driver, String url){
        driver.get(url);
    }
}

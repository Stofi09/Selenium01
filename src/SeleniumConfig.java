import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.sql.SQLOutput;
import java.time.Duration;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

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

/*        // Click on cookie
        driverGet(driver,"https://www.amazon.co.uk/");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
       driver.findElement(By.id("a-autoid-0")).click();
*/
/*        // Click on cookies
        driverGet(driver, "https://en-gb.facebook.com/");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        List<WebElement> elements = driver.findElements(By.tagName("button"));
        elements.forEach(webElement -> {
            System.out.println(webElement.getText());
            if (webElement.getText().equalsIgnoreCase("Allow essential and optional cookies")){
              System.out.println("sikerult");
              webElement.click();
            }
        });
*/

/*        // getTitle,getUrl,getPageSource, close
        driverGet(driver,url);
        var title = driver.getTitle();
        var currentUrl = driver.getCurrentUrl();
        var pageSource = driver.getPageSource();
        System.out.println("Title: " + title + " Url: " + currentUrl + " Source :" + pageSource);
        driver.close(); // Closes the browser without ending the session or killing the driver instance.
        driver.quit();  // Kills your session and the driver instance and of course closes the browser window.
*/

    // Practice exercise 1
        driverGet(driver, url);
        System.out.println(driver.getTitle() + " " + driver.getTitle().length());
        System.out.println(driver.getCurrentUrl().equalsIgnoreCase(url));
        System.out.println(driver.getPageSource().length());
        driver.quit();
    }
    protected static void driverGet(WebDriver driver, String url) {driver.get(url);}
}

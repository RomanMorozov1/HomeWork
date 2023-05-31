import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonBuyer {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.amazon.com/");
        driver.findElement(By.id("twotabsearchtextbox"));
        driver.findElement(By.id("twotabsearchtextbox")).click();
        Thread.sleep(1000);
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("macbook pro 14 2023");
        Thread.sleep(1000);
        driver.findElement(By.id("nav-search-submit-button")).click();
        Thread.sleep(1000);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        //js.executeScript("window.scrollBy(0,500)");
        WebElement  Element = driver.findElement(By.id("low-price"));
        Thread.sleep(1000);
        js.executeScript("arguments[0].scrollIntoView();", Element);
        Thread.sleep(1000);
        driver.findElement(By.id("low-price")).sendKeys("1000");
        Thread.sleep(1000);
        driver.findElement(By.id("high-price")).sendKeys("1500");
        js.executeScript("arguments[0].scrollIntoView();", Element);
        Thread.sleep(1000);
        js.executeScript("window.scrollBy(Element,-100)");
        Thread.sleep(1000);
       driver.findElement(By.xpath("(//*[@type='submit'])[2]")).click();
       Thread.sleep(3000);
        js.executeScript("window.scrollBy(0,100)");
        Thread.sleep(500);
        js.executeScript("window.scrollBy(100,200)");
        Thread.sleep(500);
        js.executeScript("window.scrollBy(200,300)");
        Thread.sleep(500);
        js.executeScript("window.scrollBy(300,400)");
        Thread.sleep(500);
        js.executeScript("window.scrollBy(400,600)");
        Thread.sleep(500);
        js.executeScript("window.scrollBy(600,800)");
        Thread.sleep(500);
        js.executeScript("window.scrollBy(800,1000)");
        Thread.sleep(500);
        //js.executeScript("window.scrollBy(0,-1000)");
        ((JavascriptExecutor) driver)
                .executeScript("window.scrollTo(0, -document.body.scrollHeight)");
        Thread.sleep(500);
        js.executeScript("window.scrollBy(0,800)");
        driver.findElement(By.xpath("//*[text()='2022 Apple MacBook Pro Laptop with M2 chip (13-inch, 8GB RAM, 256GB SSD) Space Gray (Renewed)']")).click();
        js.executeScript("window.scrollBy(0,500)");

        driver.findElement(By.xpath("//*[text()='Add to Cart']")).click();
        driver.findElement(By.xpath("(//*[@id='add-to-cart-button'])[1]")).click();



       // driver.quit();



    }
}

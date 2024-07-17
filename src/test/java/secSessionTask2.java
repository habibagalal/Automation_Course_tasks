import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class secSessionTask2 {

    // Habiba Galal
    // Second task https://rahulshettyacademy.com/seleniumPractise/#/
    // Wed 17 Jul

    // Web driver
    public WebDriver driver ;

    // Web elements

    public  WebElement button1 ;

    public  WebElement button2;

    public secSessionTask2(){
        driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
    }

    public void addToCart(){

        button1 = driver.findElement(By.xpath("//div/div[2]/div[3]/button"));
        button1.click();

        button2 = driver.findElement(By.xpath("//div/div[3]/div[3]/button"));
        button2.click();
    }

    public static void main(String[] args) {
        secSessionTask2 test = new secSessionTask2();
        test.addToCart();
    }
}

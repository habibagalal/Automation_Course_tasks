import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.sql.Driver;
import java.time.Duration;

public class secSesssionTask1 {
    // Web driver
    WebDriver driver ;
    // Web Variables
    public static final String name = "test";
    public static final String email = "test@gmail.com";
    public static final String password = "123Test";
    // Web elements
    public  WebElement Name  ;

    public  WebElement Email  ;
    public  WebElement Password  ;

    public WebElement SubmitBtn;

    public WebElement sucsessMessageAlert;

    public WebElement requiredEmail;

    public WebElement requiredName;


    public secSesssionTask1(){
        driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/angularpractice/");

    }

    public void sucsess_Message_Alert(){
        sucsessMessageAlert = driver.findElement(By.cssSelector(".alert.alert-success.alert-dismissible"));
        boolean displayed = sucsessMessageAlert.isDisplayed();
        System.out.println(displayed);

    }
    public  void validSubmitScenario (){
        Name = driver.findElement(By.xpath("//div/form/div[1]/input"));
        Name.sendKeys(name);

        Email = driver.findElement(By.xpath("//div/form/div[2]/input"));
        Email.sendKeys(email);

        Password = driver.findElement(By.xpath("//div/form/div[3]/input"));
        Password.sendKeys(password);
        SubmitBtn =driver.findElement(By.xpath("//div/form/input"));
        SubmitBtn.click();
        sucsess_Message_Alert();
        driver.navigate().refresh();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
    }
     public void check_that_email_is_required(){

         Name = driver.findElement(By.xpath("//div/form/div[1]/input"));
         Name.sendKeys(name);
         Password = driver.findElement(By.xpath("//div/form/div[3]/input"));
         Password.sendKeys(password);
         SubmitBtn =driver.findElement(By.xpath("//div/form/input"));
         SubmitBtn.click();

         requiredEmail = driver.findElement(By.xpath("//form/div[2]/div"));
         boolean displayed = requiredEmail.isDisplayed();

         System.out.println(displayed);

     }
    public void check_that_name_is_required(){

        driver.navigate().refresh();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
        Email = driver.findElement(By.xpath("//div/form/div[2]/input"));
        Email.sendKeys(email);
        Password = driver.findElement(By.xpath("//div/form/div[3]/input"));
        Password.sendKeys(password);
        SubmitBtn =driver.findElement(By.xpath("//div/form/input"));
        SubmitBtn.click();

        requiredName = driver.findElement(By.xpath("//form/div[1]/div"));
        boolean displayed = requiredName.isDisplayed();

        System.out.println(displayed);

    }
    public static void main(String[] args) {
        secSesssionTask1 test = new secSesssionTask1();
        test.validSubmitScenario();
        test.check_that_name_is_required();
        test.check_that_email_is_required();

    }


}

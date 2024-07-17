import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class First_Task {

    public static void main(String[] args){

        WebDriver driver = new ChromeDriver();
           // define used Vars
        String url = "https://demo.nopcommerce.com/login?returnUrl=%2F";
        String  First_name ="Test";
        String Last_name ="Support";
        String Email = "Test@gmail.com";
        String Company_name = "Test";
        String Password = "123@test";
        String Confirm_password = "123@test";


        // initiate browser
        driver.get(url);

        // locating elements
        driver.findElement(By.className("ico-register")).click();
        driver.findElement(By.cssSelector("input[name='FirstName']")).sendKeys(First_name);
        driver.findElement(By.cssSelector("input[name='LastName']")).sendKeys(Last_name);
        //driver.findElement(By.cssSelector("input[name='LastName']")).sendKeys(Last_name);
        driver.findElement(By.xpath("//input[@name='Email']")).sendKeys(Email);
        driver.findElement(By.id("Company")).sendKeys(Company_name);
        driver.findElement(By.cssSelector("input[name='Password']")).sendKeys(Password);
        driver.findElement(By.xpath("//input[@name='ConfirmPassword']")).sendKeys(Confirm_password);
        driver.findElement(By.xpath("//button[@name='register-button']")).click();

        // finished register

        // start login
        driver.findElement(By.className("ico-login")).click();
        driver.findElement(By.className("email")).sendKeys(Email);
        driver.findElement(By.xpath("//input[@id='Password']")).sendKeys(Password);
        driver.findElement(By.cssSelector(".button-1.login-button")).click();


        //










    }



}

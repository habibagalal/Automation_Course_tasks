import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class third {

    // Web driver
    private WebDriver driver;
    // Variables


    // Web elements

    // main class



    public third()
    {
        driver = new ChromeDriver();
        //driver.get("https://rahulshettyacademy.com/locatorspractice/");

        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
    }


   /* public void getUserName(){
        WebElement userName = driver.findElement(By.cssSelector("input[placeholder *='name']")) ;
        WebElement userName2 = driver.findElement(By.xpath("//input[@placeholder *='name']"));

        WebElement userName3 = driver.findElement(By.xpath("//input[contains(@placeholder,'Pass')]"));

        WebElement password = driver.findElement(By.xpath("//input[contains(@placeholder,'Pass')]"));

        WebElement signbtn = driver.findElement(By.xpath("//input[contains(@class,'Btn')]"));

        userName.sendKeys("Habiba Galal");

        // reges not work with X-path and this regx will chose the the element that has substring name
        userName2.sendKeys("Habiba Galal");

        password.sendKeys("1234");

        signbtn.click();



    }*/


    public void childParent(){

        WebElement loginbtn = driver.findElement(By.xpath("//div/button[2]"));
        String text = loginbtn.getText();

        System.out.println(text);


    }


    public void parentChild(){


    }




    public static void main(String[] args) {
        third test = new third();

        test.childParent();


    }



}

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium {
    static WebDriver browser;

    public static void setup() {
        System.setProperty("webdriver.chrome.driver", "src/drivers/chromedriver.exe");

        browser = new ChromeDriver();
        browser.get("http://kitm.epizy.com/filmai.php");
    }

    public static void close() {
        browser.close();
    }

    public static void addItem(String keyword, String keyword2, String keyword3, String keyword4, String keyword5) {
        WebElement nameField = browser.findElement(By.name("pavadinimas"));
        nameField.sendKeys(keyword);
        WebElement genreField = browser.findElement(By.name("zanras"));
        genreField.sendKeys(keyword2);
        WebElement actorField = browser.findElement(By.name("aktoriai"));
        actorField.sendKeys(keyword3);
        WebElement producerField = browser.findElement(By.name("rezisierius"));
        producerField.sendKeys(keyword4);
        WebElement timeField = browser.findElement(By.name("trukme"));
        timeField.sendKeys(keyword5);
        WebElement sendfield = browser.findElement(By.name("insert"));
        sendfield.click();
    }

    public static void badItem(String keyword, String keyword2, String keyword3, String keyword4, String keyword5) {
        WebElement nameField = browser.findElement(By.name("pavadinimas"));
        nameField.sendKeys(keyword);
        WebElement genreField = browser.findElement(By.name("zanras"));
        genreField.sendKeys(keyword2);
        WebElement actorField = browser.findElement(By.name("aktoriai"));
        actorField.sendKeys(keyword3);
        WebElement producerField = browser.findElement(By.name("rezisierius"));
        producerField.sendKeys(keyword4);
        WebElement timeField = browser.findElement(By.name("trukme"));
        timeField.sendKeys(keyword5);
        WebElement sendfield = browser.findElement(By.name("insert"));
        sendfield.click();
    }

    public static void deleteItem(String keyword) {
        WebElement idField = browser.findElement(By.name("id"));
        idField.sendKeys(keyword);
        WebElement deletefield = browser.findElement(By.name("delete"));
        deletefield.click();
    }

    public static void updateItem(String keyword, String keyword2, String keyword3, String keyword4, String keyword5, String keyword6) {
        WebElement idField = browser.findElement(By.name("id"));
        idField.sendKeys(keyword);
        WebElement nameField = browser.findElement(By.name("pavadinimas"));
        nameField.sendKeys(keyword2);
        WebElement genreField = browser.findElement(By.name("zanras"));
        genreField.sendKeys(keyword3);
        WebElement actorField = browser.findElement(By.name("aktoriai"));
        actorField.sendKeys(keyword4);
        WebElement producerField = browser.findElement(By.name("rezisierius"));
        producerField.sendKeys(keyword5);
        WebElement timeField = browser.findElement(By.name("trukme"));
        timeField.sendKeys(keyword6);
        WebElement updatefield = browser.findElement(By.name("update"));
        updatefield.click();
    }

    public static void badUpdate(String keyword, String keyword2, String keyword3, String keyword4, String keyword5, String keyword6) {
        WebElement idField = browser.findElement(By.name("id"));
        idField.sendKeys(keyword);
        WebElement nameField = browser.findElement(By.name("pavadinimas"));
        nameField.sendKeys(keyword2);
        WebElement genreField = browser.findElement(By.name("zanras"));
        genreField.sendKeys(keyword3);
        WebElement actorField = browser.findElement(By.name("aktoriai"));
        actorField.sendKeys(keyword4);
        WebElement producerField = browser.findElement(By.name("rezisierius"));
        producerField.sendKeys(keyword5);
        WebElement timeField = browser.findElement(By.name("trukme"));
        timeField.sendKeys(keyword6);
        WebElement updatefield = browser.findElement(By.name("update"));
        updatefield.click();
    }

    public static void main(String args[]) {
//        System.out.println("atsiskaitymas");
        setup();
        addItem("Se7en","Crime", "Morgan Freeman","David Fincher", "127");
        badItem("+@@","@</a>@", "@</a>@","/@", "/@");
        deleteItem("17");
        updateItem("19","The Silence of the Lambs","Thriller", "Jodie Foster", "Jonathan Demme", "118");
        badUpdate("24","!!!!","!!!!!","!!!!!!", "!!!!!!!", "!!!!!!");
    }

}
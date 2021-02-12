
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SeleniumTest {
    @BeforeTest
    public void setup() {
        Selenium.setup();
    }

    @Test
    public void pridetiaddItem() {
        Selenium.addItem("Se7en","Crime", "Morgan Freeman","David Fincher", "127");
    }

    @Test
    public void badItemTest() {
        Selenium.badItem("+@@", "@</a>@", "@</a>@", "/@", "/@");
    }

    @Test
    public void deleteItemTest() {
        Selenium.deleteItem("17");
    }

    @Test
    public void updateItemTest() {
        Selenium.updateItem("19","The Silence of the Lambs","Thriller", "Jodie Foster", "Jonathan Demme", "118");
    }

    @Test
    public void badUpdateTest() {
        Selenium.badUpdate("24", "!!!!", "!!!!!", "!!!!!!", "!!!!!!!", "!!!!!!");
    }

//    @AfterTest
//    public void close() {
//        Selenium.close();
//    }
}
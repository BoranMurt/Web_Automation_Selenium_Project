package com.testinium.test;
import com.testinium.Log4j;
import com.testinium.base.BaseTest;
import com.testinium.constans.Constants;
import com.testinium.page.SepetPage;
import org.junit.jupiter.api.*;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import static com.testinium.constans.ConstansGittiGidiyorPage.*;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)

public class SepetPageTest extends BaseTest {
    SepetPage sepetPage;

    @BeforeAll
    public void before() {
        Log4j.info("SepetPageTest is Starting...");
        sepetPage = new SepetPage(getWebDriver());
        Log4j.info("Opening Page : " + Constants.WEBLINK);

    }

    @Test
    @Order(1)
    public void test_search(){
        sepetPage.cookiesclose().search(PRODUCT).searchClick();
        Log4j.info("Searching keywords : " + PRODUCT);
    }

    @Test
    @Order(2)
    public void test_chancingPage(){
        sepetPage.pageclick();
        Log4j.info("Chancing Page : 2");
    }

    @Test
    @Order(3)
    public void test_basketAndPrices(){
        sepetPage.productclick();
        Log4j.info("A random product page opens");
        String pricetext=sepetPage.getText();
        Log4j.info("The product price has been received");
        if(pricetext==null){
            Log4j.error("The product price could not be taken from the product page! Test again!");
        }
        sepetPage.addbasket();
        Log4j.info("Product has been added to the cart");
        sepetPage.gobasket();
        Log4j.info("Go to cart");
        String pricetext2= sepetPage.getText2();
        Assertions.assertEquals(pricetext,pricetext2,"The product price could not be taken from the product page! Test again! ");
        Log4j.info("Prices are compared");
    }

    @Test
    @Order(4)
    public void test_quantity(){
        WebElement element = getWebDriver().findElement(QUANTITY);
        Select sel =new Select(element);
        sel.selectByVisibleText("2");
        Log4j.info("The number of products has been increased");
    }

    @Test
    @Order(5)
    public void test_clearBasket(){
        sepetPage.clearbasket();
        Log4j.info("The basket has been cleared");
    }

    @AfterAll
    public void after(){
        Log4j.info("SepetPageTest is complete...");
        tearDown();

    }
}

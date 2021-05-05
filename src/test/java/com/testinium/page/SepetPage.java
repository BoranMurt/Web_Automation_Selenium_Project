package com.testinium.page;

import com.testinium.base.BasePage;
import org.openqa.selenium.WebDriver;
import static com.testinium.constans.ConstansGittiGidiyorPage.*;

public class SepetPage extends BasePage {

    public SepetPage(WebDriver driver) {

        super(driver);
    }
    public SepetPage search(String product){
        sendKeys(INPUT,product);
        return this;
    }
    public SepetPage searchClick() {
        click(SEARCH);
        return this;
    }
    public SepetPage pageclick(){
        click(PAGE);
        return this;
    }
    public SepetPage productclick(){
        click(RANDOMPRODUCT);
        return this;
    }
    public SepetPage cookiesclose(){
        click(COOKIES);
        return this;
    }
    public String getText(){
        return getText(PRODUCTPAGE_PRICE);
    }
    public SepetPage addbasket(){
        click(ADDBASKET);
        return this;
    }
    public SepetPage gobasket(){
        click(GOBASKET);
        return this;
    }
    public String getText2(){
        return getText(BASKETPRICE);
    }
    public SepetPage clearbasket(){
        click(DELETE);
        return this;
    }

}

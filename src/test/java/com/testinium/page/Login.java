package com.testinium.page;

import com.testinium.base.BasePage;
import org.openqa.selenium.WebDriver;

import static com.testinium.constans.ConstansGittiGidiyorPage.*;

public class Login extends BasePage {

    public Login(WebDriver driver){
        super(driver);
    }

    public Login loginmenu(){
        click(LOGINMENU);
        return this;
    }

    public Login loginbutton(){
        click(LOGIN);
        return this;
    }

    public Login email(String username){
        sendKeys(EMAIL,username);
        return this;
    }
    public Login password(String password){
        sendKeys(PASSWORD,password);
        return this;
    }
    public Login enter(){
        click(LOGINBUTTON);
        return this;
    }
}

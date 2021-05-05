package com.testinium.test;

import com.testinium.Log4j;
import com.testinium.base.BaseTest;
import com.testinium.constans.Constants;
import com.testinium.page.Login;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

import static com.testinium.constans.ConstansGittiGidiyorPage.PASS;
import static com.testinium.constans.ConstansGittiGidiyorPage.USERNAME;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class LoginTest extends BaseTest {

    Login Login;

    @BeforeAll
    public void before(){
        Log4j.info("LoginPageTest is starting...");
        Login =new Login(getWebDriver());
        Log4j.info("Opening Page : " + Constants.WEBLINK);
    }

    @Test

    public void test_login(){

        Login.loginmenu().loginbutton();
        Log4j.info("Login page is opened");
        Login.email(USERNAME);
        Log4j.info("Email entered :"+USERNAME);
        Login.password(PASS).enter();
        Log4j.info("Password entered :"+ PASS);
        Log4j.info("Login process done");
    }

    @AfterAll
    public void after(){
        Log4j.info("LoginPageTest is complete...");
        tearDown();

    }
}

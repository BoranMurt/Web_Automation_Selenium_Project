package com.testinium.constans;

import org.openqa.selenium.By;

public class ConstansGittiGidiyorPage {

    public static final String PRODUCT ="Bilgisayar";
    public static final String USERNAME ="deneme123123@gmail.com";
    public static final String PASS ="Deneme.123456";
    public static final By INPUT = By.xpath("//header/div[3]/div[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/div[2]/input[1]");
    public static final By SEARCH = By.xpath("//header/div[3]/div[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[2]/button[1]");
    public static final By LOGIN = By.xpath("//header/div[3]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/a[1]");
    public static final By LOGINMENU= By.xpath("//header/div[3]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]");
    public static final By EMAIL= By.xpath("//input[@id='L-UserNameField']");
    public static final By PASSWORD= By.xpath("//input[@id='L-PasswordField']");
    public static final By LOGINBUTTON= By.xpath(("//input[@id='gg-login-enter']"));
    public static final By PAGE= By.xpath("//a[contains(text(),'2')]");
    public static final By RANDOMPRODUCT= By.className("img-cont");
    public static final By PRODUCTPAGE_PRICE=By.id("sp-price-discountPrice");
    public static final By ADDBASKET= By.xpath("//button[@id='add-to-basket']");
    public static final By GOBASKET= By.xpath("//a[contains(text(),'Sepete Git')]");
    public static final By COOKIES=By.className("tyj39b-3");
    public static final By BASKETPRICE=By.className("new-price");
    public static final By QUANTITY= By.xpath("//body/div[@id='main-content']/div[2]/div[1]/div[1]/form[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[6]/div[2]/div[2]/div[1]/div[4]/div[1]/div[2]/select[1]");
    public static final By DELETE= By.className("btn-delete");
}

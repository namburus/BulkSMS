package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class loginPage {
    WebDriver driver;
//web elements
   By adm_log = By.linkText("Admin Login");
   By sto_log = By.linkText("Store Login");
   By txt_username =By.id("username");
   By txt_password =By.id("password");
   By but_login = By.name("submit");


   public loginPage(WebDriver driver) {
       this.driver= driver;
   }
//clicks admin log in
   public void click_admin_login(){
       driver.findElement(adm_log).click();
   }
//clicks store log in
    public void click_store_login(){
        driver.findElement(sto_log).click();
    }

//clears username field and enter the username whatever we give
   public void enter_username(String username){
       driver.findElement(txt_username).clear();
       driver.findElement(txt_username).sendKeys(username);
   }
//clears password field and enter the password whatever we give
    public void enter_password(String pwd){
        driver.findElement(txt_password).clear();
        driver.findElement(txt_password).sendKeys(pwd);
    }
//clicks log in button
    public void click_login(){
       driver.findElement(but_login).click();
    }

    //checks login by asserting the page title to the text we have given
    public void check_login(){
        if (driver.getTitle().equals("Dashboard | Bulk SMS")){
            System.out.print("landed on correct page");
        }else {
            System.out.print("wrong page");
        }
    }
}

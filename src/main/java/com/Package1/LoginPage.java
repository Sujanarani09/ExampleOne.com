package com.Package1;

import com.package2.Utils;
import org.openqa.selenium.By;

/**
 * Created by laxmikanthj on 28/05/2015.
 */
public class LoginPage extends BasePage {


    //List of locators in login Page
    By UsernameTextField = By.id("txtUsername");
    By PasswordTextField = By.id("txtPassword");
    By LoginButton = By.id("btnLogin");

    public void login(String Username, String Password) {

        Utils.entertext(UsernameTextField, Username);
        Utils.entertext(PasswordTextField, Password);
        Utils.click(LoginButton);

    }
}


package ru.stqa.addressbook.appmanager;

import org.openqa.selenium.WebDriver;

public class SessionHelper {

  private WebDriver wd;

  public SessionHelper(WebDriver wd) {

    this.wd = wd;
  }
}

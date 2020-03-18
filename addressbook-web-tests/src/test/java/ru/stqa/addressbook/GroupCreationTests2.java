package ru.stqa.addressbook;

import org.testng.annotations.*;
import org.openqa.selenium.*;


public class GroupCreationTests2 extends TestBase {

  @Test
  public void testGroupCreation2() throws Exception {
    goToGroupPage();
    initGroupCreation();
    fillGroupForm(new GroupData("test1", "test2", "test3"));
    submitGroupCreation();
    returnToGroupPage();
    wd.findElement(By.linkText("Logout")).click();
  }

}

package ru.stqa.addressbook;

import org.testng.annotations.*;
import org.openqa.selenium.*;


public class GroupCreationTests2 extends TestBase {

  @Test
  public void testGroupCreation2() throws Exception {
    app.goToGroupPage();
    app.initGroupCreation();
    app.fillGroupForm(new GroupData("test1", "test2", "test3"));
    app.submitGroupCreation();
    app.returnToGroupPage();
    app.wd.findElement(By.linkText("Logout")).click();
  }

}

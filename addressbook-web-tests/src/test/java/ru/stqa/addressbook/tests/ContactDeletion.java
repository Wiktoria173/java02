package ru.stqa.addressbook.tests;

import org.testng.annotations.Test;

public class ContactDeletion extends TestBase{

  @Test
  public void testContactDeletion() {
    app.getContactHelper().selectContact();
    app.getContactHelper().deleteSelectedContact();
    app.getContactHelper().submitDeletedContact();
  }
}

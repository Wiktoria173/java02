package ru.stqa.addressbook.tests;

import org.testng.annotations.Test;
import ru.stqa.addressbook.model.ContactData;

public class ContactDeletion extends TestBase{

  @Test
  public void testContactDeletion() {
    if (! app.getContactHelper().isThereAContact()) {
      app.getContactHelper().createContact(new ContactData("Anthony", null, null, null, "test1"), true);
    }
    app.getContactHelper().selectContact();
    app.getContactHelper().deleteSelectedContact();
    app.getContactHelper().submitDeletedContact();
  }
}

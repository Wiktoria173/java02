package ru.stqa.addressbook.tests;

import org.testng.annotations.*;
import ru.stqa.addressbook.model.ContactData;

public class ContactCreation extends TestBase {

  @Test
  public void testContactCreation() throws Exception {
    app.getContactHelper().createContact(new ContactData("Anthony", null, null, null, "test1"), true);
    /*
    app.getContactHelper().initContactCreation();
    app.getContactHelper().fillContactForm(new ContactData("Anthony", null, null, null, "test1"), true);
    app.getContactHelper().submitContactCreation();
    app.getContactHelper().returnToHomePage(); */
  }

}

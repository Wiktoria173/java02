package ru.stqa.addressbook.tests;

import org.testng.annotations.*;
import ru.stqa.addressbook.model.ContactData;

public class ContactCreation extends TestBase {

  @Test
  public void testContactCreation() throws Exception {
    app.getContactHelper().initContactCreation();
    app.getContactHelper().fillContactForm(new ContactData("Anthony", "Green", "784562963", "anth@green.com"));
    app.getContactHelper().submitContactCreation();
    app.getContactHelper().returnToHomePage();
  }

}

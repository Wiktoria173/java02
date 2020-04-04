package ru.stqa.addressbook.tests;

import org.testng.annotations.*;
import ru.stqa.addressbook.model.ContactData;
import ru.stqa.addressbook.tests.TestBase;

public class ContactCreation extends TestBase {

  @Test
  public void testContactCreation() throws Exception {
    app.initContactCreation();
    app.fillContactForm(new ContactData("Anthony", "Green", "784562963", "anth@green.com"));
    app.submitContactCreation();
    app.returnToHomePage();
  }

}

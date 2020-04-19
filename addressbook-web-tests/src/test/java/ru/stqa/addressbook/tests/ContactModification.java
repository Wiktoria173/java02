package ru.stqa.addressbook.tests;

import org.testng.annotations.Test;
import ru.stqa.addressbook.model.ContactData;

public class ContactModification extends TestBase {

  @Test
  public void testContactModification() {
    if (! app.getContactHelper().isThereAContact()) {
      app.getContactHelper().createContact(new ContactData("Anthony", null, null, null, "test1"), true);
    }
    app.getContactHelper().initContactModification();
    app.getContactHelper().fillContactForm(new ContactData("Anthony", "Green", "784562963", "anth@green.com", null), false);
    app.getContactHelper().submitContactModification();
    app.getContactHelper().returnToHomePage();
  }
}

package ru.stqa.addressbook.tests;

import org.testng.annotations.Test;
import ru.stqa.addressbook.model.ContactData;

public class ContactModification extends TestBase {

  @Test
  public void testContactModification() {
    app.getGroupHelper().initContactModification();
    app.getContactHelper().fillContactForm(new ContactData("Ross", "Geller", "711562963", "ross@geller.com"));
    app.getGroupHelper().submitContactModification();
    app.getContactHelper().returnToHomePage();
  }
}

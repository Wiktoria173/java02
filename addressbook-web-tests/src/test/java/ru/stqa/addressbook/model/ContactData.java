package ru.stqa.addressbook.model;

public class ContactData {
  private final String firstname;
  private final String lastname;
  private final String telhome;
  private final String email;

  public ContactData(String firstname, String lastname, String telhome, String email) {
    this.firstname = firstname;
    this.lastname = lastname;
    this.telhome = telhome;
    this.email = email;
  }

  public String getFirstname() {
    return firstname;
  }

  public String getLastname() {
    return lastname;
  }

  public String getTelhome() {
    return telhome;
  }

  public String getEmail() {
    return email;
  }
}

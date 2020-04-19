package ru.stqa.addressbook.model;

public class ContactData {
  private final String firstname;
  private final String lastname;
  private final String telhome;
  private final String email;
  private String group;

  public ContactData(String firstname, String lastname, String telhome, String email, String group) {
    this.firstname = firstname;
    this.lastname = lastname;
    this.telhome = telhome;
    this.email = email;
    this.group = group;
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

  public String getGroup() {
    return group;
  }
}

package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.ContactData;

/**
 * Created by Kseniya.Isakova on 29.05.2016.
 */
public class ContactModificationTests extends TestBase {

  @Test
  public void testContactModification() {
    app.getNavigationHelper().gotoHomePage();
    app.getContactHelper().initContactModification();
    app.getContactHelper().fillContactData(new ContactData("Ivan", "Ivanov", "SPB", "89312868015"));
    app.getContactHelper().submitContactModification();
    app.getContactHelper().returnContactPage();
  }
}

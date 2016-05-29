package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.Test;

/**
 * Created by Kseniya.Isakova on 29.05.2016.
 */
public class ContactDeletionTests extends TestBase {

  @Test
  public void testContactDeletion() {
    app.getNavigationHelper().gotoHomePage();
    app.getContactHelper().selectContact();
    app.getContactHelper().deleteSelectedContacts();
    app.getNavigationHelper().deleteAlert();
    app.getNavigationHelper().gotoHomePage();
  }
}

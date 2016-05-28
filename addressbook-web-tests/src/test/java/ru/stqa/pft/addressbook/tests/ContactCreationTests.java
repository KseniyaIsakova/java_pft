package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.ContactData;

public class ContactCreationTests extends TestBase {


    @Test
    public void testContactCreation() {
        app.getNavigationHelper().gotoAddNewPage();
        app.getContactHelper().fillContactData(new ContactData("Ivan", "Ivanov", "Samara", "89272008565"));
        app.getContactHelper().submitContactCreation();
        app.getContactHelper().returnContactPage();
    }
}


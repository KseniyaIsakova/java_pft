package ru.stqa.pft.addressbook;

import org.testng.annotations.Test;

public class ContactCreationTests extends TestBase {


    @Test
    public void testContactCreation() {
        gotoAddNewPage();
        fillContactData(new ContactData("Ivan", "Ivanov", "Samara", "89272008565"));
        submitContactCreation();
        returnContactPage();
    }
}


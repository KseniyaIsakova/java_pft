package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.GroupData;

/**
 * Created by Kseniya.Isakova on 29.05.2016.
 */
public class GroupModificationTests extends TestBase {

  @Test
  public void testGroupModification() {
    app.getNavigationHelper().gotoGroupPage();
    if (! app.getGroupHelper().isThereAGroup()) {
      app.getGroupHelper().createGroup(new GroupData("test102", null, null));
    }
    app.getGroupHelper().selectGroup();
    app.getGroupHelper().initGroupModification();
    app.getGroupHelper().fillGroupForm(new GroupData("test10", "test20", "test30"));
    app.getGroupHelper().submitGroupModification();
    app.getGroupHelper().returnToGroupPage();
  }
}

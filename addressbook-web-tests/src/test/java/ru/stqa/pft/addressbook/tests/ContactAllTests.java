package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.ContactData;

import java.util.Arrays;
import java.util.stream.Collectors;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

/**
 * Created by Kseniya.Isakova on 14.06.2016.
 */
public class ContactAllTests extends TestBase {


  @Test
  public void testContactAll() {
    app.goTo().homePage();
    ContactData contact = app.contact().all().iterator().next();
    String contactInfoFromContactCard = app.contact().infoFromContactCard(contact).replaceAll("\\n", "")
            .replaceAll("\\s\\(\\d\\d\\)", "").replaceAll("\\s\\([a-z.]*\\)", "");
    app.goTo().homePage();
    ContactData contactInfoFromEditForm = app.contact().infoFromEditForm(contact);

    assertThat(contactInfoFromContactCard, equalTo(mergeAll(contactInfoFromEditForm)));
  }

  public String mergeAll(ContactData contact) {
    String FIO = Arrays.asList(contact.getFirstname(), contact.getMiddlename(), contact.getLastname())
            .stream().filter((s) -> !s.equals(""))
            .collect(Collectors.joining(" "));
    String all = Arrays.asList(FIO, contact.getNickname(), contact.getTitle(), contact.getCompany(),
            contact.getAddress(),
            mergePhones("H: ", contact.getHomePhone()), mergePhones("M: ", contact.getMobile()),
            mergePhones("W: ", contact.getWorkPhone()), mergePhones("F: ", contact.getFax()),
            contact.getEmail(), contact.getEmail2(), contact.getEmail3(),
            mergeHomePage(contact.getHomepage()),
            mergeDates("Birthday ", contact.getBirthday()), contact.getNotes())
            .stream().filter((s) -> !s.equals(""))
            .collect(Collectors.joining(""));
    return all;
  }

  public String mergePhones(String prefix, String phone) {
    if (!phone.equals("")) {
      return prefix + phone;
    } else return "";
  }

  public String mergeDates(String str, String birth) {
    if (!birth.equals("")) {
      return str + birth;
    } else return "";
  }

  public String mergeHomePage(String hp) {
    if (!hp.equals("")) {
      return "Homepage:" + hp;
    } else return "";

  }
}

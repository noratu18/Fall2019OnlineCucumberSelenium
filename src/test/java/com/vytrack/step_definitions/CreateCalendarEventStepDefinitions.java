package com.vytrack.step_definitions;


import com.vytrack.pages.activities.CalendarEventsPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;

import java.util.Map;

public class CreateCalendarEventStepDefinitions {

    CalendarEventsPage calendarEventsPage = new CalendarEventsPage();


    @Then("user click as on create calendar event button")
    public void user_click_as_on_create_calendar_event_button() {
        System.out.println("User click on create calendar event button");
    calendarEventsPage.clickToCreateCalendarEvent();

    }


    @And("user enters {string} as a title")
    public void userEntersAsATitle(String string) {
        System.out.println("User enters title: " + string);
        calendarEventsPage.enterCalendarEventTitle(string);

    }

    @And("user enters {string} as description")
    public void userEntersAsDescription(String string) {
        System.out.println("User enters description: " + string);
        calendarEventsPage.enterCalendarEventDescription(string);
    }

    @Then("user click on save and close button")
    public void userClickOnSaveAndCloseButton() {
        System.out.println("User click on save and close button");
        calendarEventsPage.clickOnSaveAndClose();

    }

    @And("user verifies that description is {string}")
    public void userVerifiesThatDescriptionIs(String string) {
        Assert.assertEquals(string, calendarEventsPage.getGeneralInfoDescriptionText());
    }

    @And("user verifies that title of new calendar event is {string}")
    public void userVerifiesThatTitleOfNewCalendarEventIs(String string) {
        Assert.assertEquals(string, calendarEventsPage.getGeneralInfoTitleText());

    }

    /*
    And user enters new calendar event information:
      |description| On this meeting we discuss what went well, what went wrong and what can be improved |
      |title      | Sprint Retrospective
     */
    @And("user enters new calendar event information:")
    public void userEntersNewCalendarEventInformation(Map<String, String> dataTable) {
        calendarEventsPage.enterCalendarEventDescription(dataTable.get("description"));
        calendarEventsPage.enterCalendarEventTitle(dataTable.get("title"));

    }

    @And("user verifies new calendar event was created successfully")
    public void userVerifiesNewCalendarEventWasCreatedSuccessfully(Map<String, String> dataTable) {
        Assert.assertEquals(dataTable.get("description"), calendarEventsPage.getGeneralInfoDescriptionText());
        Assert.assertEquals(dataTable.get("title"), calendarEventsPage.getGeneralInfoTitleText());
    }
}

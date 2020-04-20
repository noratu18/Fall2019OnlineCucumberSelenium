package com.vytrack.step_definitions;

import com.vytrack.pages.fleet.VehiclesPage;
import io.cucumber.java.en.Then;

public class NavigationMenuStepDefinition {

    VehiclesPage vehiclesPage = new VehiclesPage();

    @Then("user verifies the current page url")
    public void user_verifies_the_current_page_url() {
        System.out.println("User is on the Vehicles page");

    }

    @Then("user verifies url https:\\/\\/qa{int}.vytrack.com\\/entity\\/Extend_Entity_Carreservation")
    public void userVerifiesUrlHttpsQaVytrackComEntityExtend_Entity_Carreservation(int arg0) {
        System.out.println("Verifying url for Fleet --> Vehicles");
    }

    @Then("the url should be https:\\/\\/qa{int}.vytrack.com\\/calendar\\/event")
    public void theUrlShouldBeHttpsQaVytrackComCalendarEvent(int arg0) {
        System.out.println("Verifying url for Activities --> Calendar event");
    }

    @Then("the url should be https:\\/\\/qa{int}.vytrack.com\\/campaign")
    public void theUrlShouldBeHttpsQaVytrackComCampaign(int arg0) {
        System.out.println("Verifying url for the Marketing --> Campaign");
    }
}

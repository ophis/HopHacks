package test;

import java.util.List;

import se.walkercrou.places.GooglePlaces;
import se.walkercrou.places.GooglePlaces.Param;
import se.walkercrou.places.Place;

public class MainTest {
	public static void main(String[] args){
		GooglePlaces client = new GooglePlaces("AIzaSyBXKGyReX6WrbYk7y4DYgra7HaYwivE6f0");
		List<Place> places = null;
		places = client.getNearbyPlaces(39.3305814, -76.61960970000001, 5000, GooglePlaces.MAXIMUM_RESULTS, Param.name("opennow").value(true));
		System.out.println(places.size());
		Place empireStateBuilding = null;
		for (Place place : places) {
		        empireStateBuilding = place;
		        Place detailedEmpireStateBuilding = empireStateBuilding.getDetails(); // sends a GET request for more details
			    // Just an example of the amount of information at your disposal:
			    System.out.println("ID: " + detailedEmpireStateBuilding.getId());
			    System.out.println("Name: " + detailedEmpireStateBuilding.getName());
			    System.out.println("Phone: " + detailedEmpireStateBuilding.getPhoneNumber());
			    System.out.println("International Phone: " + empireStateBuilding.getInternationalPhoneNumber());
			    System.out.println("Website: " + detailedEmpireStateBuilding.getWebsite());
			    System.out.println("Always Opened: " + detailedEmpireStateBuilding.isAlwaysOpened());
			    System.out.println("Status: " + detailedEmpireStateBuilding.getStatus());
			    System.out.println("Google Place URL: " + detailedEmpireStateBuilding.getGoogleUrl());
			    System.out.println("Price: " + detailedEmpireStateBuilding.getPrice());
			    System.out.println("Address: " + detailedEmpireStateBuilding.getAddress());
			    System.out.println("Vicinity: " + detailedEmpireStateBuilding.getVicinity());
			    System.out.println("Reviews: " + detailedEmpireStateBuilding.getReviews().size());
			    System.out.println("Hours:\n " + detailedEmpireStateBuilding.getHours());		    
		}

	}
}

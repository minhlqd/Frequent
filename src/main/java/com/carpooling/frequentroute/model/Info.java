package com.carpooling.frequentroute.model;

import com.github.fabiomaffioletti.firebase.document.FirebaseDocument;
import com.github.fabiomaffioletti.firebase.document.FirebaseId;
import lombok.Data;

@Data
@FirebaseDocument("/info")
public class Info {

    @FirebaseId
    private String id;

    private String full_name;
    private String profile_photo;
    private String dateOfBird;
    private String licenceNumber;
    private String gender;
    private String registrationPlate;
    private String car;
    private String car_photo;
    private String education;
    private String work;
    private String bio;
    private Long mobileNumber;
    private int completedRides;
    private int seats;
    private int userRating;
    private int points;
    private Boolean carOwner;
}

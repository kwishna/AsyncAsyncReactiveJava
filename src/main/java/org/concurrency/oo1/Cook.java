package org.concurrency.oo1;

import io.restassured.RestAssured;

public class Cook {
    public boolean chopOnion() {
        for (int i = 0; i < 5; i++) {
            RestAssured.given().when().get("https://reqres.in/api/users?page="+i).asPrettyString();
        }
        return true;
    }

    public boolean peelPotato() {
        for (int i = 0; i < 5; i++) {
            RestAssured.given().when().get("https://reqres.in/api/users?page="+i).asPrettyString();
        }
        return true;
    }
}

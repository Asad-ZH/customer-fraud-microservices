package com.mylearning.customer;

public record CustomerRegistrationRequest(
        String email,
        String firstName,
        String lastName
) {


}

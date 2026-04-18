package com.acme.hello.platform.generic.resources;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Rest Resource representing incoming Greet Developer request data.
 * @param firstName the developer's first name
 * @param lastName the developer's last name
 */
public record GreetDeveloperRequest(String firstName,
                                    String lastName) {
    /**
     * Constructs a new GreetDeveloperRequest instance with the given
     * first and last name
     * @param firstName the developer's first name
     * @param lastName the developer's last name
     */
    @JsonCreator
    public GreetDeveloperRequest(@JsonProperty("firstName") String firstName,
                                 @JsonProperty("lastName") String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }
}

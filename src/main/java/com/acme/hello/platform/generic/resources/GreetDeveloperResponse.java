package com.acme.hello.platform.generic.resources;

import java.util.UUID;

/**
 * Rest Resource representing incoming Greet Developer response data.
 * @param id the developer's unique identifier
 * @param fullName the developer's full name
 * @param message the greeting message for the developer
 */
public record GreetDeveloperResponse(UUID id,
                                     String fullName,
                                     String message) {
    /**
     * Constructs a new GreetDeveloperResponse instance with the given id,
     * full name, and message
     * @param message the greeting message, which may be null or empty
     */
    public GreetDeveloperResponse(String message){
        this(null,null,message);
    }
}

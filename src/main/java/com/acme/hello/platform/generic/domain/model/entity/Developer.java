package com.acme.hello.platform.generic.domain.model.entity;

import lombok.Builder;
import lombok.Getter;
import org.apache.commons.lang3.StringUtils;

import java.util.UUID;

/**
 * Represents a Developer entity in the 'Generic' bounded context
 * @author Open Source Application Development Team
 */
@Getter
@Builder
public class Developer {
    private final UUID id = UUID.randomUUID();
    private final String firstName;
    private final String lastName;

    /**
     * Private constructor to enforce trimming of name fields
     * @param firstName the developer's first name
     * @param lastName the developer's last name
     */
    private Developer(String firstName, String lastName) {
        this.firstName = StringUtils.trimToEmpty(firstName);
        this.lastName = StringUtils.trimToEmpty(lastName);
    }

    /**
     * Return the full name of the developer by
     * concatenating firs and last name
     */

    public String getFullName() {return firstName + " " + lastName;}

    /**
     * Checks if either the first name or last name is blank (null, empty or white)
     * @return true if any trimmed name is blank, false otherwise
     */
    public boolean isAnyNameBlank(){
        return StringUtils.isAnyBlank(firstName, lastName);
    }

    /**
     * Checks if either the first name or last name is empty
     * @return true if any trimmed name is empty, false otherwise
     */
    public boolean isAnyNameEmpty(){return StringUtils.isAnyBlank(firstName, lastName);}
}

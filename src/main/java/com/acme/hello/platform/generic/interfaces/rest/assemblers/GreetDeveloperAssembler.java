package com.acme.hello.platform.generic.interfaces.rest.assemblers;

import com.acme.hello.platform.generic.domain.model.entity.Developer;
import com.acme.hello.platform.generic.resources.GreetDeveloperResponse;
import org.apache.commons.lang3.ObjectUtils;

/**
 * Assembler class to convert {@link Developer} entities
 * to {@link GreetDeveloperResponse} REST resources.
 */
public class GreetDeveloperAssembler {
    public static GreetDeveloperResponse toResourceFromEntity(Developer developer) {
        /**
         * Converts a {@link Developer} entity to a {@link GreetDeveloperResponse}
         * resource.
         * @param developer the {@link Developer} entity to convert
         *                  containing the developer's id and full name
         * @return the converted {@link GreetDeveloperResponse} REST resources,
         * or a default response if the developer is null or blank.
         */
        if(isDeveloperNullorEmptyNamed(developer)) {
            return new GreetDeveloperResponse("Welcome Anonymous Spring Boot Developer");
        }
        return new GreetDeveloperResponse(
                developer.getId(),
                developer.getFullName(),
                "Congrats "+ developer.getFullName() +
                        "! You are a Spring Boot Developer");
    }

    /**
     * Checks if the given {@link Developer} entity is null or has invalid names.
     * @param developer the {@link Developer} entity to check
     * @return true if the entity is null or has invalid names, false otherwise
     */
    private static boolean isDeveloperNullorEmptyNamed(Developer developer) {
        return ObjectUtils.isEmpty(developer) ||
                developer.isAnyNameEmpty() ||
                developer.isAnyNameBlank();
    }
}

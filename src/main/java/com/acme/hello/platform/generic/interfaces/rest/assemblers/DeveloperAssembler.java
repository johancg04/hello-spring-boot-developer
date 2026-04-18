package com.acme.hello.platform.generic.interfaces.rest.assemblers;

import com.acme.hello.platform.generic.domain.model.entity.Developer;
import com.acme.hello.platform.generic.resources.GreetDeveloperRequest;
import org.apache.commons.lang3.ObjectUtils;
import org.apache.commons.lang3.StringUtils;

public class DeveloperAssembler {
    /**
     * Converts a {@link GreetDeveloperRequest} to a {@link Developer} entity.
     * @param request the {@GreetDeveloperRequest} to convert
     * @return the converted {@link Developer} entity, or null if the request
     * is null or blank
     */
    public static Developer toEntityFromRequest(GreetDeveloperRequest request){
        if(ObjectUtils.isEmpty(request) || StringUtils.isAnyBlank(
                request.firstName(), request.lastName()))
            return null;
        return Developer.builder().firstName(request.firstName()).lastName(request.lastName()).build();
    }
}

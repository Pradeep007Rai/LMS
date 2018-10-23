package com.cg.lms.controller;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RestController;

import com.cg.lms.dto.Employee;


/**
 * Root resource (exposed at "myresource" path)
 */
@Component
@Path("/user")
public class MyResource {
    /**
     * Method handling HTTP GET requests. The returned object will be sent
     * to the client as "text/plain" media type.
     *
     * @return String that will be returned as a text/plain response.
     */

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String getIt() {

    	return "Got it!";
        
    }
}

package org.myorg.rest;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.myorg.model.rules.RuleResults;
import org.myorg.service.ClassicRuleService;

import jakarta.ws.rs.Produces;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.core.Response;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.core.MediaType;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

@Path("/my-classic-decision-service")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
@ApplicationScoped
public class ClassicRuleServiceResource {

    private static final Logger logger = LoggerFactory.getLogger(ClassicRuleServiceResource.class);

    @Inject ClassicRuleService service;

    /*
     * Example REST API Endpoint
     * 
     * Any REST API Endpoint should simply pass the call off to the service class, as well as manage incoming/outgoing HTTP Headers, etc.
     */

    /***************
    @POST()
	@Path("process-customers")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public Response processCustomers(List<Customer> customers) {

        RuleResults results = service.processCustomers(customers);
        return Response.ok(results).build();
    }
    ***************/   
}

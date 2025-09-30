package ${package}.rest;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import ${package}.model.rules.RuleResults;
import ${package}.service.${serviceClassName};

#if (${bamoeRuntime} == 'quarkus')
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.core.Response;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.core.MediaType;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
#end
#if (${bamoeRuntime} == 'springboot')
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.annotation.ApplicationScope;
import jakarta.inject.Inject;
#end

#if (${bamoeRuntime} == 'quarkus')
@Path("${restPath}")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
@ApplicationScoped
#end 
#if (${bamoeRuntime} == 'springboot')
@RestController
@RequestMapping("${restPath}")
@ApplicationScope
#end 
public class ${restClassName} {

    private static final Logger logger = LoggerFactory.getLogger(${restClassName}.class);

    @Inject ${serviceClassName} service;

    /*
     * Example REST API Endpoint
     * 
     * Any REST API Endpoint should simply pass the call off to the service class, as well as manage incoming/outgoing HTTP Headers, etc.
     */

    /***************
#if (${bamoeRuntime} == 'quarkus')
    @POST()
	@Path("process-customers")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
#end
#if (${bamoeRuntime} == 'springboot')
    @PostMapping(value="process-customers", produces=MediaType.APPLICATION_JSON_VALUE, consumes=MediaType.APPLICATION_JSON_VALUE)
#end
    public Response processCustomers(List<Customer> customers) {

        RuleResults results = service.processCustomers(customers);
        return Response.ok(results).build();
    }
    ***************/   
}

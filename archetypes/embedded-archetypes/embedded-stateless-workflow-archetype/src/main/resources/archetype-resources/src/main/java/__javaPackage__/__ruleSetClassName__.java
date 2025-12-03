package ${package};

import java.util.List;
import java.util.Map;
import java.util.HashMap;

import jakarta.enterprise.context.ApplicationScoped;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.ibm.bamoe.engine.adaptors.RuleEngineAdaptor;
import com.ibm.bamoe.engine.adaptors.model.RuleResults;

// Imported Fact Classes

@ApplicationScoped
public class ${ruleSetClassName} extends RuleEngineAdaptor {

    private static final Logger logger = LoggerFactory.getLogger(${ruleSetClassName}.class);
    private static final String RULESET_NAME = "${artifactId}";

    /*
     * This is an example method which takes in facts, executes the rules embedded, and returns the results.  You can have as
     * many of these public methods as you wish, as long as they eventually call the execute(RULESET_NAME, facts) method.  The
     * list of facts should be in the form of Map<String,Object>.
     *
    public RuleResults startProcess(List<Deposit> deposits) throws Exception {

        // Add the facts 
        Map<String, Object> facts = new HashMap<String, Object>();

        for (Deposit deposit : deposits) {

            // Generate a unique transaction ID
            deposit.setId(UUID.randomUUID().toString());
            deposit.setMaxAvailabilityAmount(maxAvailabilityAmount);
            facts.put(deposit.getId(), deposit);
        }

        // Execute and return the results
        return execute(RULESET_NAME, facts);
    }
    */
}

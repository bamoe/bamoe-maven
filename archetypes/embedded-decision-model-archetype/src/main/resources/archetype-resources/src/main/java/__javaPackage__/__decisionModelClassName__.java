package ${package};

import java.util.List;
import java.util.Map;
import java.util.HashMap;

import jakarta.enterprise.context.ApplicationScoped;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.ibm.bamoe.engine.adaptors.model.DecisionModelResults;
import com.ibm.bamoe.engine.adaptors.DecisionModelAdaptor;

// Imported Fact Classes

@ApplicationScoped
public class ${decisionModelClassName} extends DecisionModelAdaptor {

    private static final Logger logger = LoggerFactory.getLogger(${decisionModelClassName}.class);
    private static final String DECISION_MODEL_NAME = "${artifactId}";

    /*
     * This is an example method which takes in facts, executes the decision model embedded, and returns the results.  You can have as
     * many of these public methods as you wish, as long as they eventually call the execute(DECISION_MODEL_NAME, facts) method.  The
     * list of facts should be in the form of Map<String,Object>.
     *
    public DecisionModelResults processTrafficViolation(Violation violation, Driver driver) throws Exception {

        // Convert the list of customers to a map
        Map<String, Object> facts = new HashMap<String, Object>();
        facts.put("Violation", violation);
        facts.put("Driver", driver);

        // Execute and return the results
        return execute(DECISION_MODEL_NAME, facts);
    }
    */
}

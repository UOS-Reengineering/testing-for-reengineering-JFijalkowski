package example.project;

import example.project.domain.Scenario;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TestSimulator {

    @Test
    public void testRun() {
        Simulator simulator = new Simulator("dummy");
        Scenario scenario = new Scenario();
        assertEquals(null, simulator.run(scenario));
    }

    @Test
    public void testRun2() {
        Simulator simulator = new Simulator("dummy");
        Scenario scenario = new Scenario();
        ADS ads = new ADS("dummy");
        assertNull(simulator.run(scenario));
        // remove the above line and
        // complete a test case that calls `simulator.run(scenario, ads)` and verify if the result is null.
    }
}

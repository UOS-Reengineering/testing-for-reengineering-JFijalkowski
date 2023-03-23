package example.project;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.mockito.Mockito.*;
import static org.mockito.Mockito.times;

import example.project.domain.Scenario;
import example.project.domain.SimulationResult;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

public class TestChecker {

    @Test
    public void testCheckCollisionViolations()
    {
        // setup
        Simulator simulator = mock();

        Scenario scenario = new Scenario("Case leading to a collision check returning false");

        // testing target
        Checker checker = new Checker(simulator);
        SimulationResult mockResult = new SimulationResult();
        when(simulator.run(scenario)).thenReturn(new SimulationResult());
        boolean isCollision = checker.checkCollisionViolations(scenario); // this invokes a null pointer exception due to the dummy simulator
        assertFalse(isCollision);


    }

}
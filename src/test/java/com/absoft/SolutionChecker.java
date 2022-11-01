package com.absoft;

import org.testng.Assert;
import org.testng.annotations.Test;

public class SolutionChecker {

    @Test
    public void testPositiveDiscriminant(){
        QuadraticEquationSolver EquationSolverPositiveDisc = new QuadraticEquationSolver(1,-4,-5);
        Solution.calculateValues(EquationSolverPositiveDisc);
        Assert.assertNotEquals(Solution.x1,Solution.x2,"Equations with positive discriminant should have non-equal roots.");
    }

    @Test
    public void testZeroDiscriminant(){
        QuadraticEquationSolver EquationSolverPositiveDisc = new QuadraticEquationSolver(1,-6,9);
        Solution.calculateValues(EquationSolverPositiveDisc);
        Assert.assertEquals(Solution.x1,Solution.x2,"Equations with zero discriminant must have equal roots.");
    }

    @Test
    public void testNegativeDiscriminant(){
        QuadraticEquationSolver EquationSolverPositiveDisc = new QuadraticEquationSolver(3,-4,2);
        Assert.assertNull(Solution.calculateValues(EquationSolverPositiveDisc));
    }

}

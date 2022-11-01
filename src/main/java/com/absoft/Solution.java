package com.absoft;

public class Solution {
    public static int x1;
    public static int x2;

    public Solution(int x1, int x2) {
    }

    public static Object calculateValues(QuadraticEquationSolver quadraticEquationSolver) {
        QuadraticEquationSolver.discriminant = (int) Math.pow(QuadraticEquationSolver.b, 2) - (4 * QuadraticEquationSolver.a * QuadraticEquationSolver.c);
        if (QuadraticEquationSolver.discriminant > 0) {
            x1 = (-QuadraticEquationSolver.b + (int) Math.sqrt(QuadraticEquationSolver.discriminant)) / (2 * QuadraticEquationSolver.a);
            x2 = (-QuadraticEquationSolver.b - (int) Math.sqrt(QuadraticEquationSolver.discriminant)) / (2 * QuadraticEquationSolver.a);
            return new Solution(x1, x2);
        } else if (QuadraticEquationSolver.discriminant == 0) {
            x1 = -QuadraticEquationSolver.b / (2 * QuadraticEquationSolver.a);
            x2 = -QuadraticEquationSolver.b / (2 * QuadraticEquationSolver.a);
            return new Solution(x1, x2);
        } else {
            return null;
        }
    }

}

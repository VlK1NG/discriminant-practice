package com.absoft;

public class Solution {
    public static int x1;
    public static int x2;

    public Solution(int x1, int x2) {
        this.x1 = x1;
        this.x2 = x2;
    }

    public static Object calculateValues(QuadraticEquationSolver quadraticEquationSolver) {
        QuadraticEquationSolver.discriminant = (int) Math.pow(QuadraticEquationSolver.b, 2) - (4 * QuadraticEquationSolver.a * QuadraticEquationSolver.c);
        if (QuadraticEquationSolver.discriminant > 0) {
            System.out.println("Discriminant = " + QuadraticEquationSolver.discriminant);
            x1 = (-QuadraticEquationSolver.b + (int) Math.sqrt(QuadraticEquationSolver.discriminant)) / (2 * QuadraticEquationSolver.a);
            x2 = (-QuadraticEquationSolver.b - (int) Math.sqrt(QuadraticEquationSolver.discriminant)) / (2 * QuadraticEquationSolver.a);
            System.out.println("x1=" + x1 + " " + "x2=" + x2);
            return new Solution(x1, x2);
        } else if (QuadraticEquationSolver.discriminant == 0) {
            System.out.println("Discriminant = " + QuadraticEquationSolver.discriminant);
            x1 = -QuadraticEquationSolver.b / (2 * QuadraticEquationSolver.a);
            x2 = -QuadraticEquationSolver.b / (2 * QuadraticEquationSolver.a);
            //System.out.println("x1=" + (int) x1 + " " + "x2=" + (int) x2);
            return new Solution(x1, x2);
        } else {
            System.out.println("no results");
            return null;
        }
    }

}

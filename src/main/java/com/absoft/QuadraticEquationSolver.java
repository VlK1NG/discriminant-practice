package com.absoft;

public class QuadraticEquationSolver {
    public static int a;
    public static int b;
    public static int c;
    public static int discriminant;

    public QuadraticEquationSolver(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public static Object calculateValues(QuadraticEquationSolver quadraticEquationSolver) {
        discriminant = (int) Math.pow(b, 2) - (4 * a * c);
        if (discriminant > 0) {
            Solution.x1 = (-b + (int) Math.sqrt(discriminant)) / (2 * a);
            Solution.x2 = (-b - (int) Math.sqrt(discriminant)) / (2 * a);
            return new Solution(Solution.x1, Solution.x2);
        } else if (QuadraticEquationSolver.discriminant == 0) {
            Solution.x1 = -QuadraticEquationSolver.b / (2 * QuadraticEquationSolver.a);
            Solution.x2 = -QuadraticEquationSolver.b / (2 * QuadraticEquationSolver.a);
            return new Solution(Solution.x1, Solution.x2);
        } else {
            return null;
        }
    }
}






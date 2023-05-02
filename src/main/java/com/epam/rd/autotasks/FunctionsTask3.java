package com.epam.rd.autotasks;

public class FunctionsTask3 {
    /**
     * <summary>
     * Implement code according to description of task.
     * </summary>
     * if set invalid arguments in method, then method must throws
     * IllegalArgumentException
     */
    public static int multiArithmeticElements(int a1, int t, int n) {
        int[] progressins = new int[n];
        int multiplier = a1;

        for (int i = 1; i<n ;i++){

            progressins[0] = a1;
            progressins[i] = progressins[i-1] + t;
            multiplier *= progressins[i];
        }

        return multiplier;

    }

    /*static int multiply(int a[], int n)
    {
        // Termination condition
        if (n == 0)
            return(a[n]);
        else
            return (a[n] * multiply(a, n - 1));
    }*/
}

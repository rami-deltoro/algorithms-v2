package org.algo.nthfibonacci;

import org.junit.jupiter.api.Test;

class NthFibonacciNumbersTest {

    private final NthFibonacciNumbers nthFibonacciNumbers = new NthFibonacciNumbers();

    @Test
    void getNthFib() {

        long number = nthFibonacciNumbers.getNthFib(12);
        long number2 = nthFibonacciNumbers.getNthFib2(12);

        System.out.println(number);
        System.out.println(number2);


    }
}
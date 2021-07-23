package com.kodilla.basic_assertion;

public class Application {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        int a = 10;
        int b = 5;
        int sumResult = calculator.sum(a, b);
        boolean correct = ResultChecker.assertEquals(15, sumResult);
        if (correct) {
            System.out.println("metoda sumowania liczb działa poprawnie, dla liczb " + a + " i " + b);
        } else {
            System.out.println("metoda sumowania liczb działa nie poprawnie, dla liczb " + a + " i " + b);
        }

        Calculator calculator1 = new Calculator();
        a = 10;
        b = 5;
        int subtractResult = calculator.subtract(a, b);
        boolean okay = ResultChecker.assertEquals(5, subtractResult);
        if (okay) {
            System.out.println("Metoda różnicy jest prawidlowa, dla liczb " + a + " i " + b);
        } else {
            System.out.println("Metoda różnicy jest nie prawidlowa, dla liczb " + a + " i " + b);
        }

        Calculator calculator2 = new Calculator();
        a = 10;
        b = 5;
        int PowResult = calculator.pow(a, b);
        boolean ok = ResultChecker.assertEquals(100000, PowResult);
        if (ok) {
            System.out.println("Metoda potęgowania jest prawidlowa, dla liczb " + a + " i " + b);
        } else {
            System.out.println("Metoda potęgowania jest nie prawidlowa, dla liczb " + a + " i " + b);
        }


    }
}

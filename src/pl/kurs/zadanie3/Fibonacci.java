package pl.kurs.zadanie3;


public class Fibonacci {
    public static void main(String[] args) {

        int fibonacciIndex = getFibonacciIndex(610);
        System.out.println(fibonacciIndex);

    }

    public static int getFibonacciIndex(int n) {
        if (n <= 1)
            return n;
        int a = 0;
        int b = 1;
        int c = 1;
        int result = 1;

        while (c < n) {
            c = a + b;
            result++;
            a = b;
            b = c;
        }

        if (getFibonacciNumber(result) == n)
            return result;
        else
            return -1;

    }

    public static int getFibonacciNumber(int number) {
        if (number == 0) return 0;
        else if (number == 1) return 1;
        else return getFibonacciNumber(number - 1) + getFibonacciNumber(number - 2);
    }
}

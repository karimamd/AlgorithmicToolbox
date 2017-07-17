
import java.util.Scanner;


public class Fibonacci {
    //TODO: implement stress test
    //TODO : implement method time calculator and comparator
    //TODO: error and corner cases if needed : entering sth other than a number or a float or a long also overflow
    private static long NaiveFibonacci(int n) {
        if (n <= 1)
            return n;

        return NaiveFibonacci(n - 1) + NaiveFibonacci(n - 2);
    }
//method/function returns a long because fibonacci can be very large numbers
    private static long MyFibonacci(int n) {
        if (n ==1||n==0)
            return n;
        else if(n<0)
        {
            System.out.println("error negative number entered!");
            return -1;

        }
        //notice array is long
        long fibonacciArray[]=new long[n];
        fibonacciArray[0]=0;
        fibonacciArray[1]=1;
        //making this loop will prevent calculating same fibonacci multiple times like naive algorithm
        //so this method calculates fibonacci of n in O(n)
        for (int i = 2; i <n ; i++) {
            fibonacciArray[i]=fibonacciArray[i-1]+fibonacciArray[i-2];

        }

        //returns last element of the array which is fibonacci of n (array starts with index 0 and ends with n-1)
        return fibonacciArray[n-1];
    }


    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        System.out.println("Naive:");

        long startTime = System.nanoTime();

        System.out.println(NaiveFibonacci(n));

        long stopTime = System.nanoTime();
        System.out.println("time elapsed: "+(stopTime - startTime)+" nano seconds ="+(stopTime - startTime)/Math.pow(10,9)+" seconds");


        System.out.println("Mine:");


        startTime = System.nanoTime();

        //sent n+1 as argument not n because arrays index starts with zero
        //so to calculate f[3] for example we need an array of 4 elements
        //f[0] f[1] f[2] and f[3]
        System.out.println(MyFibonacci(n+1));

        stopTime = System.nanoTime();
        System.out.println("time elapsed: "+(stopTime - startTime)+" nano seconds ="+(stopTime - startTime)/Math.pow(10,9)+" seconds");



        }
    }


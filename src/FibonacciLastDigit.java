import java.util.*;

public class FibonacciLastDigit {
    private static int getFibonacciLastDigitNaive(int n) {
        if (n <= 1)
            return n;

        int previous = 0;
        int current  = 1;

        for (int i = 0; i < n - 1; ++i) {
            int tmp_previous = previous;
            previous = current;
            current = tmp_previous + current;
        }

        return current % 10;
    }
    private static int myGetFibonacciLastDigit(int n) {
        if (n ==1||n==0)
            return n;
//        else if(n<0)
//        {
//            System.out.println("error negative number entered!");
//            return -1;
//
//        }
        //notice array is long
        int fibonacciArray[]=new int[n];
        fibonacciArray[0]=0;
        fibonacciArray[1]=1;
        //making this loop will prevent calculating same fibonacci multiple times like naive algorithm
        //so this method calculates fibonacci of n in O(n)
        for (int i = 2; i <n ; i++) {
            fibonacciArray[i]=(fibonacciArray[i-1]+fibonacciArray[i-2])%10;

        }

        //returns last element of the array which is fibonacci of n (array starts with index 0 and ends with n-1)
        return fibonacciArray[n-1];
    }


    static int Fib(int n){
        int y=1;
        int x=1;
        int z=0;
        for (int i=2;i<n;i++)
        {
            z=(x+y)%10;
            x=y%10;
            y=z%10;
        }
        return z;

    }




    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();


        System.out.println("Naive:");

        long startTime = System.nanoTime();

        System.out.println(getFibonacciLastDigitNaive(n));

        long stopTime = System.nanoTime();
        System.out.println("time elapsed: "+(stopTime - startTime)+" nano seconds ="+(stopTime - startTime)/Math.pow(10,9)+" seconds");

        System.out.println("Mine:");
        startTime = System.nanoTime();

        System.out.println(myGetFibonacciLastDigit(n+1));

        stopTime = System.nanoTime();
        System.out.println("time elapsed: "+(stopTime - startTime)+" nano seconds ="+(stopTime - startTime)/Math.pow(10,9)+" seconds");


        System.out.println("Ahmed:");
        startTime = System.nanoTime();

        System.out.println(Fib(n));

        stopTime = System.nanoTime();
        System.out.println("time elapsed: "+(stopTime - startTime)+" nano seconds ="+(stopTime - startTime)/Math.pow(10,9)+" seconds");

    }
}


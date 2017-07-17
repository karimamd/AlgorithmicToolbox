import java.util.*;

public class FibonacciHuge {
    private static long getFibonacciHugeNaive(long n, long m) {
        if (n <= 1)
            return n;

        long previous = 0;
        long current  = 1;

        for (long i = 0; i < n - 1; ++i) {
            long tmp_previous = previous;
            previous = current;
            current = tmp_previous + current;
        }

        return current % m;
    }
    private static int GetFibonacciHugeImprovement(int n,int m) {
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
            fibonacciArray[i]=(fibonacciArray[i-1]+fibonacciArray[i-2])%m;

        }

        //returns last element of the array which is fibonacci of n (array starts with index 0 and ends with n-1)
        return fibonacciArray[n-1];
    }



    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long n = scanner.nextLong();
        long m = scanner.nextLong();
        System.out.println(getFibonacciHugeNaive(n, m));
    }
}


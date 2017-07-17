import java.util.*;

public class GCD {
  private static int gcd_naive(int a, int b) {
    int current_gcd = 1;
    for(int d = 2; d <= a && d <= b; ++d) {
      if (a % d == 0 && b % d == 0) {
        if (d > current_gcd) {
          current_gcd = d;
        }
      }
    }

    return current_gcd;
  }

  private static int myGCD(int a, int b) {


     if(b==0)
    {
      return a;
    }
    //else : return absolute value in case of negative number entered

    return  Math.abs(myGCD(a,b%a));
   // return myGCD(b,a%b);

  }

  public static void main(String args[]) {
    Scanner scanner = new Scanner(System.in);
    int a = scanner.nextInt();
    int b = scanner.nextInt();


    System.out.println("Naive:");

    long startTime = System.nanoTime();

    System.out.println(gcd_naive(a, b));

    long stopTime = System.nanoTime();
    System.out.println("time elapsed: "+(stopTime - startTime)+" nano seconds ="+(stopTime - startTime)/Math.pow(10,9)+" seconds");

    System.out.println("Mine:");
    startTime = System.nanoTime();

    System.out.println(myGCD(a,b));

    stopTime = System.nanoTime();
    System.out.println("time elapsed: "+(stopTime - startTime)+" nano seconds ="+(stopTime - startTime)/Math.pow(10,9)+" seconds");

  }
}

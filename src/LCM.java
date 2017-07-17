import java.util.*;

public class LCM {
  private static long lcm_naive(int a, int b) {
    for (long l = 1; l <= (long) a * b; ++l)
      //mod
      if (l % a == 0 && l % b == 0)
        return l;

    return (long) a * b;
  }
  //improvement but still slow
private static long lcm_naive_improvement(int a,int b)
{
//LCM is at least equal to least number
  for (long l = Math.min(a,b); l <= (long) a * b; ++l)
    //mod
    if (l % a == 0 && l % b == 0)
      return l;

  return (long) a * b;

}
/*
TODO:
trying to prove that LCM(a,b)=a*b/GCD(a,b)
GCD of a and b is same as GCD of a' and b where a'=a%b for a>b
max(a,b) is the GCD of a*b and max(a,b)
a*b  is the MCM of a and b
GCD is between 1 and min(a,b)
LCM is between max(a,b) and a*b


 */

  private static int myGCD(int a, int b) {


    if(b==0)
    {
      return a;
    }
    //else : return absolute value in case of negative number entered

    //return  Math.abs(myGCD(a,b%a));
    return myGCD(b,a%b);

  }
  private static long my_lcm(int a,int b)
  {
    return a*b/myGCD(a,b);
  }
  public static void main(String args[]) {
    Scanner scanner = new Scanner(System.in);
    int a = scanner.nextInt();
    int b = scanner.nextInt();

   // System.out.println(lcm_naive(a, b));
      System.out.println(my_lcm(a, b));
  }
}

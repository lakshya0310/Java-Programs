package XI_Class.Numbers;
import java.util.*;
public class PrimeNumbersInANumber
{
    public void main()
    {  Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
        int n1 = n ;
        int c = 0 ;
        for(;n!=0;n/=10)
        {   int t = n;
            System.out.print(t);
            if(isPrime(t))
              {   System.out.print("...."+"yes");
                  c++;
                }
                else{ System.out.print("...."+"no");
                }
                System.out.println();
        }
        n=n1;
        System.out.println("The number of primes in "+n+" is....."+c);
    }
    boolean isPrime(int n)
    { int c = 0;
     for(int i = 1;i<=n;i++)
     { if(n%i==0)
         c++;
        }    
       return c==2;
    }
}

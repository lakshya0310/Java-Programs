package XI_Class.Numbers;

import java.util.*;
/**
 * WAP to print for printing TWISTED PRIMES in a range
 */
public class twisted_prime_range
{
    boolean isPrime(int x)
    {   int c = 0 ;
        for(int i = 1 ; i<=x ; i++)
        { if(x%i==0)
            c++;
        }
        if(c==2)
        return true;
        else
        return false;
    }
    int reversenum(int x)
     { int c = countdigits(x) ;
         c--;
         int rev = 0;
         for(;x!=0 ; x/=10)
         { rev = rev + (int)Math.pow(10,c--)*(x%10);
         }
         return rev;
     }
   int countdigits(int x)
    { int c = 0;
        for(;x!=0;x/=10)
        c++;
        return c;
    }
    void main()
    {Scanner sc = new Scanner(System.in);
     System.out.println("Give a Range of Numbers");
     int x = sc.nextInt();
     int y = sc.nextInt();
     System.out.println("EMIRPs in the given range are");
     for(int i=x;i<=y;i++)
     {boolean x1 = isPrime(i);
     int y2 = reversenum(i);
     boolean x2 = isPrime(y2);
     if(x1==true&&x2==true)
     System.out.println(i);
    }
}
}


package XI_Class.Numbers;

import java.util.*;
/**
 * WAP to check whether number is TWISTED PRIME or EMIRP number or not.(A number is said to 
 * be emirp number if its is also a prime
 */
public class twisted_prime
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
     System.out.println("Enter a number to be checked for");
     int x = sc.nextInt();
     boolean x1 = isPrime(x);
     int y = reversenum(x);
     boolean x2 = isPrime(y);
     if(x1==true&&x2==true)
     System.out.println("The Given Number is EMIRP"); 
     else
     System.out.println("The Given Number is not EMIRP"); 
    }
}

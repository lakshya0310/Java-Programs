package XI_Class.Numbers;
import java.util.*;
/**
 * WAP a semi prime or bi prime number or not 
 * (semi prime or bi prime is natural number which is a product of exactly two prime numbers)
 */
public class biprime
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
   void main()
   { Scanner sc = new Scanner(System.in);
       System.out.println("Enter a number");
       int x  = sc.nextInt();
       int c = 0;
       for(int i = 2 ; i<=x ; i++)
       { if(x%i==0)
           { boolean x1 = isPrime(i);
               int n = x/i;
               boolean x2 = isPrime(n);
               if(x1==true&&x2==true)
               {c=1;
                break;}
            }
       }
       if(c==1)
       System.out.println("The given number is a BI Prime");
       else
       System.out.println("The given number is not a BI Prime");
    }
}

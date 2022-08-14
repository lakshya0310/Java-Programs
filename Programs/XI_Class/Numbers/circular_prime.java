package XI_Class.Numbers;

import java.util.*;
/**
 * WAP a program to check whether a number is circular prime
 */
public class circular_prime
{
  int noOfDigits(int x)
  { int c = 0;
        for(int r=x%10;x!=0;x/=10)
        {c++;}
        return c;
  }
  boolean isPrime(int x)
  { int c = 0;
     for(int i = 1;i<=x;i++)
     { if(x%i==0)
         c++;
        }    
       return c==2;
  }
  int circularNo(int x)
    { int d = noOfDigits(x);
        int y =(int)x%(int)Math.pow(10,(d-1))*10;
        int t = (int)x/(int)Math.pow(10,(d-1))+y;
      return t;
    }
  void main()
    { Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int x = sc.nextInt();
        if(x>9)
        {int y = x ;
        for(int c = noOfDigits(y);c>=0;c--)
        { if(isPrime(y))
            {System.out.println(y);
            if(circularNo(y)==x)
                {System.out.println(x+" is a Circular Prime");
                break;}
              else
              y=circularNo(y);
            }
            else
            System.out.println(x+" is not a Circular prime");
            }
      }
       else
      System.out.println("Invalid Number");
    }
}


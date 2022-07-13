package XI_Class.Numbers;


/**
 * A MOBIUS function M(N) returns the value -1 or 0 or 1 for a natural number (N) by the 
following conditions are defined:
When,
M ( N ) = 1 if N=1.
M ( N ) = 0 if any prime factor of N is contained more than once.
M ( N ) = ( -1 )P
if N is the product of ‘P’ distinct prime factors.
Write a program to accept a positive natural number (N) and display the MOBIUS result with 
proper message. Design your program which will enable the output in the format given 
below:
Sample 1
INPUT:78
OUTPUT: 78 = 2 x 3 x 13
NUMBER OF DISTINCT PRIME FACTORS = 3
M(78) = -1
Sample 2
INPUT:34
OUTPUT: 34 = 2 x 17
NUMBER OF DISTINCT PRIME FACTORS = 2
M(34) = 1
Sample 3
INPUT:12
OUTPUT: 12 = 2 x 2 x 3
DUPLICATE PRIME FACTORS
M(12) = 0
Sample 4
INPUT:1
OUTPUT: 1 = 1
NO PRIME FACTORS
M(1) = 1
 */
import java.util.*;
public class MOBIUS_Function
{
    int n ;
    MOBIUS_Function()
    {
        n = 0;
    }
     
    void input()
    {
        Scanner sc = new Scanner(System.in);    
        System.out.print("Enter a number : ");
        n = sc.nextInt();
    }
    int primeFac()
    {
        int a=n, i=2, m=0, c=0, f=0;
         System.out.print(n+"= ");
        while(a > 1) 
        {
            c = 0; 
            while(a%i == 0)
            {
                c++; 
                f++; 
                a=a/i;
                System.out.print(i+"x");
            }
                i++;
 
            if(c > 1) 
                return 0;
        }
        System.out.println();
        return f; 
    }
     
    void display()
    {
        int mob,x;
        if(n == 1) 
            mob = 1;
        else
        {
            x = primeFac();
            if(x == 0) 
                {mob = 0;
                System.out.println("Duplicate prime numbers");}
            else 
               {   System.out.println("Number of distinct prime factors= "+x);
                   mob = (int)Math.pow(-1,x);
                }
        }
        System.out.println("M("+n+") ="+mob);
    }
     public static void main()
    {
        MOBIUS_Function ob = new MOBIUS_Function();     
        ob.input();
        ob.display();     
    }
}
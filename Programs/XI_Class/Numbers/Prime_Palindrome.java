package XI_Class.Numbers;
import java.util.*;
public class Prime_Palindrome
{ 
    public void main()
    { Scanner sc = new Scanner(System.in);
       System.out.println("Enter range for Prime Palindrome");
       int m = sc.nextInt();
       int n = sc.nextInt();
       
       int c = 0;
       if((m<3000 && n<3000) && m<n )
       {   System.out.println("THE PRIME PALINDROME INTEGERS ARE:");
           for(int i = m ; i<=n ; i++)
           { if(isPrime(i) && isPalindrome(i))
               { System.out.print(i+" ");
                   c++;
                }
           }
           System.out.println();
           System.out.println("FREQUENCY OF PRIME PALINDROME : "+c);
       }
       else
       { System.out.println("Invalid Input");
        }
    }
    boolean isPrime(int x)
    {
        int c = 0;
        for(int i = 1 ; i<=x ; i++)
        { if(x%i==0)
            c++;
        }
        if(c==2)
        return true;
        else 
        return false;
    }
    boolean isPalindrome(int y)
    {
        int p = 0;
        int t = y;
        while(t!=0)
        { p = p*10 + (t%10);
            t/=10;
        }
        if(p==y)
        return true;
        else
        return false;
    }
}

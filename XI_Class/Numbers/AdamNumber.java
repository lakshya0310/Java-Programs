package XI_Class.Numbers;


/** WAP to accept a range and print all Adam numbers between the range(both limits included)
 */
import java.util.*;
public class AdamNumber
{
    int m;
    int n;
    AdamNumber()
    { m=0;
      n=0;
    }
     public void main()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the range , m<=n");
        m=sc.nextInt();
        n=sc.nextInt();
        if(m<=n)
        {
            int count = 0 ;
            System.out.println("THE PRIME-ADAM INTEGERS ARE ");
            for(int i = m ; i<=n ; i++)
            { 
                if(isPrime(i) && isAdam(i))
                 {System.out.print(i+" ");
                  count++;
                 }
                
            }
           if(count==0)
                System.out.print("NIL");
                System.out.println("\nFREQUENCY OF PRIME-ADAM INTEGERS IS: "+count);
        }
        else
        { System.out.println("INVALID INPUT");
        }
    }
    boolean isPrime(int x)
    {
        int c = 0;
        for(int i = 1;i<=x;i++)
        { 
            if(x%i==0)
            c++;
        }
        if(c==2)
        return true;
        else 
        return false;
    }
    int reverse(int n)
    { 
        int num=0;
        while(n!=0)
        { int r=n%10;
          num = num*10 + r ;
          n /= 10;
        }
        return num;
    }
    boolean isAdam(int x)
    {
        int y = reverse(x);
        if(x*x == reverse(y*y))
        return true;
        else
        return false;
    }
}

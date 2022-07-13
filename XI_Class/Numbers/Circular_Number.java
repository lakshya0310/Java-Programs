package XI_Class.Numbers;
import java.util.*;
public class Circular_Number
{
    public void main()
    { 
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int N = sc.nextInt();
        int k = 0 ;
        if(N>0)
        { 
            String n = Integer.toString(N);
            int digits = n.length();
            int i ;
            if(prime(N))
             {  int t = N;
                 System.out.println(t);
                 for(i = 0; i<digits-1 ; i++)
                {   
                    String n1 = n.substring(1)+n.charAt(0); 
                    t = Integer.parseInt(n1);
                    System.out.println(t);
                    if(prime(t)==true)
                        k++;
                     n = Integer.toString(t);
                }
                if(k==i)
                System.out.println(" Is a Circular Prime");
                else
                System.out.println(" Is a not Circular Prime");
            }
            else
            { System.out.println("Not a Circular Prime");
            }
        }
    }

    public boolean prime(int t)
    {
        int k1 = 0;
        for(int i = 1 ; i <= t ; i++)
        { if(t%i==0)
            k1++;
        }
        if(k1==2)
        return true ;
        else 
        return false;
    }
}

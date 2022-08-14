package XI_Class.Numbers;
/**WAP to accept a number and perform prime factorisation*/
import java.util.*;
public class prime_factorisation
{
    void primefactorisation(int x)
    {   System.out.println("The prime factorization of " + x + " are...");
        for(int i = 2 ; x!=1 ; )
        { if(x%i==0)
            { System.out.println(i);
                x=x/i ;
            } 
            else 
            i++;
        }
    }
    void main()
    {Scanner sc = new Scanner(System.in);
    System.out.println("Enter a number .....");
    int x = sc.nextInt();
    primefactorisation(x);
   }
}

package XI_Class.Numbers;
import java.util.*;
public class Smith_Number
{
    public void primeFactor(int n)
    { 
        int x = n;
        int sum = 0;
        int i = 2 ;
        while(x!=1)
        {
            if(x%i==0)
            {
                x=x/i;
                System.out.println(i);
                sum+=sumOfDigits(i);
            } 
            else
            i++;
        }
        if(sum == sumOfDigits(n))
        System.out.println("Is Smith Number");
        else
        System.out.println("Not a Smith Number");
    }
    int sumOfDigits(int x)
    { 
        int sum = 0 ;
        while(x!=0)
        { int r = x%10;
            sum = sum + r;
            x/=10;
        }
        return sum;
    }
    public void main()
    {
        Smith_Number obj = new Smith_Number();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number ");
        int n = sc.nextInt();
        obj.primeFactor(n);
        
    }
}

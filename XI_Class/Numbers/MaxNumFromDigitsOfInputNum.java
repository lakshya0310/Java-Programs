package XI_Class.Numbers;;
import java.util.*;
public class MaxNumFromDigitsOfInputNum
{
    public void main()
    { Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number.....");
        int n = sc.nextInt();
        int f = n ;
        int c = 0;
        for(;n!=0 ; n/=10)
        { c++;
        }
        n=f;
        int s = 0 ;
        for(int i = 9 ; i>=0 ; i--)
        {  n=f;
            for(int r=0;n!=0 ; n/=10)
            { r=n%10;
                if(r==i)
                    s=s+i*(int)Math.pow(10,--c);
            }
        }
        
        System.out.println("The largest number from the digits of given number = "+s);
    }
}

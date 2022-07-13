package XI_Class.Numbers;
import java.util.*;
public class remove0fromnum
{
    public void main()
    {   Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
         int num = 0 ;
         int t = n;
         int c = 0;
         while(n!=0)
         {int r=n%10;
             if(r!=0)
             num=num+r*(int)Math.pow(10,c++);
             n=n/10;
          }
          System.out.println("The number after removing zeroes....."+num);
    }
}

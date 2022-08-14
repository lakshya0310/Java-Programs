package XI_Class.Numbers;
import java.util.*;
public class MultipleHarshad
{
    public void main()
    { Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number.....");
        int n = sc.nextInt();
        int f = n ;
        int c = 0,s=0;
        for(int r = 0 ; n != 0 ; n /= 10)
        {  r=n%10;
           s=s+r;
        }
        if(s==1||f<10)
            c=1;
        else
        { n=f;
            for(;true;)
            {int t = n;
                s=0;
                for(int r = 0;n!=0;n/=10)
                { r=n%10;
                    s=s+r;
                }
                if(t%s==0)
                { if(s==1)
                        break;
                    n=t/s;
                    if(n>=0 && n<=9)
                        break;
                }
                else
                { c=1;
                    break;
                }
            }
        }
        if(c==1)
            System.out.println(f+" is not Multiple Harshad number");
        else
            System.out.println(f+" is Multiple Harshad number");
    }
}
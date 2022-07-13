package XI_Class.Numbers;
import java.util.*;
public class Fascinating_Number
{
    public void main()
    {
        Fascinating_Number obj = new Fascinating_Number();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a range to be checked");
        int n = sc.nextInt();
        int m = sc.nextInt();
        System.out.println("The Fascinating Number between "+n+" and "+m+" is....");
        int c = 0;
        if(n<m && n>=100 && m<1000)
        {
             for(int i = n; i<=m; i++)
            {
                long N = digitsN(i);
                //System.out.println(i + "    " + N);
                if(isFascinatingNumber(N)==true)            
                { 
                    System.out.print(i+" ");
                    c++;
                }
                
            }
            System.out.println();
            if(c==0)
                System.out.println("Nil");
            System.out.println("Frequency of Fascinating Number is: "+c);
        }
    }

    long digitsN(int n)
    { 
        String number = Integer.toString(n*1)+Integer.toString(n*2)+Integer.toString(n*3);
        long N =Long.parseLong(number);
        return N;
    }

    public boolean isFascinatingNumber(long N)
    {   boolean flg =true; 
        long t = N ;
        for(int i = 1 ; i<=9 ; i++)
        {   N=t;
            int c = 0;
            while(N!=0)
            { long r = N%10;
                N=N/10;
                if(i==r)
                    c++;
            }
            if(c!=1)
            {flg = false;
                break;}
        }
        return flg;
    }
}

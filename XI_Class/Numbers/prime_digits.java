package XI_Class.Numbers;
import  java.io.*; 
public class prime_digits
{
   void main() throws IOException
   { InputStreamReader obj = new InputStreamReader(System.in);
       BufferedReader buff = new BufferedReader(obj);
       System.out.println("Enter a Number");
       int n = Integer.parseInt(buff.readLine());
       digitSeper(n);
   }
   void digitSeper(int n)
   {  System.out.println("The Prime Digits are : "); 
       for(int d=n%10 ; n!=0 ; n=n/10)
       {   d = n%10;
           if(isPrime(d))
           System.out.println(d);
       }
   }
   boolean isPrime(int p)
   { int c = 0; 
      for(int i = 1 ; i<=p ; i++)
      { if(p%i==0)
          c++;
      }
      return c==2 ;
   }
}

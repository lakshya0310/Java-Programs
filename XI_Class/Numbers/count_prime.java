package XI_Class.Numbers;
import  java.io.*; 
public class count_prime
{
   void main() throws IOException
   { InputStreamReader obj = new InputStreamReader(System.in);
       BufferedReader buff = new BufferedReader(obj);
       System.out.println("Enter a Number");
       int n = Integer.parseInt(buff.readLine());
       num_halves(n);
   }
    void num_halves(int n)
   { int d = digit_count(n);
     int c = d/2;
     int n1 = n/(int)Math.pow(10,c);
     System.out.println("The no. of prime digits in first half("+n1+") is "+digitSeper(n1));
     int n2 = n%(int)Math.pow(10,c);
     System.out.println("The no. of prime digits in second half("+n2+") is "+digitSeper(n2));

   }
   int digitSeper(int n)
   {  int c = 0 ;
       for(int d=n%10 ; n!=0 ; n=n/10)
       {   d = n%10;
           if(isPrime(d))
           c++;
       }
       return c ;
   }
   int digit_count(int n)
   { int c = 0 ;
       for(int d=n%10 ; n!=0 ; n=n/10)
       {   c++;
       }
       return c ; 
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

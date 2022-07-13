package XI_Class.Numbers;
/**
 *Write a program to accept a number and check if it is unique
 */
import java.io.*;
public class unique
{ 
    public void main()
    { InputStreamReader obj = new InputStreamReader(System.in);
      BufferedReader buf = new BufferedReader(obj);
      int n = 0;
      while(true)
      {
       try
       {
         n = Integer.parseInt(buf.readLine());
       }
       catch(NumberFormatException ob)
       { System.out.println("Enter a digit only");
          continue;
       }
       catch(Exception ob)
       { System.out.println("Enter a digit only");
          continue;
       }
       if(n>=0)
       break;
       else
       { System.out.println("Enter a positive number only");
       }
      }
       int c=0 ;
      for(int i = 0 ; i<=9 ; i++)
      {  c = 0 ;
          int t = n;
          for(;t!=0;t/=10)
          { int r = t%10;
              if(r==i)
              c++;
            }
          if(c>=2)
            System.out.println(n+" is not a unique number");
           
      }
      if(c==1)
      System.out.println(n+" is a unique number");
      else if(c==0)
      System.out.println(n+" is a unique number");
      else;
    }
}

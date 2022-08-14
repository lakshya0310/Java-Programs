package XI_Class;
import java.io.*;
import java.lang.*;
public class wordsequence //start of class
{ 
    public void main() throws IOException //start of main method
    {
       InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
      String sc="";
      abc:
       while(true)
       {
         System.out.println("Enter a String/Word");
         sc =br.readLine();
         for(int i = 0; i<sc.length() ; i++)
         { 
           char ch1 = sc.charAt(i);
           if(Character.isUpperCase(ch1));
           else
           {
             System.out.println("Error");
             continue abc;
           }
       }
       break;
     }
        
        String Alpha = "" ,nonAlpha="";
        for(int k = 65 ; k<=90 ; k++) //displays letter in alphabetical order 
        {   char ch = (char)k;
            int j = 0 ;
            for(int i = 0; i<sc.length() ; i++)
            {
               char ch1 = sc.charAt(i);

                if(ch1==ch)
                { Alpha = Alpha+ch;
                    j++;
                  
                }
            }  
            if(j==0)     
            nonAlpha=nonAlpha+ch;     
        }
        System.out.println(Alpha);
      
        System.out.println(nonAlpha);
    } //end of main method
} //end of class

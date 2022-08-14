package XI_Class.Files;
/**
 * WAP to create a file to create a file binary.dat to store the decimal number and its equivalent binary
 */
import java.util.*;
import java.io.*;
public class Binary_Decimal
{
    public void main() throws IOException
    { 
        Scanner sc = new Scanner(System.in);
        DataOutputStream obj = new DataOutputStream(new FileOutputStream("binary.dat"));
        
        for(int i=1;i<=5;i++)
        { 
            System.out.println("Enter a number");
            int x=sc.nextInt();
            obj.writeInt(x);
            obj.writeInt(decimalToBinary(x));
            
        }
        
        obj.close();
        DataInputStream obj1 = new DataInputStream(new FileInputStream("binary.dat"));
            
        try
        {
            
            System.out.println("DECIMAL NUMBER\t BINARY NUMBER");
            for(;true;)
            {
                System.out.println(obj1.readInt()+"\t\t"+obj1.readInt());
            }
            
        }
        catch(EOFException obj2)
        {
            
        }
        finally
        { obj1.close();
        }
    }
    int decimalToBinary(int n)
    { 
        int t=n;
        String str="";
        while(n>0)
        {
            int r=n%2;
            n=n/2;
            str = r+str;
        }
         
        return Integer.parseInt(str);
    }
}

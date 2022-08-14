package XI_Class.Files;
/**
 * Write a program to accept 5 sentences and store in a file named as Sentence.txt.
 * Create 3 text files upper.txt, lower.txt, special.txt. and print them later with proper headings.
 */
import java.util.*;
import java.io.*;
public class SeparateCharacterFiles
{
    public void main() throws IOException
    {
        Scanner sc = new Scanner(System.in);
        PrintWriter obj = new PrintWriter(new BufferedWriter(new FileWriter("Sentence.txt")));
        
        System.out.println("Enter Five Sentences");
        for(int i = 1 ; i<=5 ; i++)
        { System.out.println("Enter Sentence...."+i);
            obj.println(sc.nextLine());
        }
        obj.close();
        
        BufferedReader obj1 = new BufferedReader(new FileReader("Sentence.txt"));
        PrintWriter obj2 = new PrintWriter(new BufferedWriter(new FileWriter("upper.txt")));
        PrintWriter obj3 = new PrintWriter(new BufferedWriter(new FileWriter("lower.txt")));
        PrintWriter obj4 = new PrintWriter(new BufferedWriter(new FileWriter("special.txt")));
        char a = ' ' ;
        for(;(a = (char)obj1.read())!=-1;)
        {   
            if(Character.isUpperCase(a))
            obj2.print(a);
            else if(Character.isLowerCase(a))
            obj3.print(a);
            else
            obj4.print(a);
        }
        obj1.close();
        obj2.close();
        obj3.close();
        obj4.close();
        
        System.out.println("The Upper Case Letters in the file are : ");
        BufferedReader obj5 = new BufferedReader(new FileReader("upper.txt"));
        char ch1 = ' ';
        for( ;(ch1=(char)obj5.read())!=-1; )
        { 
            System.out.print(ch1);
        }
        obj5.close();
        
        System.out.println("The Lower Case Letters in the file are : ");
        BufferedReader obj6 = new BufferedReader(new FileReader("lower.txt"));
        ch1 = ' ';
        for( ;(ch1=(char)obj6.read())!=-1; )
        { 
            System.out.print(ch1);
        }
        obj6.close();
        
        System.out.println("The Special Letters in the file are : ");
        BufferedReader obj7 = new BufferedReader(new FileReader("special.txt"));
        ch1 = ' ';
        for( ;(ch1=(char)obj7.read())!=-1; )
        { 
            System.out.print(ch1);
        }
        obj7.close();
    }
}

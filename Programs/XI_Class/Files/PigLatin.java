package XI_Class.Files;
/**
 * Write a program to accept few words in a file named as Words.txt. 
 * Create a new file named as piglatin.txt which stores the piglatin form of each word
 */
import java.util.*;
import java.io.*;
public class PigLatin
{
    public void main() throws IOException
    {
        Scanner sc = new Scanner(System.in);
        PrintWriter obj = new PrintWriter(new BufferedWriter(new FileWriter("Words.txt")));
        System.out.println("Enter 5 words");
        for(int i = 1 ; i<=5 ; i++)
        { 
            obj.println(sc.nextLine());
        }
        obj.close();
        
        BufferedReader obj1 = new BufferedReader(new FileReader("Words.txt"));
        PrintWriter obj2 = new PrintWriter(new BufferedWriter(new FileWriter("piglatin.txt")));
        String str = "";
        for(;(str=obj1.readLine())!=null;)
        { 
            obj2.println(piglatin(str));
        }
        obj1.close();
        obj2.close();
    }
    String piglatin(String str1)
    {   int i = 0;
        for(i = 0 ; i<str1.length() ; i++)
        { char ch = str1.charAt(i);
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')
            break;
        }
        String pig = (str1.substring(i)).concat((str1.substring(0,i)).concat("AY"));
        return pig;
    }
}

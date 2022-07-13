package XI_Class.Files;
import java.util.*;
import java.io.*;
/**
 * WAP to create a text file anagram.txt with the following details
 * Accept 10 sets of words from the user 
 * Store them in file and also whether they are anagrams or not
 */
public class anagram
{
    public void main() throws IOException
    { 
        Scanner sc = new Scanner(System.in);
        FileWriter obj1 = new FileWriter("anagram.txt");
        BufferedWriter obj2 = new BufferedWriter(obj1);
        PrintWriter obj3 = new PrintWriter(obj2);

        System.out.println("Enter 10 sets of words..");
        for(int i = 1 ; i <= 10 ; i++)
        { System.out.println("Enter two words - set "+i);
            String w1 = sc.nextLine();
            String w2 = sc.nextLine();
            obj3.println(w1);
            obj3.println(w2);
            obj3.println(isAnagram(w1 , w2));
        }
        obj3.close();
        obj2.close();
        obj1.close();     
        sc.close();
        
        printAnagrams();
    }

    boolean isAnagram(String s1 , String s2)
    {   s1 = s1.toLowerCase();
        s2 = s2.toLowerCase();
        boolean flag = true;
        if(s1.length() == s2.length())
        { 
            for(int i = 97 ; i <= 122 ; i++)
            { char ch = (char)i;
                int c1 = 0 ;
                int c2 = 0 ;
                for(int j = 0 ; j<s1.length() ; j++)
                { char ch1 = s1.charAt(j);
                    char ch2 = s2.charAt(j);
                    if(ch1==ch)
                        c1++;
                    if(ch2==ch)
                        c2++;

                }
                if(c1!=c2)
                { flag = false;
                    break;
                }
            }
        }
        else 
        {flag = false;}

        return flag;
    }
    void printAnagrams() throws IOException
    { FileReader obj4 = new FileReader("anagram.txt");
      BufferedReader obj5 = new BufferedReader(obj4);
      String a = "";
      System.out.println("The Anagram word sets");
      for(;(a=obj5.readLine())!=null;)
      { 
          String b=obj5.readLine();
          String c=obj5.readLine();
          if(c.equals("true"))
          System.out.println(a+"\t"+b);
      }
      obj5.close();
      obj4.close();
    }
}

package XI_Class.Strings;

import java.util.*;
/**
WAP to accept a sentence and display it after removing all vowels
 */
public class deletevowelString
{
    public void main()
    { Scanner sc = new Scanner(System.in);
        System.out.println("Enter a sentence"); 
        String s = sc.nextLine();

        String s1 = "";

        for(int i = 0 ; i<s.length() ; i++)
        {char ch = s.charAt(i);
          if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U');
          else
          { s1 = s1+ch;
           }
        }
        System.out.println("Original sentence...."+s); 
        System.out.println("Modified sentence...."+s1);
    }
}

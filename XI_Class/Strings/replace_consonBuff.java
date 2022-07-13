package XI_Class.Strings;
import java.util.*;
/**
WAP to accept a sentence and display it after removing all vowels
 */
public class replace_consonBuff
{
    public void main()
    { Scanner sc = new Scanner(System.in);
        System.out.println("Enter a sentence"); 
        StringBuffer sb =new StringBuffer(sc.nextLine());
        System.out.println("Original sentence...."+sb); 
        for(int i = 0 ; i<sb.length() ; i++)
        {char ch = sb.charAt(i);
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')
                ;
            else
            { sb.setCharAt(i,'*');
            }
        }
        System.out.println("Modified sentence...."+sb);
    }
}
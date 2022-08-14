package XI_Class.Strings;
import java.util.*;
public class sentenceAlpha
{ 
    public void main()
    {  Scanner sc = new Scanner(System.in);
        System.out.println("Enter a sentence");
        String s = sc.nextLine();
        s = s.toUpperCase();
        StringTokenizer st = new StringTokenizer(s);
        
        int c = st.countTokens();
        String arr[] = new String[c];
        for(int i = 1 ; i <= c ; i++)
        { arr[i-1] = st.nextToken();
        }
        String s1 = "";
        String s2 = "";
        for(int i = 0 ; i<arr.length ; i++)
        {  s = arr[i];
            s1="";
            for(char ch='A' ; ch <= 'Z' ; ch++)
            { for(int j = 0 ; j<s.length() ; j++)
                { if(ch==s.charAt(j))
                    s1 = s1+ch;
                }
            }
            s2 = s2 + s1 + " ";
        }
        System.out.println(s2);
    }
}

package XI_Class.Strings;
import java.util.*;
public class Alphabeticalpattern
{
    public void main()
    { Scanner sc = new Scanner(System.in);
        System.out.println("Enter a word");
        String s = sc.nextLine();
        String Alpha = "";
        for(int k = 65 ; k<=90 ; k++) //displays letter in alphabetical order 
        {   char ch = (char)k;
            int j = 0 ;
            for(int i = 0; i<s.length() ; i++)
            {
                char ch1 = s.charAt(i);

                if(ch1==ch)
                { Alpha = Alpha+ch;
                    j++;

                }
            }  
        }
        System.out.println(Alpha);
        String str = "";
        for(int i = 0 ; i<Alpha.length() - 1 ;i++)
        { char ch = Alpha.charAt(i);
            char ch1 = Alpha.charAt(i+1);
            if(ch==ch1)
                str=str+ch;
            else{
                for(char x = ch ; x<ch1 ; x++)
                {str=str+x;
                }
            }
        }
             str=str+Alpha.charAt(Alpha.length()-1);
             System.out.println(str);
    } //end of main method
}


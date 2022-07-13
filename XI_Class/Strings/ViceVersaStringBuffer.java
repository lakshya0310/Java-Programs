package XI_Class.Strings;
import java.util.*;
public class ViceVersaStringBuffer
{ 
    public void main()
    { Scanner sc = new Scanner(System.in);
        System.out.println("Enter a sentence");
        StringBuffer sb = new StringBuffer(sc.nextLine());
        System.out.println("Original sentence...."+sb);
        for(int i = 0 ; i< sb.length() ; i++)
        { char ch = sb.charAt(i);
            if(Character.isLetter(ch))
            { if(Character.isLowerCase(ch))
                sb.setCharAt(i , Character.toUpperCase(ch));
              else
              {sb.setCharAt(i , Character.toLowerCase(ch));}
            }
        }
        System.out.println("Modified sentence...."+sb);
    }
}

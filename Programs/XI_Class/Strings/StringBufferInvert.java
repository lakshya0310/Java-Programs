package XI_Class.Strings;

// package XI_Class;
import java.util.*;
import java.io.*;
//String Buffer
public class StringBufferInvert
{
public static void main()
{ Scanner obj = new Scanner(System.in);
  StringBuffer sb;
  System.out.println("Enter a sentence...");
  sb=new StringBuffer(obj.nextLine());

  System.out.println("Original Sentence...  "+ sb );

  StringTokenizer st =new StringTokenizer(sb.toString());
  int c=st.countTokens();

  //skipping the initial spaces
  int j=0;
  while(true)
  {
    if(sb.charAt(j)==' ')
     j++;
    else
     break;

  }
  abc:
  for(int i=1 ; i<=c ; i++)
  {
     StringBuffer sb1 = new StringBuffer(st.nextToken());

     //swapping the first and the last letter of the word
     char ch=sb1.charAt(0);
     sb1.setCharAt(0 , sb1.charAt(sb1.length()-1));
     sb1.setCharAt(sb1.length()-1 , ch);

     //replacing the new word in the new word in the StringBuffer object
     sb.replace(j,j+=sb1.length() , sb1.toString());

     if(j==sb.length())
      break;

      //to find the next word
      while(sb.charAt(j)==' ')
      {
        j++;
        if(j==sb.length())
         break abc ;
      }
    }
    System.out.println("The Modifed Sentence ........"+sb);
  }
}

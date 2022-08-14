package XI_Class;
import java.util.*;
public class selec_sort
{
    public static void main()
    {
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter a sentence...");
        String s=obj.nextLine();
        s=s.toUpperCase();
        System.out.println("Original Sentence...   " + s);
        StringTokenizer st=new StringTokenizer(s);
        int c=st.countTokens();

        String arr[]=new String[c];     

        for(int i=0;i<c;i++)
        {
            arr[i]=st.nextToken(); 
        }
        
        System.out.println("Before Sorting");
        for(int i=0;i<arr.length;i++)
        {
            System.out.println(arr[i]);
        }
        //Exchange Selection sort
        for(int i=0;i<arr.length-1;i++)
        { 
           String min = arr[i];
           int pos = i ;
           for(int j = i+1 ; j<arr.length ; j++)
           { if(min.compareTo(arr[j]) > 0)
               { min = arr[j];
                  pos=j;
                }
           }
           String t = arr[i];
           arr[i]=min;
           arr[pos]=t;
        }
        System.out.println("After Sorting");
        for(int i=0;i<arr.length;i++)
        {
            System.out.println(arr[i]);
        }
    }
}

package XI_Class.Strings;
import java.util.*;
//A Program to accept a sentence and a word and convert to uppercase. Search for the word in the sentence 
//using binary search

public class BinarySearchWords
{//start of class
    public static void main()
    {//start of main()
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
        System.out.println("Enter the word to be searched for...");
        String w=obj.nextLine().toUpperCase();
        System.out.println("Word...   " + w);
        //Bubble Sort in ascending order

        for(int i=0;i<arr.length-1;i++)
        {
            for(int j=0; j<arr.length-1-i;j++)
            {
                if(arr[j].compareTo(arr[j+1])>0)
                {
                    String t=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=t;
                }
            }
        }
        System.out.println("After Sorting");
        for(int i=0;i<arr.length;i++)
        {
            System.out.println(arr[i]);
        }

        //Binary search for array in ascending order
        int l=0,u=arr.length-1,mid=0;
        while(l<=u)
        {
            mid=(l+u)/2;
            if(w.compareTo(arr[mid])==0)
            {
                System.out.println(w + " is found in the sentence "+s);
                break;
            }
            else  if(w.compareTo(arr[mid])>0)
            {
                l=mid+1;     
            }
            else
            {
                u=mid-1;
            }

        }
        if(l>u)
            System.out.println(w + " is not found in the sentence "+s);   

    }//end of main()
}//end of class


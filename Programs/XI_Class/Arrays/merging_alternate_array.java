package XI_Class.Arrays;
import java.util.*;
public class merging_alternate_array
{
    public void main()
    { 
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length of first array");
        int len = sc.nextInt();
        int arr[]=new int[len];
        System.out.println("Enter length of second array");
        int len1 = sc.nextInt();
        int brr[]=new int[len1];
        int crr[] = new int[len+len1];
        for(int i1 = 0 ; i1<arr.length ; i1++)
        { System.out.println("Enter element at position for array 1...."+(i1+1));
            arr[i1]=sc.nextInt();
        }
        for(int i1 = 0 ; i1<brr.length ; i1++)
        { System.out.println("Enter element at position for array 2...."+(i1+1));
            brr[i1]=sc.nextInt();
        }
        System.out.println("First array"); 
        for(int i1 = 0 ; i1<arr.length ; i1++)
        { //System.out.println("Element at position...."+(i1+1));
          System.out.println(arr[i1]);
        }
        System.out.println("Second  array"); 
        for(int i1 = 0 ; i1<brr.length ; i1++)
        { //System.out.println("Element at position...."+(i1+1));
          System.out.println(brr[i1]);
        }
        int i,j,k;
        i=j=k=0;
        for(;i<Math.min(arr.length , brr.length);i++,j++)
        { crr[k]=arr[i];
          k++;
          crr[k]=brr[j];
          k++;
        }
        if(arr.length > brr.length)
        { for(;i<arr.length;i++,k++)
            crr[k]=arr[i];
        }
        else if(brr.length > arr.length)
        { 
            for(;j<brr.length;j++,k++)
             crr[k]=brr[j];
      
        }
       
        System.out.println("Merged  array"); 
        for(int i1 = 0 ; i1<crr.length ; i1++)
        { //System.out.println("Element at position...."+(i1+1));
          System.out.println(crr[i1]);
        }
    }
}

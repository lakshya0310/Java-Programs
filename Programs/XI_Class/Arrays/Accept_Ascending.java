package XI_Class.Arrays;
import java.util.*;
public class Accept_Ascending
{
    public void main()
    {   Scanner sc = new Scanner(System.in);
        int arr[] = new int[5];
        System.out.println("Enter first element of array");
        arr[0] = sc.nextInt();
        int c = 1;
        for(;c<arr.length;)
        { int x = sc.nextInt();
            int k = 0 ;
            while(k<c)
            { if(x<arr[k])
                break;
              else
                k++;
            }
            for(int j = c ; j<k ; j--)
            { arr[j]=arr[j-1];
            }
            arr[k]=x ;
            c++;
        }
         System.out.println("The Array is");
        for(int i = 0;i<arr.length;i++)
        { 
            System.out.println(arr[i]);
        }
    }
}

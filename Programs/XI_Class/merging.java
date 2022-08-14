package XI_Class;

import java.util.*;
/**
 * WAP to merge the given two array A and B and finally sort it using insertion sort
 * Eg: A: 1 4 5 6
 * B: 2 1 3
 * C: 1 4 5 6 3 1 2
 * Output: 1 1 2 3 4 5 6 
 */
public class merging
{
    public void main()
    { Scanner sc = new Scanner(System.in);
        int arr[]=new int[5];
        System.out.println("Enter elements for first array");
        for(int i = 0 ; i<arr.length;i++)
        { System.out.println("Enter element at postion..."+(i+1));
            arr[i]=sc.nextInt();
        } 
        int brr[]=new int[5];
        System.out.println("Enter elements for second array");
        for(int i = 0 ; i<arr.length;i++)
        { System.out.println("Enter element at postion..."+(i+1));
            brr[i]=sc.nextInt();
        }
        int crr[]=new int[10];
        for(int i = 0 ; i<arr.length;i++)
        { crr[i]=arr[i];
        }
        int k = arr.length;
        for(int j = brr.length-1 ; j >=0 ; j--)
        { crr[k]=brr[j];
            k++;
        }
        for(int i = 0 ; i<crr.length;i++)
        { 
            System.out.println(crr[i]);
        }
        for(int i = 1;i<crr.length;i++)
        { int temp = crr[i];
            int j = i -1;
            while(j>=0 && crr[j]>temp)
            { crr[j+1]=crr[j];
                j--;
            }
            crr[j+1]=temp;
            
        }
        for(int i = 0 ; i<crr.length;i++)
        { 
            System.out.println(crr[i]);
        }
    }
}

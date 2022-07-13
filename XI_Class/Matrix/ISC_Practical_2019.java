package XI_Class.Matrix;
/**Write a program to declare a single dimensional array a[ ] and a square matrix b[ ] [ ] of 
size N, where N>2 and N<10. Allow the user to input positive integers into the single 
dimensional array.
Perform the following tasks on the matrix:
(a) Sort the elements of the single dimensional array in ascending order using any 
standard sorting technique and display the sorted elements. 
(b) Fill the square matrix b[ ][ ] in the following format.
If the array a[ ] = { 5, 2, 8, 1 } then, after sorting a[ ] = {1, 2, 5, 8}
Then, the matrix b[ ][ ] would fill as below:
1 2 5 8
1 2 5 1
1 2 1 2
1 1 2 5
(c) Display the filled matrix in the above format. 
Test your program for the following data and some random data: 
Example 1
INPUT: N = 3
ENTER ELEMENTS OF SINGLE DIMENSIONAL ARRAY: 3 1 7 
OUTPUT: SORTED ARRAY: 1 3 7
FILLED MATRIX

1 3 7
1 3 1
1 1 3

Example 2
INPUT: N = 13

OUTPUT: MATRIX SIZE OUT OF RANGE
Example 3
INPUT: N = 5
ENTER ELEMENTS OF SINGLE DIMENSIONAL ARRAY: 10 2 5 23 6 
OUTPUT: SORTED ARRAY: 2 5 6 10 23
FILLED MATRIX 

2 5 6 10 23
2 5 6 10 2
2 5 6 2 5
2 5 2 5 6
2 2 5 6 10
 */
import java.util.*;
public class ISC_Practical_2019
{
    public void main()
    { Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of 1-D Array");
        int N = sc.nextInt();
        if(N>2&&N<10)
        {int arr[] = new int[N];
            System.out.println("Enter " +N+" in a Array");
            for(int i = 0 ; i<arr.length ; i++)
            { System.out.println("Enter element at position...."+(i+1));
                arr[i]=sc.nextInt();
            }    
            for(int i = 0 ; i<arr.length-1 ; i++)
            { 
                for(int j = 0 ; j<arr.length-1-i ; j++)
                { if(arr[j]>arr[j+1])
                    { int t = arr[j];
                        arr[j] = arr[j+1];
                        arr[j+1] = t;
                    }
                }
            }
             System.out.print("SORTED ARRAY : ");
             for(int i = 0 ; i<arr.length ; i++)
              System.out.println(arr[i]+" ");
            int brr[][] = new int[N][N];
            for(int i = 0 ; i<brr.length;i++)
            { int k = 0;
                int l = 0;
                for(int j = 0 ; j<brr[i].length;j++)
                { if(i+j<=arr.length-1)
                        brr[i][j]=arr[k++];
                    else
                        brr[i][j]=arr[l++];
                }
            }
            System.out.println("The Matrix");
            for(int i = 0 ; i<N ; i++)
            { for(int j = 0 ; j<N ; j++)
                {
                    System.out.print(brr[i][j]+"\t");
                }
                System.out.println();
            }
        }
        else
            System.out.println("Invalid Input");
    }
}

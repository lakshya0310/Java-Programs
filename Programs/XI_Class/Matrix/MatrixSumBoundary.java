package XI_Class.Matrix;
/** WAP to accept a m*n matrix and print the sum of boundary elements of a matrix */
import java.util.*;
public class MatrixSumBoundary
{   
    int arr[][];
    void acceptMatrix()
    { Scanner sc = new Scanner(System.in);
       System.out.println("Enter the number of rows and columns ");
       int m = sc.nextInt();
       int n = sc.nextInt();
       arr = new int[m][n];
       
       System.out.println("Enter "+ m*n + " numbers in the matrix");
       for(int i=0;i<arr.length;i++)
       {
           for(int j=0;j<arr[i].length;j++)
           {
               System.out.println("Enter element at row..."+(i+1)+"and column.."+(j+1));
               arr[i][j]=sc.nextInt();
            }
        }
        
    }
    void displayMatrix()
    {
        System.out.println("The Matrix");
        for(int i = 0 ; i<arr.length ; i++)
        { for(int j = 0 ; j<arr[i].length ; j++)
            {
                System.out.print(arr[i][j]+"\t");
            }
            System.out.println();
        }
    }
    void sumBoundary()
    {
        int sum=0;
        //sum of elements of the first row
         for(int j = 0 ; j<arr[0].length ; j++)
            {
                sum = sum+arr[0][j];
            }
           
            //sum of elements of the last row
        for(int j = 0 ; j<arr[arr.length-1].length ; j++)
            {
                sum = sum+arr[arr.length-1][j];
            }
            
            //sum of elements of first column except the corner elements
        for(int i=1 ; i<arr.length-1;i++)
        { 
            sum = sum + arr[i][0];
        }
        
        //sum of elements of last column except the corner elements
        for(int i=1 ; i<arr.length-1;i++)
        { 
            sum = sum + arr[i][arr[i].length-1];
        }
        System.out.println("The sum of boundary elements is "+sum);
    }
    void main()
    {
        acceptMatrix();
        displayMatrix();
        sumBoundary();
    }
}

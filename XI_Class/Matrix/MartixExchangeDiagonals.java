package XI_Class.Matrix;
/** WAP to accept a m*n matrix and exchange the diagonal of the matrix */
import java.util.*;
public class MartixExchangeDiagonals
{
    int arr[][];
    void acceptMatrix()
    { Scanner sc = new Scanner(System.in);
       System.out.println("Enter the number of rows and columns ");
       int m = sc.nextInt();
       arr = new int[m][m];
       
       System.out.println("Enter "+ m*m + " numbers in the matrix");
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
    void exchangeDiagonal()
    {
       for(int i = 0 ; i<arr.length ; i++)
       { int t = arr[i][i];
          arr[i][i] = arr[i][arr.length-i-1];
          arr[i][arr.length-i-1] = t;
       }
    }
    void main()
    {
        acceptMatrix();
        displayMatrix();
        exchangeDiagonal();
        displayMatrix();
    }
    
}

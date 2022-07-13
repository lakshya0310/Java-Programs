package XI_Class.Matrix;
import java.util.*;
public class MatrixRowSumColumnSum
{
    public void main()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of rows and columns");
        int m = sc.nextInt();
        int n = sc.nextInt();
        int arr[][] = new int[m][n];
        for(int i = 0 ; i<m ; i++)
        { for(int j = 0 ; j<n ; j++)
            {  System.out.println("Enter element in row..."+(i+1)+"  and column..."+(j+1));
                arr[i][j] = sc.nextInt();
            }
        }
        int sum = 0;
        System.out.println("The Matrix------------"+"\t Sum of Rows");
        for(int i = 0;i<arr.length;i++)
        { 
            sum = 0;
            for(int j = 0;j<arr[i].length;j++)
            { sum=sum+arr[i][j];
                System.out.print(arr[i][j]+" "); 
            }
            System.out.print("\t"+sum);
            System.out.println();
        }
        System.out.println("Sum of columns");
        for(int j = 0;j<n;j++)
        { 
            sum = 0;
            for(int i = 0;i<m;i++)
            { sum=sum+arr[i][j];
               
            }
            System.out.print(sum+" ");
        }
    }
}

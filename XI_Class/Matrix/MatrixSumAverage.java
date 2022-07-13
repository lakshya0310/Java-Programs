package XI_Class.Matrix;
import java.util.*;
public class MatrixSumAverage
{
    public void main()
    { Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of rows and columns");
        int m = sc.nextInt();
        int n = sc.nextInt();
        int arr[][] = new int[m][n];
        int sum = 0 ;
        System.out.println("Enter Elements of the array");
        for(int i = 0 ; i<m ; i++)
        { for(int j = 0 ; j<n ; j++)
            { System.out.println("Enter the element at "+(i+1)+" row and "+(j+1)+" column");
                arr[i][j] = sc.nextInt();
                sum = sum+arr[i][j];
            }
        }
        System.out.println("The Matrix");
        for(int i = 0 ; i<m ; i++)
        { for(int j = 0 ; j<n ; j++)
            { System.out.print(arr[i][j]+"\t");
            }
            System.out.println();
        }
        System.out.println("The sum : "+sum);
        System.out.println("The Average :"+(sum/(m*n)));
    }
}

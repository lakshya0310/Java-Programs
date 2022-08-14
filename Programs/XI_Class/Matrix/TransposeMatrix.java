package XI_Class.Matrix;
import java.util.*;
public class TransposeMatrix
{
    public void main()
    { 
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows and columns");
        int m = sc.nextInt();
        int n = sc.nextInt();
        int arr[][] = new int[m][n];
        System.out.println("Enter Elements of the array");
        for(int i = 0 ; i<m ; i++)
        { for(int j = 0 ; j<n ; j++)
            { System.out.println("Enter the element at "+(i+1)+" row and "+(j+1)+" column");
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println("The Matrix");
        for(int i = 0 ; i<m ; i++)
        { for(int j = 0 ; j<n ; j++)
            {
                System.out.print(arr[i][j]+"\t");
            }
            System.out.println();
        }
        int brr[][] = new int[n][m];
        for(int i = 0 ; i<n ; i++)
        { for(int j = 0 ; j<m ; j++)
            { brr[i][j] = arr[j][i];
            }
        }
        System.out.println("The Tranpose Matrix");
        for(int i = 0 ; i<n ; i++)
        { for(int j = 0 ; j<m ; j++)
            {
                System.out.print(brr[i][j]+"\t");
            }
            System.out.println();
        }

    }
}

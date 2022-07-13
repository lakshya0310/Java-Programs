package XI_Class.Matrix;
import java.util.*;
public class SymmetricMatrix
{
    public void main()
    {  Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows and columns");
        int m = sc.nextInt();
        int n = sc.nextInt();
        if(m!=n)
            System.out.println("Not a Symmetric matrix");
        else
        { int arr[][] = new int[m][n];
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
            boolean flag = true ; 
            matrix :
            for(int i = 0 ; i<arr.length ; i++)
            { for(int j = 0 ; j<arr[i].length ; j++)
                    if(arr[i][j] != arr[j][i] )
                    {flag =false;
                        break matrix;
                    }
            }
            if(flag)
            System.out.println("Matrix is a Symmetric matrix ");
            else
            System.out.println("Matrix is not a Symmetric matrix ");
        }
    }
}

package XI_Class.Matrix;
import java.util.*;
public class UnitMatrix
{
    public void main()
    {   Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows and columns");
        int m = sc.nextInt();
        int n = sc.nextInt();
        if(m==n)
        {   int arr[][] = new int[m][n];
            System.out.println("Enter Elements of the array");
            for(int i = 0 ; i<m ; i++)
            { for(int j = 0 ; j<n ; j++)
                { System.out.println("Enter the element at "+(i+1)+" row and "+(j+1)+" column");
                    arr[i][j] = sc.nextInt();
                }
            }
            int k = 0 ;
            System.out.println("The Matrix");
            for(int i = 0 ; i<m ; i++)
            { for(int j = 0 ; j<n ; j++)
                {   if(i==j && arr[i][j]!=1)
                        k=1;
                    else if(i!=j && arr[i][j]!=0)
                        k=1;
                    System.out.print(arr[i][j]+"\t");
                }
                System.out.println();
            }
            System.out.println();
            if(k==0)
            System.out.println("Matrix is a unit matrix");
            else
            System.out.println("Matrix is a unit matrix");
            
        }
        else
        System.out.println("Not a unit matrix");
    }
}

package XI_Class.Matrix;
//WAP to accept a square matrix of size m , replace all elemnts of diagonal with zero
import java.util.*;
public class SquareMatrixDiagonalZero
{
    public void main()
    {  Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows and columns");
        int m = sc.nextInt();
        int arr[][] = new int[m][m];
        System.out.println("Enter "+(m*m)+" elements of the matrix");
        for(int i = 0 ; i<m ; i++)
        { for(int j = 0 ; j<m ; j++)
            { System.out.println("Enter the element at "+(i+1)+" row and "+(j+1)+" column");
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println("The Original Matrix");
            for(int i = 0 ; i<m ; i++)
            { for(int j = 0 ; j<m ; j++)
                {   
                    System.out.print(arr[i][j]+"\t");
                }
                System.out.println();
            }
            for(int i = 0 ; i<arr.length ; i++)
            { 
                for(int j = 0;j<arr[i].length ;j++)
                { if(i==j || i+j==arr.length-1)
                    arr[i][j]=0;
                }
            }
            System.out.println("The Modified Matrix");
            for(int i = 0 ; i<m ; i++)
            { for(int j = 0 ; j<m ; j++)
                {   
                    System.out.print(arr[i][j]+"\t");
                }
                System.out.println();
            }
    }
}

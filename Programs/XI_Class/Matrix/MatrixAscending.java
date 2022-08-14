package XI_Class.Matrix;
import java.util.*;
public class MatrixAscending
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
        int k =0;
        int brr[]= new int[m*n];
        for(int i = 0 ; i<m ; i++)
        { for(int j = 0 ; j<n ; j++)
            {  brr[k]=arr[i][j];
                k++;
            }
        }
        for(int i = 0 ; i<brr.length-1 ; i++)
        {
            for(int j = 0 ; j<brr.length-i-1 ;j++)
            { if(brr[j]>brr[j+1])
                { int t = brr[j+1];
                    brr[j+1] = brr[j];
                    brr[j]=t;
                }
            }
        }
        k=0;
        for(int i = 0 ; i<m ; i++)
        { for(int j = 0 ; j<n ; j++)
            {  arr[i][j]=brr[k];
                k++;
            }
        }
        System.out.println("The sorted Matrix");
        for(int i = 0 ; i<m ; i++)
        { for(int j = 0 ; j<n ; j++)
            {  System.out.print(arr[i][j]+" ");
                
            }
            System.out.println();
        }
    }
}

package XI_Class.Matrix;
//WAP to accept m*n integers in a matrix and rearrange the elements of each columns in descending order
import java.util.*;
public class MatrixColumnsDescending
{ 
    public void main()
    {   Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows and columns");
        int m = sc.nextInt();
        int n = sc.nextInt();
        int arr[][] = new int[m][n];
        System.out.println("Enter "+(m*n)+" elements of the matrix");
        for(int i = 0 ; i<m ; i++)
        { for(int j = 0 ; j<n ; j++)
            { System.out.println("Enter the element at "+(i+1)+" row and "+(j+1)+" column");
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println("The Original Matrix");
            for(int i = 0 ; i<m ; i++)
            { for(int j = 0 ; j<n ; j++)
                {   
                    System.out.print(arr[i][j]+"\t");
                }
                System.out.println();
            }
        int brr[]=new int[m];
        for(int j=0 ; j<n ; j++)
        {   int k=0;
            for(int i=0 ; i<m ; i++)
            { brr[k++] = arr[i][j];
            }
            bubbleSort(brr); 
            k=0;
            for(int i=0 ; i<m ; i++)
            { arr[i][j]=brr[k++] ;
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
    }

    void bubbleSort(int brr[])
    { for(int i = 0 ; i<brr.length-1 ; i++)
        { 
            for(int j = 0 ; j<brr.length-1-i ; j++)
            { if(brr[j]<brr[j+1])
                { int t = brr[j];
                    brr[j] = brr[j+1];
                    brr[j+1] = t;
                }
            }
        }
    }
}

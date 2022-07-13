package XI_Class.Matrix;
import java.util.*;
public class Print_Matrix
{
    int arr[][];
    int n;
    public void main()
    {   Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of n");
        n = sc.nextInt();
        arr = new int[n][n];
         accept();
         print();
    }
    void accept()
    { Scanner sc = new Scanner(System.in);
       for(int i = 0 ; i<n;i++)
        { for(int j=0;j<n;j++)
          { arr[i][j] = sc.nextInt();
          }
        }
    }
     void print()
    { 
        System.out.println("The matrix is...");
        for(int i = 0 ; i<n;i++)
        { for(int j=0;j<n;j++)
          { System.out.print(arr[i][j] + "   ");
              
          }
          System.out.println();
        }
    }
}

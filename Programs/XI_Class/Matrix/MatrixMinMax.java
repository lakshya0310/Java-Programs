package XI_Class.Matrix;
import java.util.*;
public class MatrixMinMax
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
        int min , max ;
        max = min = arr[0][0];
        for(int i = 0 ; i<m ; i++)
        { for(int j = 0 ; j<n ; j++)
            { max = Math.max(max,arr[i][j]);
                min = Math.min(min,arr[i][j]);
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
        System.out.println("The Maximum element is "+max+" is found at ");
        System.out.println("Row\t\tColumn");
        for(int i = 0 ; i<m ; i++)
        { for(int j = 0 ; j<n ; j++)
            { if(arr[i][j]==max)
                    System.out.println((i+1)+"\t"+(j+1));
            }
        }
        System.out.println("The Minimum element is "+min+" is found at ");
        System.out.println("Row\t\tColumn");
        for(int i = 0 ; i<m ; i++)
        { for(int j = 0 ; j<n ; j++)
            { if(arr[i][j]==min)
                    System.out.println((i+1)+"\t"+(j+1));
            }
        }
    }
}

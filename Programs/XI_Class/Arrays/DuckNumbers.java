package XI_Class.Arrays;
/**
 *  A number which has zero in it, is a duck number
Write a class DuckNumbers as per the following specifications:

Data member/instance variables
int arr[];

Member Methos/Constructors
DuckNumbers(int size): Create the array with the given size
void acceptArray(): Accept the Array
void displayArray(): Display the array
String isDuckNumber(int x) : Returns "YES" if x is a duck number, if not returns a "NO"
void maxMinDuckNumbers(): Print the maximum and the minimum ducknumbers in the array
void printDuckNumbers(): Print the duck numbers in the array.
void main() : Create an object , and all the above methods
 */
import java.util.*;
public class DuckNumbers
{
    int arr[];
    DuckNumbers(int size)
    { 
        arr = new int[size];
    }

    void acceptArray()
    { Scanner sc  = new Scanner(System.in);
        System.out.println("Enter "+arr.length+" numbers in a Array");
        for(int i=0;i<arr.length;i++)
        { System.out.println("Enter the element..."+(i+1));
            arr[i] = sc.nextInt();
        }
    }

    void displayArray()
    { 
        System.out.println("The Original Array");
        for(int i=0;i<arr.length;i++)
        { System.out.println(arr[i]);
        }
    }

    String isDuckNumber(int x)
    { int p=1; int t=x;
        while(x!=0)
        { p=p*(x%10);
            x/=10;
        }
        if(p==0 || t==0)
            return "YES";
        else 
            return "NO";
    }

    void printDuckNumbers()
    { System.out.println("Duck Numbers are..");
        for(int i = 0 ; i<arr.length ; i++)
        {if(isDuckNumber(arr[i]).equals("YES"))
                System.out.println(arr[i]);
        }
    }

    void maxMinDuckNumbers()
    { int brr[] = new int[arr.length];
        int k=0;
        for(int i = 0 ; i<arr.length ; i++)
        {if(isDuckNumber(arr[i]).equals("YES"))
            { brr[k]=arr[i];
                k++;
            }
        }
        if(k>0)
        {int max = brr[0] , min=brr[0];
            for(int i = 0 ; i<k ; i++)
            {max=Math.max(max,brr[i]);
                min = Math.min(min,brr[i]);
            }
            System.out.println("The Maximum Duck Number is...."+max);
            System.out.println("The Minimum Duck Number is...."+min);
        }
        else
        System.out.println("There are no Duck Numbers in the Array");
    }
    static void main()
    { Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int x = sc.nextInt();
        DuckNumbers obj = new DuckNumbers(x);
        obj.acceptArray();
        obj.displayArray();
        obj.printDuckNumbers();
        obj.maxMinDuckNumbers();
    }
}

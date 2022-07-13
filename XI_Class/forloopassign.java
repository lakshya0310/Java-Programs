package XI_Class;
import java.util.*;
public class forloopassign
{ 
    public void main()
    {   Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1 for symbol pattern");
        System.out.println("Enter 2 for number pattern");
        int n = sc.nextInt();
        switch(n)
        {   case 1:  
            for(int i = 1 ; i<=5 ; i++)
            { for(int j =1 ; j<=5 ; j++)
                { System.out.print("*");
                }
                System.out.println();
            }
            break;
            case 2:
            for(int i = 1 ; i<=5 ; i++)
            { for(int j = 9 ; j>=4+i ; j--)
                {System.out.print(j);
                }
                System.out.println();
            }
            break;
            default: System.out.print("Invalid Choice");
        }    
    }
}

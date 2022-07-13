package XI_Class.Numbers
;
import java.util.*;
public class Insert_pos //start of class
{ 
    public void main() //start of main method
    {   Scanner sc = new Scanner(System.in);
        System.out.println("Enter a array with 5 elements");
        int arr[]=new int[10],pos,n;
        int t=5;
        for(int i = 0 ; i<5 ; i++)
        { System.out.println("Enter element at position...."+(i+1));
            arr[i]=sc.nextInt();
        }
        char ch = 'y' ; 
        mainloop :
        while(ch=='y' || ch=='Y') //loop to insert element
        { System.out.println("Enter position at which element needs to be inserted");
            pos=sc.nextInt();
            System.out.println("Enter element to be inserted");
            n=sc.nextInt(); 
            if(pos<1||pos>(t+1))
            { System.out.println("Invalid position");
                continue mainloop;
            }
            else
            { if(pos==(t+1))
               { arr[pos-1]=n;
                    for(int i = 0 ; i<t ; i++)
                    { System.out.println("Element at position...."+(i+1));
                        System.out.println(arr[i]);
                    }
                }
                else
                { for(int i = t ; i>(pos-1) ; i--)
                    { arr[i]=arr[i-1];
                    }
                    arr[pos-1]=n;
                    t++;
                    if(t==arr.length) //array is full
                        break;
                    sc.nextLine();
                    for(int i = 0 ; i<t ; i++)
                    { System.out.println("Element at position...."+(i+1));
                        System.out.println(arr[i]);
                    }
                    while(true)
                    { 
                        System.out.println("Do you wish to Continue.....(Y/y/N/n)");
                        ch=sc.nextLine().charAt(0);
                        if(ch=='y' || ch=='Y')
                            continue mainloop;
                        else if(ch=='N' || ch=='n')
                            break mainloop;
                        else
                        { 
                            System.out.println("Invalid! Please enter only Y/y/n/N ");
                            continue;
                        }
                    }
                }
            }
        }
    }  //end of main method
} //end of class

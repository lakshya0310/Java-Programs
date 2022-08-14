package XI_Class.Project;

// 2015 Question 9
// A class Merger concatenates two positive integers that are greater tan 0 and produces a new merged integer.
// Example:  if the first number is 23 and the second is 764, then the concatenated number will be 23764.
// Some of the members of the class are given below:

// Member Variables/Data Members:
// long n1;
// long n2;
// long mergNum;

// Member methods:
// Merger()    Default Constructor to initialize data members.
// void readNum()    To accept the valid values for n1 and n2.
// void joinNum()    To concatenate the numbers n1 and n2 and store it in mergNum.
// Void show()    To display the original number and the merged number with appropriate messages.
// void main()    Create the object of the class.
// Call the methods as per the requirement.

// 
import java.util.*;
public class Merger2015Q9
{ //start of class
    //member variables
    long n1;
    long n2;
    long mergNum;

    /*#default constructor*/
    Merger2015Q9()
    { 
        n1=n2=mergNum=0L;

    }

    void readNum()
    {  /*#To accept the valid values for n1 and n2*/
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 2 numbers...");
        n1 = sc.nextLong();
        n2 = sc.nextLong();
        if( n1<=0 || n2<=0)
        { System.out.println("Error");
          return; 
        }
    }
    void joinNum()
    {
        int c = 0;
        long t= n2;
        
        while(t!=0)
        {
            c++;
            t=t/10;
        }
        
        mergNum = n1*(int)Math.pow(10,c) + n2;
    }
    void show()
    { 
       System.out.println(" The First Number " +n1);
       System.out.println(" The Second Number : "+n2);
       System.out.println(" The Merged Number :  "+mergNum);
    }
    void main()
    { Merger2015Q9 obj = new Merger2015Q9();
        obj.readNum();
        if(obj.n1<= 0 || obj.n2<=0)
         {System.out.println("Please Enter a positve number ");
          }
         else
         {obj.joinNum();
          obj.show();
         }
    }
}

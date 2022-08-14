package XI_Class;
import java.util.*;
public class switch_case
{    void main()
   { Scanner sc = new Scanner(System.in);
     System.out.println("Enter basic salary of teacher");
     double basic = sc.nextDouble();
     System.out.println("1. Post Graduate Teacher \n2.Trained Graduate Teacher \n3.Primary Teacher");
     System.out.println("Enter your choice");
     int ch = sc.nextInt();
     double Gross = 0.0;
     double DA , HRA , CTA;
     switch(ch)
     { case 1: DA = 0.3*basic;
               HRA = 0.2*basic;
               CTA = 0.1*basic;
               Gross = basic + DA + HRA + CTA ;
               break;
       case 2: DA = 0.25*basic;
               HRA = 0.15*basic;
               CTA = 0.05*basic;
               Gross = basic + DA + HRA + CTA ;
               break;
       case 3: DA = 0.2*basic;
               HRA = 0.1*basic;
               Gross = basic + DA + HRA;
               break;  
       default: System.out.println("Invalid Choice");        
     }
     System.out.println("The Gross salary of teacher is Rs."+Gross);
   }
}

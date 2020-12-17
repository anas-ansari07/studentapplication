
/**
 * Write a description of class student here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;

public class student
{
    private String firstname;
    private String lastname;
    private int Year;
    private String StudentId;
    private String subject;
    private int tBalance=0;
    private static int costofSub = 500;
    private static int id = 1000;
    private int n;
    
    // ask user to enter student name and year
       public student()
       {
           Scanner in = new Scanner(System.in);
           System.out.println("enter Student first name:");
           this.firstname = in.nextLine();
           System.out.println("enter Student last name");
           this.lastname = in.nextLine();
           System.out.println("\n1.Below 10th\n2.10th\n3.12\n4.Graduation\nEnter Student present grade");
           this.Year = in.nextInt();
           System.out.println("NAME:-"+ ""+ firstname + "" + lastname);
           System.out.println("GRADE YEAR:-" + "" + Year); 
           
            setStudentId();
            System.out.println("ID:-"+StudentId);
        }
    //generate an ID
      private void setStudentId()
      {
          id++;
          this.StudentId = Year + "" + id;
       }    
    //enroll in course
      public void enroll()
      {
         do
         {
          System.out.println("Enter subject to enroll(Q to quit)");
          Scanner in = new Scanner(System.in);
          String subjects = in.nextLine();
            if(!subjects.equals("Q")){
                 subject = subject + "\n" + subjects;
            
            tBalance = tBalance + costofSub;
           }
            else{
                break;
            }
        }while(1 !=0);
        System.out.println("enrolled in " + "" + subject);
         //System.out.println("TUTION BALANCE" + "" + tBalance);
        }  
    //view balance
    
    
    public void viewBalance()
    {
        System.out.println("Your Balance:-" + "" + tBalance);
    }   
    //pay tution fees
    public void payTution()
    {
        Scanner in = new Scanner(System.in);
        System.out.println("enter your amount");
        
        int payment = in.nextInt();
        System.out.println("You Paid:-" + payment);
        System.out.println("Thank you for payment");
        tBalance = tBalance - payment;
        
        viewBalance();
    }   
    
    //show status
    public String showStatus()
    {
        return "NAME:-" + "" + firstname + "" + lastname + "\n" +
               "COURSES ENROLLED:-" + "" + subject + "\n" +
               "GRADE LEVEL:-" + "" + Year + "\n" +
               "STUDENT ID:-" + "" + StudentId + "\n" + 
               "BALANCE:-" + "" + tBalance ;
    
     }
}

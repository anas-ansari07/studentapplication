import java.util.Scanner;
/**
 * Write a description of class studentDataBaseapp here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class studentDataBaseapp
{
    public static void main(String[] args)
    {
      //  student s = new student();
     //   s.enroll();
     //   s.payTution();
      //  System.out.println(s.showStatus());
        
        
        //ask for no of students to add
        System.out.println("Enter no. of students to enroll");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        
        student[] s = new student[n];
        
        //create no of new student
        for(int i=0;i<n;i++)
        {
        s[i] = new student();
        s[i].enroll();
        s[i].payTution();
        System.out.println(s[i].showStatus());
        }
    }
}    
   
import java.util.*;

class Grade
 {
    public static void main(String args[])
     {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter marks for three subjects:");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        double avg = (a+b+c) / 3;

        String g;
        if (avg >= 85 && avg <= 100)
        {
            g = "O";
        } 
        else if (avg <= 84 && avg >= 75) 
        {
            g = "A+";
        }
        else if (avg <= 74 && avg >= 65)
       {
            g = "A";
        }
        else if (avg <= 64 && avg >= 55)
        {
            g = "B+";
        } 
        else if (avg <=50  && avg >= 45)
        {
            g = "B";
        } 
        else if (avg <=44  && avg >= 40)
        {
            g = "C+";
        } 
        else if (avg <=39  && avg >= 35)
        {
            g = "C" ;
        } 
        else 
        {
            g = "F";
        }

        System.out.println("Average Marks: " + avg);
        System.out.println("Grade: " + g);
    }
}

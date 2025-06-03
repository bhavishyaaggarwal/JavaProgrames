import java.util.*;
class Trainseat 
{
    public static void main(String args[]) 
     {
       Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the seat number: ");
        int n = sc.nextInt();
        int place = n % 8;
        switch (place)
           {
            case 1:
                System.out.print("seat type :- ROW 1 lower ");
                break;
            case 2:
                System.out.print("seat type :- ROW 1 middle ");
                break;
            case 3:
                System.out.print("seat type :- ROW 1 upper ");
                break;
            case 4:
                System.out.print("seat type :- ROW 2 lower");
                break;
            case 5:
                System.out.print("seat type :- ROW 2 middle");
                break;
            case 6:
                System.out.print("seat type :- ROW 2 upper");               
                break;
            case 7:
                System.out.print("seat type :- side lower");
                break;
            case 0:
                System.out.print("seat type :- side upper");
                break;
            default:
                System.out.print("Wrong Choice");
                break;
        }
    }
}

import java.util.Scanner;

public class LeapYearCalculator {
    public static void main(String[] args) {
        boolean carryOn = true;
        
        while (carryOn) {
            Scanner myObj = new Scanner(System.in);
            System.out.print("Enter a year: ");
            
            int year = myObj.nextInt();
            //myObj.close();

            if (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0)) {
                System.out.println(year + " is a leap year \n");
            }
            else {
                System.out.println(year + " is not a leap year \n");
            }
        }
    }
}

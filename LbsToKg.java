import java.util.Scanner;

public class LbsToKg {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.print("Enter a weight in lbs: ");

        double lbs = myObj.nextDouble();
        myObj.close();
        double kg = lbs / 2.204622622;
        System.out.println(lbs + "lbs is " + kg + "kg");
    }
}
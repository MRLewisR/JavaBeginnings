import java.util.Scanner;

public class AgeInformation {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.print("Enter your age: ");

        int age = myObj.nextInt();
        myObj.close();

        if (age > 20) {
            System.out.println("You are older than 20");
        }
        if (age < 85) {
            System.out.println("You are younger than 85");
        }
        if (age > 30 && age < 40) {
            System.out.print("You are older than 30 and younger than 40");
        }
    }
}